class Book {
    String title;
    String author;
    int price;

    void display() {
        System.out.println(title + " " + author + " " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Java";
        b1.author = "James";
        b1.price = 500;

        Book b2 = new Book();
        b2.title = "Python";
        b2.author = "Guido";
        b2.price = 400;

        Book b3 = new Book();
        b3.title = "C";
        b3.author = "Dennis";
        b3.price = 300;

        b1.display();
        b2.display();
        b3.display();
    }
}
