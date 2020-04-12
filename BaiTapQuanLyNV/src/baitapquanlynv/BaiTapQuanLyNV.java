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
     
     void nhap() {
       
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
    
     
    void Xuatthongtin(){
       System.out.println("Ten cua nhan vien:"+hoTen);
       System.out.println("Tuoi cua nhan vien:"+tuoi);
       System.out.println("Dia chi cua nhan vien:"+diaChi);
       System.out.println("Luong nhan vien:"+tienLuong);
       System.out.println("tong so gio lam:"+tongSohl); 
       System.out.println("Tien thuong:"+tinhThuong());
       System.out.println("Tong luong nhan vien:"+(tienLuong+tinhThuong()));
    }
    

    /**
     * @param args the command line arguments
     */
     
}
