package Abstraction.AbstractClass;

public class Main {
    public static void main(String[] args) {
        Pekerjaan p1 = new Dokter("Dokter Andi");
        Pekerjaan p2 = new Guru("Ibu Siti");

        p1.info();
        p1.bekerja();

        System.out.println();

        p2.info();
        p2.bekerja();
    }
}
