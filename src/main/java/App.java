import static spark.Spark.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

public class App {
	static Logger log = LoggerFactory.getLogger(App.class);
	public static ArrayList<Album> album = new ArrayList<>();
	public static boolean hasReadDBCookie = false;
	 
    public static void main(String[] args) {
    	Gson gson = new Gson();
    	staticFiles.location("/public");
    	
    	
    	before((req, res) -> {
    		if (!hasReadDBCookie) {
    			@SuppressWarnings("deprecation")
    			String cookie = req.cookie("ajax");
    			if (cookie != null) {
        			String cookieValue = java.net.URLDecoder.decode(cookie);
        			album = gson.fromJson(cookieValue, album.getClass());
        			hasReadDBCookie = true;	
    			}
    		}
    	});
    	//Subir canciones
    	
    	get("/album", (req, res)->{
    		res.header("content-type", "application/json");
    		return album;
    		
    	}, gson::toJson);
    	
    	
    	get("/album", (req, res)->{
    		Album artista = new Album ("Post Malone", "Stoney", 2018 );
    	 	
    		//Artistas
    		Artist PostM = new Artist (" ", " ");
    		

    		 // HEADERS:
    		 res.header("content-type", "application/json");

    		 String shouldAdd = req.queryParamOrDefault("add", "false");
    		 Logger l = LoggerFactory.getLogger(App.class);
    		 l.info(shouldAdd);
    		 if (shouldAdd.equals("true")) {
    		 	artista.add(artista);
    		 	@SuppressWarnings("deprecation")
    		 	String cookieValue = java.net.URLEncoder.encode(gson.toJson(artista));
    		 	res.cookie("ajax", cookieValue);
    		 }
    		 return artista;

    		 }, gson::toJson);
    	 
    	});
  
  
    	
    	
    	
    	//LOGIN     
    	
    	get("/login", (req, res) ->{
    		res.status(200);
    		HashMap<String, Object> model = new HashMap<>();
    		ArrayList<User> lista1 = req.session().attribute("usuarios");
    		return new ModelAndView(model, "login.html");
    	}, new FreeMarkerEngine());
    	
    	
        post("/login", (req, res)-> {
        	res.status(200);
        	String name = req.queryParams("name");
        	String pass = req.queryParams("pass");
        	String email = req.queryParamOrDefault("email", "No-Definida");
        	HashMap<String, Object> model = new HashMap<>();
        	
        	User user = new User(name, pass, email);
        	ArrayList<User> lista1 = req.session().attribute("usuarios");
        	 if(lista1==null) {
        		
        		 lista1 = new ArrayList<User>();
        	 
        	 	}
        	lista1.add(user);
        	req.session().attribute("usuarios", lista1);
        	req.session().attribute("user", user);
        	return new ModelAndView(model, "login.ftl");
        	        	
        	 }, new FreeMarkerEngine());
        
    	
    	get("/home", (req, res) ->{
    		HashMap<String, Object> model = new HashMap<>();
    	return new ModelAndView(model, "home.ftl");
    	}, new FreeMarkerEngine());
    	


    }
}



/*get("/infinity-war", (req, res) -> {
Movie infinityWar = new Movie("Infinity War", 2018);
// ACTORES
Actor chrisE = new Actor("Chris Evans", 35);
chrisE.getRoles().add("Capitan America");

Actor scarlettJ = new Actor("Scarlett Johanson", 29);
scarlettJ.getRoles().add("Viuda Negra");

// AGREGANDO ACTORES A LA PELICULA
infinityWar.getActors().add(chrisE);
infinityWar.getActors().add(scarlettJ);

// GENEROS
infinityWar.getGenres().add("Accion");
infinityWar.getGenres().add("Emocion");

// HEADERS:
res.header("content-type", "application/json");

String shouldAdd = req.queryParamOrDefault("add", "false");
Logger l = LoggerFactory.getLogger(App.class);
l.info(shouldAdd);
if (shouldAdd.equals("true")) {
	movies.add(infinityWar);
	@SuppressWarnings("deprecation")
	String cookieValue = java.net.URLEncoder.encode(gson.toJson(movies));
	res.cookie("ajax", cookieValue);
}
return infinityWar;

}, gson::toJson);

get("/peliculas", (req, res) -> {
HashMap<String, Object> model = new HashMap<>();
return new ModelAndView(model, "peliculas.ftl");
}, new FreeMarkerEngine());*/