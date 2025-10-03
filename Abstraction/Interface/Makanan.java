package Abstraction.Interface;
public class Makanan implements Consumable {
    private String nama;
    private String rasa;

    public Makanan(String nama, String rasa) {
        this.nama = nama;
        this.rasa = rasa;
    }
    @Override
    public void consume() {
        System.out.println("Makan " + nama + " dengan sendok.");
    }
    @Override
    public String getRasa() {
        return rasa;
    }
}
