package Pertemuan_I;

public class Main {
    public static void main(String[] args) {
        Buku Buku1 = new Buku();
        Buku1.Judul = "My kisah gw";
        Buku1.Penulis = "gweh";
        Buku1.TahunTerbit = 2026;
        Buku1.Genre = "Romance, Comedy, Drama";
        
        Buku Buku2 = new Buku();
        Buku2.Judul = "when yh";
        Buku2.Penulis = "when";
        Buku2.TahunTerbit = 2025;
        Buku2.Genre = "Romance, Comedy, Drama";
        
        Buku Buku3 = new Buku ("Petualangan Ngawi","Amba",2090,"Seksual Romance");
        
        Buku1.TampilInfo();
        Buku2.TampilInfo();
        Buku3.TampilInfo();
    }
    
}