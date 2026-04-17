import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Operator> listOperator = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== Sistem List Operator Rhodes Island ===");
            System.out.println("1. Tambah operator");
            System.out.println("2. Lihat operator");
            System.out.println("3. Update operator");
            System.out.println("4. Hapus operator");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1: tambah(); break;
                case 2: lihat(); break;
                case 3: update(); break;
                case 4: hapus(); break;
                case 5: System.out.println("Done!"); break;
                default:
                    System.out.println("Lost connection..");
                    pause();
            }
        } while (pilihan != 5);
    }

    static void tambah() {
        input.nextLine(); // Clear buffer
        System.out.print("Masukkan Nama Operator: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Rarity (1-6): ");
        int rarity = input.nextInt();

        System.out.println("\nPilih Tipe Operator: ");
        System.out.println("1. Vanguard");
        System.out.println("2. Guard");
        System.out.println("3. Defender");
        System.out.println("4. Caster"); // Tambahan Caster
        System.out.print("Pilihan: ");
        int tipe = input.nextInt();
        input.nextLine(); // Clear buffer

        if (tipe == 1) {
            System.out.print("Masukkan Tipe Vanguard (Contoh: Pioneer): ");
            String vangtipe = input.nextLine();
            System.out.print("Masukkan Tipe Land (High/Low): ");
            String landtipe = input.nextLine();
            listOperator.add(new Vanguard(nama, rarity, vangtipe, landtipe));
        } else if (tipe == 2) {
            System.out.print("Masukkan Tipe Guard (Contoh: Lord): ");
            String guardtipe = input.nextLine();
            System.out.print("Masukkan Tipe Serangan (Physical/Arts): ");
            String serangtipe = input.nextLine();
            listOperator.add(new Guard(nama, rarity, guardtipe, serangtipe));
        } else if (tipe == 3) {
            System.out.print("Masukkan Tipe Defender (Protector/Guardian): ");
            String deftipe = input.nextLine();
            System.out.print("Total DEF Dasar: ");
            int defnilai = input.nextInt();
            input.nextLine();
            listOperator.add(new Defender(nama, rarity, deftipe, defnilai));
        } else if (tipe == 4) {
            System.out.print("Masukkan Tipe Caster (Contoh: Splash/ST): ");
            String tipeCaster = input.nextLine();
            Caster newCaster = new Caster(nama, rarity, tipeCaster);
            System.out.print("Masukkan Tempat Lahir: ");
            newCaster.tempatLahir = input.nextLine();
            System.out.print("Masukkan Tanggal Lahir: ");
            newCaster.tanggalLahir = input.nextLine();
            listOperator.add(newCaster);
        } else {
            System.out.println("Pilihan Role Tidak Valid!");
        }
        System.out.println("Data Ditambahkan");
        pause();
    }

    static void lihat() {
        if (listOperator.isEmpty()) {
            System.out.println("Database Kosong");
        } else {
            int i = 1;
            for (Operator operator : listOperator) {
                System.out.println("\nOperator Ke-" + i);
                operator.dataTampil();
                if (operator instanceof Info) {
                    Info info = (Info) operator;
                    info.placeOfBirth();
                    info.dateOfBirth();
                }
                System.out.println("------------------------------------------");
                i++;
            }
        }
        pause();
    }

    static void update() {
        if (listOperator.isEmpty()) {
            System.out.println("Tidak ada data untuk diupdate.");
            pause();
            return;
        }
        lihat();
        System.out.print("Masukkan Nomor Yang Ingin Di Update: ");
        int index = input.nextInt() - 1;
        input.nextLine(); // Clear buffer

        if (index >= 0 && index < listOperator.size()) {
            Operator operator = listOperator.get(index);
            System.out.print("Masukkan Nama Baru: ");
            operator.setNama(input.nextLine());
            System.out.print("Masukkan Rarity Baru (1-6): ");
            operator.setRarity(input.nextInt());
            input.nextLine();
            if (operator instanceof Vanguard) {
                Vanguard v = (Vanguard) operator;
                System.out.print("Masukkan Tipe Vanguard Baru: ");
                v.setTipeVanguard(input.nextLine());
                System.out.print("Masukkan Tipe Land Baru: ");
                v.setTipeLand(input.nextLine());
            } else if (operator instanceof Guard) {
                Guard g = (Guard) operator;
                System.out.print("Masukkan Tipe Guard Baru: ");
                g.setTipeGuard(input.nextLine());
                System.out.print("Masukkan Tipe Serangan Baru: ");
                g.setTipeSerang(input.nextLine());
            } else if (operator instanceof Defender) {
                Defender d = (Defender) operator;
                System.out.println("Mode Update DEF (Overloading):");
                System.out.println("1. Tambah DEF (Nilai Pasti - int)");
                System.out.println("2. Tambah DEF (Persentase - double)");
                System.out.print("Pilih: ");
                int pilih = input.nextInt();
                if (pilih == 1) {
                    System.out.print("Nilai tambahan: ");
                    d.tambahPertahanan(input.nextInt());
                } else if (pilih == 2) {
                    System.out.print("Persentase buff (0.x): ");
                    d.tambahPertahanan(input.nextDouble());
                }
                input.nextLine();
            } else if (operator instanceof Caster) {
                Caster c = (Caster) operator;
                System.out.print("Masukkan Tipe Caster Baru: ");
                c.setTipeCaster(input.nextLine());
                System.out.print("Masukkan Tempat Lahir Baru: ");
                c.tempatLahir = input.nextLine();
                System.out.print("Masukkan Tanggal Lahir Baru: ");
                c.tanggalLahir = input.nextLine();
            }
            System.out.println("Data Berhasil Diperbarui!");
        } else {
            System.out.println("Pilihan Tidak Valid");
        }
        pause();
    }

    static void hapus() {
        if (listOperator.isEmpty()) return;
        lihat();
        System.out.print("Nomor dihapus: ");
        int index = input.nextInt() - 1;
        input.nextLine();
        if (index >= 0 && index < listOperator.size()) {
            listOperator.remove(index);
            System.out.println("Data berhasil dihapus");
        }
        pause();
    }

    static void pause() {
        System.out.println("Sila tekan enter...");
        input.nextLine();
    }
}