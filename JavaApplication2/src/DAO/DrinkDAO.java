/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import model.Drinks;


public interface DrinkDAO {
    public boolean checkDrink(String nameDrink);
    public void addDrink(Drinks drink);
    public void updateDrink(Drinks drinks);
    public void showAllDrink();
}
