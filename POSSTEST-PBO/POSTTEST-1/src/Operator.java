public class Operator {
    String nama;
    String role;

    Operator(String nama, String role){
        this.nama = nama;
        this.role = role;
    }

    void dataTampil(){
        System.out.println("Nama   : " + nama);
        System.out.println("Role   : " + role);
    }

    void getNama(String nama){

        this.nama = nama;
    }

    void getRole(String role){
        this.role = role;
    }
}
