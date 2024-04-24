/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.logging.Logger;

/**
 *
 * @author SAD
 */
public class Movie {
    private  String idMovie;
    private String nameMovie;
    private String priceMovie;
    private String idRoomMovie;
    private String director;
    private String url;
    //private float rateMovie;
    private static final Logger LOG = Logger.getLogger(Movie.class.getName());

    public Movie() {
    }

    public Movie(String idMovie, String nameMovie, String priceMovie, String idRoomMovie, String director, String url) {
        this.idMovie = idMovie;
        this.nameMovie = nameMovie;
        this.priceMovie = priceMovie;
        this.idRoomMovie = idRoomMovie;
        this.director = director;
        this.url = url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
    
//     public Movie( String nameMovie, String priceMovie, String idRoomMovie, String director) {
//        this.idMovie = idMovie;
//        this.nameMovie = nameMovie;
//        this.priceMovie = priceMovie;
//        this.idRoomMovie = idRoomMovie;
//        this.director = director;
//    }
//     
    public Movie(String idMovie, String nameMovie, String priceMovie, String idRoomMovie, String director) {
        this.idMovie = idMovie;
        this.nameMovie = nameMovie;
        this.priceMovie = priceMovie;
        this.idRoomMovie = idRoomMovie;
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie{" + "idMovie=" + idMovie + ", nameMovie=" + nameMovie + ", priceMovie=" + priceMovie + ", idRoomMovie=" + idRoomMovie + ", director=" + director + '}';
    }

    public void setIdMovie(String idMovie) {
        this.idMovie = idMovie;
    }

    public String getIdMovie() {
        return idMovie;
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public String getPriceMovie() {
        return priceMovie;
    }

    public String getIdRoomMovie() {
        return idRoomMovie;
    }

    public String getDirector() {
        return director;
    }

    public static Logger getLOG() {
        return LOG;
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    public void setPriceMovie(String priceMovie) {
        this.priceMovie = priceMovie;
    }

    public void setIdRoomMovie(String idRoomMovie) {
        this.idRoomMovie = idRoomMovie;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    

    


}
