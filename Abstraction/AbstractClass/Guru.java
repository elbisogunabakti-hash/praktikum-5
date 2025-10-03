package Abstraction.AbstractClass;
public class Guru extends Pekerjaan {
    Guru(String nama) {
        super(nama);
    }
    @Override
    void bekerja() {
        System.out.println(nama + " bertugas mengajar dan mendidik murid.");
    }
}
