package Abstraction.AbstractClass;
abstract class Pekerjaan {
    String nama;

    Pekerjaan(String nama) {
        this.nama = nama;
    }
    abstract void bekerja();

    void info() {
        System.out.println("Nama Pekerjaan: " + nama);
    }
}
