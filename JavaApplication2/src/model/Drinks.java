/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author SAD
 */
public class Drinks {
    private String nameDrink;
    private Float priceDrink;

    public Drinks() {
    }

    public Drinks(String nameDrink, Float priceDrink) {
        this.nameDrink = nameDrink;
        this.priceDrink = priceDrink;
    }

    public String getNameDrink() {
        return nameDrink;
    }

    public Float getPriceDrink() {
        return priceDrink;
    }

    public void setNameDrink(String nameDrink) {
        this.nameDrink = nameDrink;
    }

    public void setPriceDrink(Float priceDrink) {
        this.priceDrink = priceDrink;
    }

    @Override
    public String toString() {
        return  "nameDrink=" + nameDrink + ", priceDrink=" + priceDrink ;
    }

                                                                                                                                                                                                                                             
}
