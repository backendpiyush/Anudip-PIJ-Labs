package lab_2;

public class Car {
    private String make;
    private String model;
    private short year;
    private int price;

    public Car(String make, int price, short year, String model) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.model = model;
    }

    public static void main(String[] args) {
        Car car = new Car("Porsche",9610000 , (short) 2025,"718 cayman");
    }
}

