public class Guard extends Operator {
    private String tipeGuard;
    private String tipeSerang;

    public Guard (String nama, int rarity, String tipeGuard, String tipeSerang){
        super(nama, rarity);
        this.tipeGuard = tipeGuard;
        this.tipeSerang = tipeSerang;
    }

    @Override
    public void dataTampil() {
        System.out.println("Nama   : " + nama);
        System.out.println("Rarity : " + rarity + "*");
        System.out.println("Role: Guard");
        System.out.println("Tipe: "+ tipeGuard);
        System.out.println("Tipe Serangan: "+ tipeSerang);
    }

    public String getTipeGuard() {
        return tipeGuard;
    }

    public String getTipeSerang() {
        return tipeSerang;
    }

    public void setTipeGuard(String tipeGuard) {
        this.tipeGuard = tipeGuard;
    }

    public void setTipeSerang(String tipeSerang) {
        this.tipeSerang = tipeSerang;
    }
}
