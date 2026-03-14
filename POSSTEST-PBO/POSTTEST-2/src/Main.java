import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Operator> listOperator = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int pilihan;

        do {
            System.out.println("Sistem List Operator Rhodes Island");
            System.out.println("1. Tambah operator");
            System.out.println("2. Lihat operator");
            System.out.println("3. Update operator");
            System.out.println("4. Hapus operator");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    tambah();
                    break;

                case 2:
                    lihat();
                    break;

                case 3:
                    update();
                    break;

                case 4:
                    hapus();
                    break;

                case 5:
                    System.out.println("done");
                    break;

                default:
                System.out.println("lost connetction..");
                pause();
            }
        } while (pilihan != 5);
    }

    static void tambah() {
        String nama;
        String role;

        input.nextLine();

        System.out.print("Masukkan nama operator: ");
        nama = input.nextLine();
        System.out.print("Masukkan role: ");
        role = input.nextLine();
        Operator operator = new Operator(nama, role);
        listOperator.add(operator);

        System.out.println("Data ditambahkan");
        pause();
    }

    static void lihat() {
        if (listOperator.isEmpty()) {
            System.out.println("kosong");
            pause();
        } else {
            int i = 1;
            for (Operator operator : listOperator) {
                System.out.println("operator ke-" + i);
                operator.dataTampil();
                System.out.println("------------------------------------------");
                i++;

            }
            pause();
        }
    }

    static void update() {
        String nama;
        String role;

        lihat();

        System.out.print("Masukkan nomorny doktah: ");
        int index = input.nextInt() - 1;
        input.nextLine();

        System.out.print("Masukkan nama baru: ");
        nama = input.nextLine();
        System.out.print("Masukkan role baru: ");
        role = input.nextLine();

        Operator op = listOperator.get(index);
        op.setNama(nama);
        op.setRole(role);
        System.out.println("Data berhasil diubah");
        pause();
    }

    static void hapus() {

        lihat();
        System.out.print("Masukkan nomor yang ingin dihapus doktah: ");
        int index = input.nextInt() - 1;

        listOperator.remove(index);
        System.out.println("Data berhasil dihapus");
        pause();
    }

    static void pause() {
        System.out.println("sila tekan enter...");
        input.nextLine();
        input.nextLine();
    }
}