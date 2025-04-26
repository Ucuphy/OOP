package pertemuan5602;

import java.util.Scanner; // Import Scanner untuk menerima input

public class Pertemuan5602 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        LuasSegiTiga Segitiga01 = new LuasSegiTiga();
        
      
        System.out.print("Masukkan alas segitiga: ");
        Segitiga01.alas = scanner.nextInt();  
        
        System.out.print("Masukkan tinggi segitiga: ");
        Segitiga01.tinggi = scanner.nextInt(); 
        
        System.out.println("Luas segitiga = " + Segitiga01.HitungLuas());
        
        scanner.close();
    }
}
