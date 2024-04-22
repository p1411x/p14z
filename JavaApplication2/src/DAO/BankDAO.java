/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import model.Bank;

/**
 *
 * @author SAD
 */
public interface BankDAO {
    public void NapTien(Bank bank);
     public boolean CheckTaiKhoanNapTien(String userName);
      public void RutTien(String userName, int temp);
    
}
