public class Vanguard extends Operator {
    private String tipeVanguard;
    private String tipeLand;

    public Vanguard (String nama, int rarity, String tipeVanguard, String tipeLand){
        super(nama, rarity);
        this.tipeVanguard = tipeVanguard;
    }

    @Override
    public void dataTampil() {
        super.dataTampil();
        System.out.println("Role: Vanguard");
        System.out.println("Tipe: "+ tipeVanguard);
        System.out.println("Tipe Land: "+ tipeLand );
    }

    public String getTipeVanguard() {
        return tipeVanguard;
    }

    public String getTipeLand() {
        return tipeLand;
    }

    public void setTipeVanguard(String tipeVanguard) {
        this.tipeVanguard = tipeVanguard;
    }

    public void setTipeLand(String tipeLand) {
        this.tipeLand = tipeLand;
    }
}
