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
	
	public static ArrayList<Album> album = new ArrayList<Album>();
	public static ArrayList<Artist> artistas = new ArrayList<Artist>();
	public static ArrayList<Songs> song = new ArrayList<Songs>();
	//public static boolean hasReadDBCookie = false;
	 
    public static void main(String[] args) {
    	Gson gson = new Gson();
    	staticFiles.location("/public");
    	port(12345);
    	
    	/*before((req, res) -> {
    		if (!hasReadDBCookie) {
    			@SuppressWarnings("deprecation")
    			String cookie = req.cookie("ajax");
    			if (cookie != null) {
        			String cookieValue = java.net.URLDecoder.decode(cookie);
        			artistas = gson.fromJson(cookieValue, artistas.getClass());
        			hasReadDBCookie = true;	
    			}
    		}
    	});*/
    	
//LOGIN     	
    	get("/register", (req, res) ->{
    	HashMap<String, Object> model = new HashMap<>();
    	res.status(200);
       	return new ModelAndView(model, "register.ftl");
    	}, new FreeMarkerEngine());
    	
    	
        post("/register", (req, res)-> {
        	HashMap<String, Object> model = new HashMap<>();
        	res.status(200);
        	
           	String name = req.queryParams("name");
        	String email = req.queryParams("email");
        	String pass = req.queryParams("pass");
            	
        	User usuario = new User(name, email, pass);
        	ArrayList<User> ListaUsuarios = new ArrayList<User>();

        	ListaUsuarios.add(usuario);
                	
        	req.session().attribute("usuarios", ListaUsuarios);
        	req.session().attribute("usuario", usuario);
        	
        	log.debug("usuario registrado:  [" + usuario.getName() +"  "+ usuario.getEmail() +"  "+ usuario.getPass() +"]");       	
        	
        	log.info("usuario registrado:  [" + usuario.getName() +"  "+ usuario.getEmail() +"  "+ usuario.getPass() +"]");       	
        	
        	res.redirect("/account");
        	
        return new ModelAndView(model, "register.ftl");
        }, new FreeMarkerEngine());
        
        
        
        
    	
        get("/", (req, res) ->{
        HashMap<String, Object> model = new HashMap<>();
        res.status(200);
        return new ModelAndView(model, "home.ftl");
        }, new FreeMarkerEngine());
        
    	get("/home", (req, res) ->{
    	HashMap<String, Object> model = new HashMap<>();
    	res.status(200);
    	return new ModelAndView(model, "home.ftl");
    	}, new FreeMarkerEngine());
    	
    	
    	
    	
    	
    	get("/account", (req, res) ->{
        HashMap<String, Object> model = new HashMap<>();
        res.status(200);
        
        model.put( "name" , "Java Spark" );
        model.put( "email" ,"javaspark@gmail.com" );
        
        return new ModelAndView(model, "account.ftl");
        }, new FreeMarkerEngine());
    	
    	
    	
    	
    	
    	get("/addnew", (req, res) ->{
        HashMap<String, Object> model = new HashMap<>();
        res.status(200);
        return new ModelAndView(model, "addnew.ftl");
        }, new FreeMarkerEngine());
    	
    	
    	post("/addnew", (req, res) ->{
        HashMap<String, Object> model = new HashMap<>();
        res.header("content-type", "application/json");
        res.status(200);
        	Album MyDearM = new Album("My Dear Melancholy","The Weeknd",2018,"USA");
        	
        	MyDearM.getArtist();
        	MyDearM.setArtist("The Weeknd");
        	MyDearM.getTitle();
        	MyDearM.setTitle("My Dear Melancholy");
        	MyDearM.getYear();
        	MyDearM.setYear(2018);
        	
        	Album stoney = new Album("Stoney","Post Malone",2018,"USA");
        	
        	stoney.getArtist();
        	stoney.setArtist("Post Malone");
        	stoney.getTitle();
        	stoney.setTitle("Stoney");
        	stoney.getYear();
        	stoney.setYear(2018);
        	
        	
        
        return new ModelAndView(model, "addnew.ftl");
        }, new FreeMarkerEngine());
        	
    		
        	
    	get("/artist", (req, res) ->{
        HashMap<String, Object> model = new HashMap<>();
        res.status(200);
        
        return new ModelAndView(model, "artist.ftl");
        }, new FreeMarkerEngine());
    	
    	post("/artist", (req, res) ->{
            HashMap<String, Object> model = new HashMap<>();
            res.header("content-type", "application/json");
            res.status(200);       
            Artist PostM = new Artist("hola");
            
            
            
            
            return new ModelAndView(model, "artist.ftl");
            }, new FreeMarkerEngine());
    	
    	
    	
    	
    	// HEADERS:
    	res.header("content-type", "application/json");

    	String shouldAdd = req.queryParamOrDefault("add", "false");
    	Logger l = LoggerFactory.getLogger(App.class);
    	l.info(shouldAdd);
    	if (shouldAdd.equals("true")) {
    		artistas.add(artists);
    		@SuppressWarnings("deprecation")
    		String cookieValue = java.net.URLEncoder.encode(gson.toJson(artistas));
    		res.cookie("ajax", cookieValue);
    	}
    	return artists;

    	}, gson::toJson);
    	    	
    	


    }
	
}



/*
	
    	 
get("/infinity-war", (req, res) -> {
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
}, new FreeMarkerEngine());

*/