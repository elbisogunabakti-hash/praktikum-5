package Abstraction.AbstractClass;
public class Dokter extends Pekerjaan {
    Dokter(String nama) {
        super(nama);
    }
    @Override
    void bekerja() {
        System.out.println(nama + " bertugas memeriksa dan mengobati pasien.");
    }
}
