/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author SAD
 */
public class Tickets {
    private Movie movie;
    private String seat;
    private String idMovie;
    private boolean isPresent;
    public Tickets() {
    }

    public Tickets(Movie movie, String seat, String idMovie, boolean isPresent) {
        this.movie = movie;
        this.seat = seat;
        this.idMovie = idMovie;
        this.isPresent = isPresent;
    }

    public boolean isIsPresent() {
        return isPresent;
    }

    public void setIsPresent(boolean isPresent) {
        this.isPresent = isPresent;
    }

    public Tickets(Movie movie, String seat ,String idMovie) {
        this.movie = movie;
        this.seat = seat;
        this.idMovie =idMovie;
    }

    public void setIdMovie(String idMovie) {
        this.idMovie = idMovie;
    }

    public String getIdMovie() {
        return idMovie;
    }

    public Movie getMovie() {
        return movie;
    }

    public String getSeat() {
        return seat;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return  "movie=" + movie + ", seat=" + seat + ", idMovie=" + idMovie +"isPresent" + isPresent;
    }

    
    
}
