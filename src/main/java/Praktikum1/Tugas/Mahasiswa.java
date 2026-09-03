package Praktikum1.Tugas;

public class Mahasiswa {
    String NIM;
    String Nama;
    String ProgramStudi;
    double IPK;
    
    //Con Def
    public Mahasiswa(){
        this.NIM = "Belum Terdaftar";
        this.Nama = "Belum Terdaftar";
        this.ProgramStudi = "Belum Terdaftar";
        this.IPK = 0.0;
    }
    
    //Con Parameterized 1
    public Mahasiswa (String NIM, String Nama, String ProgramStudi  ){
        this.NIM = NIM;
        this.Nama = Nama;
        this.ProgramStudi = ProgramStudi;
        this.IPK = 0.0;
    }
    
    //Con Parameterized 2
    public Mahasiswa (String NIM, String Nama, String ProgramStudi, double IPK){
        this.NIM = NIM;
        this.Nama = Nama;
        this.ProgramStudi = ProgramStudi;
        this.IPK = IPK;
    }
    
    public void CetakKHS (){
        System.out.println("NIM: "+NIM);
        System.out.println("Nama: "+Nama);
        System.out.println("Program Studi: "+ProgramStudi);
        System.out.println("IPK: "+IPK);
        System.out.println("==============================");
    }
    
}
