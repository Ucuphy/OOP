/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author INSTIKI
 */
import java.util.Scanner;
import uts.MemberGym;

public class Tugas_Uts {
    static MemberGym[] data = new MemberGym[100];
    static int jumlahOrang = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("\n===== MENU CHECK-IN GYM =====");
            System.out.println("1. Check-in Member");
            System.out.println("2. Lihat Member di Gym");
            System.out.println("3. Ubah Data Member");
            System.out.println("4. Check-out Member");
            System.out.println("5. Tampilkan Jumlah Orang di Gym");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu (1-6): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // flush newline

            switch (pilihan) {
                case 1: checkIn(); break;
                case 2: tampilkanMember(); break;
                case 3: ubahMember(); break;
                case 4: checkOut(); break;
                case 5: tampilkanJumlah(); break;
                case 6: System.out.println("Sampai jumpa di Gym!"); break;
                default: System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 6);
    }

    // 1. Check-in Member
    public static void checkIn() {
        System.out.print("Masukkan ID Member: ");
        String id = scanner.nextLine();
        System.out.print("Masukkan Nama Member: ");
        String nama = scanner.nextLine();

        data[jumlahOrang] = new MemberGym(nama, id);
        jumlahOrang++;

        System.out.println("Check-in berhasil!");
    }

    // 2. Lihat semua member
    public static void tampilkanMember() {
        if (jumlahOrang == 0) {
            System.out.println("Belum ada member di gym.");
        } else {
            for (int i = 0; i < jumlahOrang; i++) {
                System.out.println((i + 1) + ". " + data[i]);
            }
        }
    }

    // 3. Ubah data member
    public static void ubahMember() {
        tampilkanMember();
        System.out.print("Pilih nomor data yang ingin diubah: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();

        if (index >= 0 && index < jumlahOrang) {
            System.out.print("Masukkan Nama baru: ");
            String nama = scanner.nextLine();
            data[index].setNama(nama);
            System.out.println("Data member berhasil diubah.");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }

    // 4. Check-out Member
    public static void checkOut() {
        tampilkanMember();
        System.out.print("Pilih nomor member yang akan check-out: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();

        if (index >= 0 && index < jumlahOrang) {
            for (int i = index; i < jumlahOrang - 1; i++) {
                data[i] = data[i + 1];
            }
            jumlahOrang--;
            System.out.println("Check-out berhasil.");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }

    // 5. Tampilkan jumlah orang di gym
    public static void tampilkanJumlah() {
        System.out.println("Jumlah orang di gym saat ini: " + jumlahOrang);
    }
}

