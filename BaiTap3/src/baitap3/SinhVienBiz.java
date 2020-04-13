/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author DELL
 */
public class SinhVienBiz extends SinhVienPoly{
   
    // attributes
    public double diemMarketing;
    public double diemSales;

    // constructor
    public SinhVienBiz(String Name, String nganhHoc, double diemMarketing, double diemSales) {
      super(Name, nganhHoc);
      this.diemMarketing = diemMarketing;
      this.diemSales = diemSales;
    }

    // defined abstract method
    @Override
    public double getDiem() {
      return (2 * this.diemMarketing + this.diemSales) / 3;
    };
    
}
