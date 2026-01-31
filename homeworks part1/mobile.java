class Mobile {
    String brand;
    int batteryPercentage;

    void charge(int percent) {
        batteryPercentage += percent;
        if (batteryPercentage > 100)
            batteryPercentage = 100;
    }

    void useBattery(int percent) {
        batteryPercentage -= percent;
        if (batteryPercentage < 0)
            batteryPercentage = 0;
    }

    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.brand = "Samsung";
        m.batteryPercentage = 50;

        m.charge(30);
        m.useBattery(60);

        System.out.println("Battery = " + m.batteryPercentage);
    }
}
