public class Caster extends Operator implements Info {
    private String tipeCaster;
    public String tempatLahir;
    public String tanggalLahir;

    public Caster(String nama, int rarity, String tipeCaster) {
        super(nama, rarity);
        this.tipeCaster = tipeCaster;
    }

    // Tambahkan Setter untuk Caster
    public void setTipeCaster(String tipeCaster) {
        this.tipeCaster = tipeCaster;
    }

    @Override
    public void dataTampil() {
        System.out.println("Nama   : " + nama);
        System.out.println("Rarity : " + rarity + "*");
        System.out.println("Role   : Caster");
        System.out.println("Tipe   : " + tipeCaster);

    }

    @Override
    public void placeOfBirth() {
        System.out.println("Operator " + nama + " Lahir Di: "+ tempatLahir);
    }

    @Override
    public void dateOfBirth() {
        System.out.println("Operator " + nama + " Ulang Tahun Pada Tanggal: "+ tanggalLahir);
    }
}