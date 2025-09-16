/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;
import model.Kontak;

public class KontakService {
    public ArrayList<Kontak> daftar = new ArrayList<>();
    private int nextId = 1;

    public void tambahKontak(String nama, String nomorHp) {
        Kontak k = new Kontak(nextId++, nama, nomorHp);
        daftar.add(k);
        System.out.println("_____________________________________");
        System.out.println("Berhasil menambahkan '" + nama + "'");
    }

    public void listKontak() {
        System.out.println("\n=====================================");
        System.out.println("             List Kontak");
        System.out.println("=====================================");
        if (daftar.isEmpty()) {
            System.out.println("[!] Belum ada kontak");
        } else {
            for (Kontak k : daftar) {
                System.out.println(k.id + ". " + k.nama + " | " + k.nomorHp);
            }
        }
    }

    public void editKontak(int id, String namaBaru, String nomorBaru) {
        for (Kontak k : daftar) {
            if (k.id == id) {
                k.nama = namaBaru;
                k.nomorHp = nomorBaru;
                System.out.println("_____________________________________");
                System.out.println("Berhasil memperbarui kontak");
                return;
            }
        }
        System.out.println("_____________________________________");
        System.out.println("[!] Nomor kontak tidak valid.");
    }

    public void hapusKontak(int id) {
        for (int i = 0; i < daftar.size(); i++) {
            if (daftar.get(i).id == id) {
                System.out.println("_____________________________________");
                System.out.println("'" + daftar.get(i).nama + "' berhasil dihapus.");
                daftar.remove(i);
                return;
            }
        }
        System.out.println("_____________________________________");
        System.out.println("[!] Nomor kontak tidak valid.");
    }
}