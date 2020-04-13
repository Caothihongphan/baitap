/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

/**
 *
 * @author DELL
 */
public abstract  class ChuyenXe {
    
    // attributes
    public int maChuyenXe;
    public String tenTaiXe;
    public String maSoXe;
    public double doanhThu;

    // contructor
    public ChuyenXe(int maChuyenXe, String tenTaiXe, String maSoXe, double doanhThu) {
      this.maChuyenXe = maChuyenXe;
      this.tenTaiXe = tenTaiXe;
      this.maSoXe = maSoXe;
      this.doanhThu = doanhThu;
    }

   
    public void inThongTinChuyenXe() {
      System.out.println("ma chuyen xe: " + this.maChuyenXe);
      System.out.println("ten tai xe: " + this.tenTaiXe);
      System.out.println("so xe: " + this.maSoXe);
      System.out.printf("doanh thu: %.00f\n", this.doanhThu);
    };
    
}
