class Student {
    String name;
    int age;
    int marks;

    void display() {
        System.out.println(name + " " + age + " " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ravi";
        s1.age = 20;
        s1.marks = 85;

        Student s2 = new Student();
        s2.name = "Anu";
        s2.age = 19;
        s2.marks = 90;

        s1.display();
        s2.display();
    }
}
