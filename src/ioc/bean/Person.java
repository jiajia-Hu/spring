package ioc.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
    private String name;
    private String gender;
    private String email;
    private Integer age;

    private Car car;

    private List<Book> books;

    private Map<String,Object> map;

    private Properties properties;

    public Person(String name, String gender, String email, Integer age) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.age = age;
    }

    public Person(String name, String gender, String email, Integer age, Car car, List<Book> books, Map<String, Object> map, Properties properties) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.age = age;
        this.car = car;
        this.books = books;
        this.map = map;
        this.properties = properties;
    }

    public Person() {
        System.out.println("Person无参constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("设置姓名"+ name);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", car=" + car +
                ", books=" + books +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
