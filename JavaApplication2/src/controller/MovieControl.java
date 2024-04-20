/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.MovieDAOImpl;
import java.util.*;
import model.Movie;

/**
 *
 * @author SAD
 */
public class MovieControl {

    public void addMovie() {
        MovieDAOImpl movieDAOImpl = new MovieDAOImpl();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id phim");
        String idMovie = sc.nextLine();
        System.out.println("Nhập tên phim :");
        String nameMovie = sc.nextLine();  
        System.out.println("Giá vé xem phim");
        String priceMovie =  sc.nextLine();  
        System.out.println("Nhập số phòng chiếu phim :");
        String idRoomMovie = sc.nextLine();
        System.out.println("Nhà sáng tác :");
        String director = sc.nextLine();
        Movie movie = new Movie(idMovie, nameMovie, priceMovie, idRoomMovie, director);
        if (!movieDAOImpl.CheckMovie(idMovie, idRoomMovie)) {
            movieDAOImpl.addMovie(movie);
            System.out.println("Thêm phim thành công");
        }
        else System.out.println("Phim đã có sẵn");
    }
    public void deleteMovie(){
        MovieDAOImpl movieDAOImpl = new MovieDAOImpl();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id phim");
         String idMovie = sc.nextLine();
        if(movieDAOImpl.CheckMovie(idMovie)){
            movieDAOImpl.deleteMovieById(idMovie);
            System.out.println("Xóa thành công");
        }
        else System.out.println("Phim không tồn tại");
    }
//    public void showAllMovie(){
//         MovieDAOImpl movieDAOImpl = new MovieDAOImpl();
//         movieDAOImpl.showAllMovie();
//    }
    public void searchMovieById(){
        MovieDAOImpl movieDAOImpl1 = new MovieDAOImpl();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id phim");
        String idMovie = sc.nextLine();
         movieDAOImpl1.searchMovieById(idMovie);
    }
}
