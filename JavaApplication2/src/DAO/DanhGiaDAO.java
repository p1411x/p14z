/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import model.DanhGia;

/**
 *
 * @author SAD
 */
public interface DanhGiaDAO {
    public void addDanhGia(DanhGia danhGia);
    public void deleteDanhGiaById(String id);
     public void showAllDanhGia();
     public void updateDanhGia(DanhGia danhGia);
     public boolean checkDanhGia(String id);
}
