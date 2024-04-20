/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author SAD
 */
public class DanhGia {
   
     private String id;
    private String binhLuan;
    public String rate;

    public DanhGia() {
    }

    public DanhGia(String id, String binhLuan, String rate) {
        this.id = id;
        this.binhLuan = binhLuan;
        this.rate = rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getRate() {
        return rate;
    }

    public String getBinhLuan() {
        return binhLuan;
    }

    public String getId() {
        return id;
    }

    public void setBinhLuan(String binhLuan) {
        this.binhLuan = binhLuan;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DanhGia{" + "id=" + id + ", binhLuan=" + binhLuan + ", rate=" + rate + '}';
    }
    
   
    
}
