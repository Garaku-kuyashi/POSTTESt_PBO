public class Operator {
    private String nama;
    protected String role;

    Operator(String nama, String role){
        this.nama = nama;
        this.role = role;
    }

    void dataTampil(){
        System.out.println("Nama   : " + nama);
        System.out.println("Role   : " + role);
    }


//    setter

    void setNama(String nama){

        this.nama = nama;
    }

    void setRole(String role){
        this.role = role;
    }

//    getter

    public String getNama() {
        return this.nama;
    }

    public String getRole() {
        return this.role;
    }
}
