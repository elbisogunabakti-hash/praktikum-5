package Abstraction.Interface;

public class Main {
    public static void main(String[] args) {
        Consumable c1 = new Makanan("Nasi Goreng", "Gurih");
        Consumable c2 = new Minuman("Jus Jeruk", "Asem Segar");

        c1.consume();
        System.out.println("Rasanya: " + c1.getRasa());

        System.out.println();

        c2.consume();
        System.out.println("Rasanya: " + c2.getRasa());
    }
}
