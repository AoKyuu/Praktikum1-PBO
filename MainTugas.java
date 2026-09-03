package Praktikum1.Tugas;

public class MainTugas {
    public static void main(String[] args) {
        
        Mahasiswa Mhs1 = new Mahasiswa();
        Mhs1.NIM = "L032043";
        Mhs1.Nama = "Azis Fauzi Ramadhan";
        Mhs1.ProgramStudi = "Informatika";
        Mhs1.IPK = 9.99;
        
        Mahasiswa Mhs2 = new Mahasiswa ();
        Mhs2.NIM = "L0325099";
        Mhs2.Nama = "Hiura Mihate";
        Mhs2.ProgramStudi = "Informatika";
        Mhs2.IPK = 4.00;
        
        Mahasiswa Mhs3 = new Mahasiswa ();
        Mhs3.NIM = "L0325100";
        Mhs3.Nama = "Kinosaki Mei";
        Mhs3.ProgramStudi = "Informatika";
        Mhs3.IPK = 3.99;
        
        Mahasiswa Mhs4 = new Mahasiswa();
        
        Mahasiswa Mhs5 = new Mahasiswa ("L0225500","Yanto","Sains Data");
        
        Mahasiswa Mhs6 = new Mahasiswa ("L0225501","Joshep","Sains Data",2.00);
                
        Mhs1.CetakKHS();
        Mhs2.CetakKHS();
        Mhs3.CetakKHS();
        Mhs4.CetakKHS();
        Mhs5.CetakKHS();
        Mhs6.CetakKHS();
    }
    
}
