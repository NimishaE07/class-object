class College {
    String collegeName;
    String location;

    void display() {
        System.out.println(collegeName + " " + location);
    }

    public static void main(String[] args) {
        College c1 = new College();
        c1.collegeName = "ABC College";
        c1.location = "Bangalore";

        College c2 = new College();
        c2.collegeName = "XYZ College";
        c2.location = "Mysore";

        College c3 = new College();
        c3.collegeName = "PQR College";
        c3.location = "Hubli";

        c1.display();
        c2.display();
        c3.display();
    }
}
