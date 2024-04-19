/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;
import model.Movie;
/**
 *
 * @author SAD
 */
public interface MovieDAO {
    public void addMovie(Movie movie);
     public boolean CheckMovie(String idMovie ,String nameMovie);
     public void deleteMovieById(String idMovie);
     public boolean CheckMovie(String idMovie );
     public void showAllMovie();
     public void searchMovieById(String idMovie);
}
