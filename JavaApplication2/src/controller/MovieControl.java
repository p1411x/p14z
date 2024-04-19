/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.MovieDAOImpl;
import java.util.*;

/**
 *
 * @author SAD
 */
public class MovieControl {
 MovieDAOImpl movieDAO = new MovieDAOImpl();
 public void addMovie(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Nhập id phim");
      int idMovie =sc.nextInt();
      System.out.println("Nhập tên phim :");
         String nameMovie = sc.nextLine();
         
 }
}
