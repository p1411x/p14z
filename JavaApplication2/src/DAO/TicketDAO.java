/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import model.Movie;
import model.Tickets;

/**
 *
 * @author SAD
 */
public interface TicketDAO {

    public boolean KiemTraVe(String idMovie, String seat);

    public void DatVe(Tickets tickets);

    public Movie getNameMovie(String idMovie);

    public void showAllTicket();
}
