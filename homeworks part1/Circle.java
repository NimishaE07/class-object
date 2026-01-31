class Circle {
    int radius;

    void area() {
        System.out.println("Area = " + (3.14 * radius * radius));
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 7;

        c.area();
    }
}
