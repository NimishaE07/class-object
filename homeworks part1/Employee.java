class Employee {
    String name;
    int basicSalary;

    void calculateSalary() {
        int hra = basicSalary * 20 / 100;
        int da = basicSalary * 10 / 100;
        int gross = basicSalary + hra + da;

        System.out.println("Gross Salary = " + gross);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Rahul";
        e.basicSalary = 10000;

        e.calculateSalary();
    }
}
