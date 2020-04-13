/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapquanlynv;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Nhập so luong nhân viên");
        int soNhanVien = scanner.nextInt();
        BaiTapQuanLyNV BT = new BaiTapQuanLyNV();
        
       
        System.out.println("Nhập thông tin cho nhân viên");
        BT.nhap();
        BT.Xuatthongtin();
                
        
        
        
        
        
        
        // TODO code application logic here
    }
    
    
}
