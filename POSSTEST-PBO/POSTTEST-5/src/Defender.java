public class Defender extends Operator {
    private String tipeDefender;
    private int totalDef;

    public Defender(String nama, int rarity, String tipeDefender, int totalDef) {
        super(nama, rarity);
        this.tipeDefender = tipeDefender;
        this.totalDef = totalDef;
    }

    public void tambahPertahanan(int nilaiBaru) {
        this.totalDef += nilaiBaru;
    }

    public void tambahPertahanan(double persentase) {
        int tambahan = (int) (this.totalDef * persentase);
        this.totalDef += tambahan;
    }

    @Override
    public void dataTampil() {
        System.out.println("Nama   : " + nama);
        System.out.println("Rarity : " + rarity + "*");
        System.out.println("Role   : Defender");
        System.out.println("Tipe   : " + tipeDefender);
        System.out.println("DEF    : " + totalDef);
    }
}