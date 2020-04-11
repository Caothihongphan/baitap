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
public class BaiTapQuanLyNV {
   
 

    private String hoTen;
    private int tuoi;
    private String diaChi;
    protected double tienLuong;
    protected int tongSohl;
    Scanner scanner = new Scanner(System.in);
     
    public BaiTapQuanLyNV () {
        super();
    }
 
    public BaiTapQuanLyNV( String hoTen,int tuoi, String diaChi,
        double tienLuong, int tongSohl) {
        super();
        
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.tuoi = tuoi;
        this.tienLuong = tienLuong;
        this.tongSohl = tongSohl;
    }
 
   
    public String getHoTen() {
        return hoTen;
    }
 
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
 public int getTuoi() {
        return tuoi;
    }
 
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
 
    public String getDiaChi() {
        return diaChi;
    }
 
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
 
    
 
    
    public double getTienLuong() {
        return tienLuong;
    }
 
    public void setTienLuong(int tienLuong) {
        this.tienLuong = tienLuong;
    }
 
    public int getTongSoGio() {
        return tongSohl;
    }
 
    public void setTongSoGio(int tongSohl) {
        this. tongSohl= tongSohl;
    }
     
    public void nhap() {
       
        System.out.print("Nhập họ tên nhân viên: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi = scanner.nextInt();
        System.out.print("Nhập địa chỉ nhân viên: ");
        diaChi = scanner.nextLine();
        System.out.print("Nhập tiền lương cơ bản: ");
        tienLuong = scanner.nextDouble();
        System.out.print("Nhập tổng số giờ làm việc: ");
        tongSohl = scanner.nextInt();
    }
     
    public double tinhThuong() {
        return 0;
    }
    
     
    
    public String getThongTin() {
        return  " họ tên nhân viên: " + this.hoTen  +  ", tuổi: " + this.tuoi +
                " địa chi nhân viên: " + this.diaChi  + ",tiền lương : " + this.tienLuong + ",tổng số giờ làm được:"+this.tongSohl;
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nhân viên trong công ty: ");
        int soNhanVien = scanner.nextInt();
        BaiTapQuanLyNV[] nv = new BaiTapQuanLyNV[soNhanVien];
         
        System.out.println("Nhập thông tin cho nhân viên");
        
        for (int i = 0; i < soNhanVien; i++){
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ":");
       nv[i].nhap();
        }
         
        System.out.println("Thông tin của các nhân viên trong công ty: ");
        for (int i = 0; i < soNhanVien; i++) {
            System.out.println(nv[i].getThongTin());
        }
        // TODO code application logic here
    }
    
}
