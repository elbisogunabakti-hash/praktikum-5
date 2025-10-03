package Polymorphism.MethodOverloading;

public class Main {
    public static void main(String[] args) {
        Printer p = new Printer();

        p.print("Halo dunia");        
        p.print(123);                  
        p.print("Jumlah item", 5);     
}
}