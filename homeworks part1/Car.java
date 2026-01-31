class Car {
    String brand;
    String model;
    int price;

    void displayDetails() {
        System.out.println(brand + " " + model + " " + price);
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "Toyota";
        c.model = "Innova";
        c.price = 2500000;

        c.displayDetails();
    }
}
