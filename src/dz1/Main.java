package dz1;

public class Main {
    public static void main(String[] args) {
        ElectricCar elcar = new ElectricCar();
        elcar.setPower(10);
        elcar.checkPower();

        Car car = new ElectricCar();
        car.startEngine();

        Car car2 = new Car();
        car2.startEngine();


        try {
            elcar = null;
            elcar.checkPower();
        } catch (RuntimeException e) {
            System.err.println("Ошибка, объекта не существует");
        }
    }
}
