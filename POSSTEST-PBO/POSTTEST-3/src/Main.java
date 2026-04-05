import java.util.ArrayList;
import java.util.Scanner;

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
        int rarity;

        input.nextLine();

        System.out.print("Masukkan Nama Operator: ");
        nama = input.nextLine();
        System.out.print("Masukkan Rarity(1-6): ");
        rarity = input.nextInt();
//        Operator operator = new Operator(nama, role);
//        listOperator.add(operator);
        System.out.println("Pilih Tipe Oerator: ");
        System.out.println("1. Vanguard");
        System.out.println("2. Guard");
        System.out.println("Pilihan: ");
        int tipe = input.nextInt();
        input.nextLine();

        if (tipe == 1){
            System.out.println("Masukkan Tipe Vanguard (Contoh = Piooner): ");
            String vangtipe = input.nextLine();
            System.out.print("Masukkan Tipe Land (High/Low): ");
            String landtipe = input.nextLine();
            listOperator.add(new Vanguard(nama, rarity, vangtipe, landtipe));
        } else if (tipe == 2) {
            System.out.println("Masukkan Tipe Guard (Contoh = Lord): ");
            String guardtipe = input.next();
            System.out.print("Masukkan Tipe Serangan (Physical/Arts): ");
            String serangtipe = input.nextLine();
            listOperator.add(new Guard(nama, rarity, guardtipe, serangtipe ));
        }else {
            listOperator.add(new Operator(nama, rarity));
        }
        System.out.println("Data Ditambahkan");
        pause();
    }

    static void lihat() {
        if (listOperator.isEmpty()) {
            System.out.println("kosong");
            pause();
        } else {
            int i = 1;
            for (Operator operator : listOperator) {
                System.out.println("Operator Ke-" + i);
                operator.dataTampil();
                System.out.println("------------------------------------------");
                i++;

            }
            pause();
        }
    }

    static void update() {
        String nama;
        int rarity;

        lihat();
        System.out.println("Masukkan Nomor Yang Ingin Di Hapus: ");
        int index = input.nextInt() - 1;
        input.nextLine();

        if (index >= 0 && index < listOperator.size()){
            Operator operator = listOperator.get(index);
            System.out.println("Masukkan Nama Baru: ");
            operator.setNama(input.nextLine());
            System.out.println("Masukkan Rarity Baru (1-6): ");
            operator.setRarity(input.nextInt());
            input.nextLine();

            if (operator instanceof Vanguard){
                Vanguard vanguard = (Vanguard) operator;
                System.out.println("Masukkan Tipe Vanguard Baru: ");
                vanguard.setTipeVanguard(input.nextLine());
                System.out.println("Masukkan Tipe Land Baru: ");
                vanguard.setTipeLand(input.nextLine());

            } else if (operator instanceof  Guard) {
                Guard guard = (Guard) operator;
                System.out.println("Masukkan Tipe Guard Baru: ");
                guard.setTipeGuard(input.nextLine());
                System.out.println("Masukkan Tipe Serangan Baru: ");
                guard.setTipeSerang(input.nextLine());

            }
            System.out.println("Data Berhasil Diperbarui Doktah");
        }else {
            System.out.println("Pilihan Tidak Valid");
        }
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