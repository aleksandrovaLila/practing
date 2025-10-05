package dz1;

public class CompareModelsMain {

    public static void main(String[] args) {
        // anemic model case
        CarData carData = new CarData();
        carData.setBrand("Lada");
        carData.setModel("Priora");
        carData.setYear(2025);

        CarService carService = new CarService();
        carService.processCar(carData);

        // functional model case
        FunctionalCar functionalCar = new FunctionalCar();
        functionalCar.setBrand("BMW");
        functionalCar.setModel("X5");
        functionalCar.setYear(2001);
        functionalCar.startAndPrintInfo();
    }
}
