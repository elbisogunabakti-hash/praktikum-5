package Polymorphism.MethodOverloading;

public class Printer {

    void print(String message) {
        System.out.println("Pesan: " + message);
    }
    void print(int number) {
        System.out.println("Angka: " + number);
    }

    void print(String message, int number) {
        System.out.println("Pesan: " + message + " | Angka: " + number);
    }
}
