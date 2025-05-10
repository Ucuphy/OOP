/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;

/**
 *
 * @author INSTIKI
 */
public class MemberGym {
    private String nama;
    private String idMember;

    public MemberGym() {
        this.nama = "";
        this.idMember = "";
    }

    public MemberGym(String nama, String idMember) {
        this.nama = nama;
        this.idMember = idMember;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getIdMember() {
        return idMember;
    }

    public void setIdMember(String idMember) {
        this.idMember = idMember;
    }

    @Override
    public String toString() {
        return "ID: " + idMember + ", Nama: " + nama;
    }
}

