public abstract class Operator {
    protected String nama;
    protected int rarity;

    public Operator(String nama, int rarity){
        this.nama = nama;
        this.rarity = rarity;
    }
    public abstract void  dataTampil();
//    public void dataTampil(){
//        System.out.println("Nama   : " + nama);
//        System.out.println("Rarity   : " + rarity);
//    }


//    setter

    void setNama(String nama){

        this.nama = nama;
    }

    void setRarity(int rarity){
        this.rarity = rarity;
    }

//    getter

    public String getNama() {
        return this.nama;
    }

    public int getRarity() {
        return this.rarity;
    }
}
