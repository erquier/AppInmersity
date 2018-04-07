function ShowHideNavbar() {

    var x = document.getElementById("main-container");
    if (x.style.width === "75%") {
        x.style.width = "100%";
    } else {
        x.style.width = "75%";
    }

    var z = document.getElementById("sidebar");
    if (z.style.display === "block") {
        z.style.display = "none";
    } else {
        z.style.display = "block";
    }


}
