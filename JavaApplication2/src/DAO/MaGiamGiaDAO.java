/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import model.MaGiamGia;

/**
 *
 * @author SAD
 */
public interface MaGiamGiaDAO {

    public boolean checkMaGiamGia(String rateGiamGia );

    public void addMaGiamGia(MaGiamGia maGiamGia);

    public void deleteMaGiamGia(String rateGiamGia);

    public void updateMaGiamGia(MaGiamGia maGiamGia);

    public void showAllMaGiamGia();

}
