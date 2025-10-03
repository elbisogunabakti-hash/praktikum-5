package Abstraction.Interface;
public class Minuman implements Consumable {
    private String nama;
    private String rasa;

    public Minuman(String nama, String rasa) {
        this.nama = nama;
        this.rasa = rasa;
    }
    @Override
    public void consume() {
        System.out.println("Minum " + nama + " menggunakan gelas.");
    }
    @Override
    public String getRasa() {
        return rasa;
    }
}
