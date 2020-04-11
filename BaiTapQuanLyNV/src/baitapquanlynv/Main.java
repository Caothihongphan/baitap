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
        System.out.print("Nhập số nhân viên trong công ty: ");
        int soNhanVien = scanner.nextInt();
        BaiTapQuanLyNV[] baiTapQuanLyNV = new BaiTapQuanLyNV[soNhanVien];
         
        System.out.println("Nhập thông tin cho nhân viên");
        
        for (int i = 0; i < soNhanVien; i++){
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ":");
              baiTapQuanLyNV[i].nhap();
        }
         
        System.out.println("Thông tin của các nhân viên trong công ty: ");
        for (int i = 0; i < soNhanVien; i++) {
            System.out.println(baiTapQuanLyNV[i].toString());
        }
        // TODO code application logic here
    }
    
    
}
