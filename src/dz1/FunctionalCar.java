package dz1;

public class FunctionalCar {
    public void startEngine() {
        System.out.println("Двигатель запущен");
    }

    public void startAndPrintInfo() {
        startEngine();
        System.out.println("Был вызван метод запуска двигателя!");
    }

    private String brand;
    private String model;
    private int year;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void main(String[] args) {
        FunctionalCar functionalCar = new FunctionalCar();
        functionalCar.setYear(2000);
        System.out.println(functionalCar.year);
    }
}
