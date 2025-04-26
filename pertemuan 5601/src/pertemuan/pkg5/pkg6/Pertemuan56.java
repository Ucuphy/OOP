/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan.pkg5.pkg6;

/**
 *
 * @author INSTIKI
 */
public class Pertemuan56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        manusia johan = new manusia("L");
        johan.warnakulit="hitam legam";
        johan.SetWarnaRambut("hitam");
  
        manusia yani = new manusia("P");
        yani.warnakulit="putih";
        yani.SetWarnaRambut("biru");
        
    }  
}
class manusia{
        public String warnakulit="";
        private String warnarambut="";
        private String jeniskelamin="";
        
        public manusia(String jkel){
            this.jeniskelamin = jkel;
        }
       
        void SetWarnaRambut(String warna){
            this.warnarambut= warna;
        }
   
    }