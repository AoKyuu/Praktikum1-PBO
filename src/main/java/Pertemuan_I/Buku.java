package Pertemuan_I;

public class Buku {
    String Judul;
    String Penulis;
    String Genre;
    int TahunTerbit;
    
    //Defautl Construktor
    public Buku(){
        this.Judul = "Belum ada judul";
        this.Penulis = "Belum ada penulis";
        this.TahunTerbit = 0;
        this.Genre = "Belum ada genre";
    }
    
    public Buku(String Judul, String Penulis, int TahunTerbit, String Genre){
        this.Judul = Judul;
        this.Penulis = Penulis;
        this.TahunTerbit = TahunTerbit;
        this.Genre = Genre;
    }
    
    public void TampilInfo(){
            System.out.println("Judul :" + Judul);
            System.out.println("Penulis :" + Penulis);
            System.out.println("Tahun :" + TahunTerbit);
            System.out.println("Genre :" + Genre);
            System.out.println("==============================");
    }
    
}