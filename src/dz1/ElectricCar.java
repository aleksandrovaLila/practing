package dz1;

public class ElectricCar extends Car {

    private int power;

    public void checkPower() {
        if (power < 20) {
            System.out.println("Батарея разряжена, требуется зарядка");
        }
    }
    @Override
    public void startEngine() {
        System.out.println("Электродвигатель запущен");
    }

    @Override
    public void stopEngine() {
        System.out.println("Электродвигатель остановлен");
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

}
