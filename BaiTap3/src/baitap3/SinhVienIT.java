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
public class SinhVienIT extends SinhVienPoly {
      
  
    public double diemJava;
    public double diemCss;
    public double diemHtml;
    public SinhVienIT(String Name, String nganhHoc, double diemJava, double diemCss, double diemHtml) {
      super(Name, nganhHoc);
      this.diemJava = diemJava;
      this.diemCss = diemCss;
      this.diemHtml = diemHtml;
    }

    @Override
    public double getDiem() {
      return (2 * this.diemJava + this.diemHtml + this.diemCss) / 4;
      
    };
    
}
