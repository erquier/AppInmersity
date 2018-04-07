$(function() {
    $('#clickeame').click(function() {
        $.ajax({
            url: '/infinity-war',
            success: function(res) {
                console.log(res);
                $('#titulo').text(res.name);
                $('#ano').text(res.year);
                $('#generos').text('');
                for(var i = 0; i < res.genres.length; i++) {
                    var genre = res.genres[i];
                    $('#generos').append(
                        '<li>' + genre + '</li>'
                    );
                }

                $('#actores').text('');
                for(var i = 0; i < res.actors.length; i++) {
                    var actor = res.actors[i];
                    $('#actores').append(
                        '<li>' + actor.name + '</li>'
                    );
                }
            },
            error: function(err) {
                console.log(err);
            },
        });
    });
});