package ioc_2.bean;

public class Book {
    private  String name;

    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book() {
        System.out.println("Book无参constructor");
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public void iniMethod(){
        System.out.println("iniMethod");
    }

    public void destoryMethod(){
        System.out.println("destoryMethod");
    }

}
