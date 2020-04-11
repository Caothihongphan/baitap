/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java;



 
public class Java {

    String name;
    int tuoi;
    String diachi;
    Double tienluong;
    int tongsohl;
    
    Java(){System.out.println(name+" "+tuoi+""+diachi+""+tienluong+""+tongsohl);}
    Java(String n , int t , String dc, Double tl, int tsh ){  
    
    name = n;  
    tuoi = t;
    diachi = dc;
    tienluong = tl;
    tongsohl = tsh;
    }  
  public void setName(String name) { this.name = name; }
  public void setTuoi(int tuoi) { this.tuoi= tuoi; }
  public void setDiachi() { this.diachi = diachi; }
  public double getTienluong() { return this.tienluong; }
  public int getTongsohl(){return this.tongsohl;}
  
    
  public String getHienthitt() {
    String thongTin = "";
    thongTin = "ho ten: " + this.name + ", tuoi: " + this.tuoi + ", dia chi: " + this.diachi
      + ", tong luong: " + this.tienluong + ", tong so gio lam: " + this.tongsohl;

    System.out.println(thongTin);
    return thongTin;
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Java bai1 = new Java();
         
         
        // TODO code application logic here
    }
    
}
