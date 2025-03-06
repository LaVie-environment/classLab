package cz.mendelu.dao.domain;

public class Student {
    private int id;
    private String name;
    private String surname;
    private String personalNumber;
    private String phone;
    private String city;
    private String street;
    private String postcode;
    private int age;
    private String country;

    // Constructor with all attributes
    public Student(int id, String name, String surname, String personalNumber, String phone, String city, String street, String postcode, int age, String country) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.personalNumber = personalNumber;
        this.phone = phone;
        this.city = city;
        this.street = street;
        this.postcode = postcode;
        this.age = age;
        this.country = country;
    }

    // Constructor with only name
    public Student(String name) {
         this.name = name;
    }

    // Getters and Setters for all attributes
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", personalNumber='" + personalNumber + '\'' +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", postcode='" + postcode + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }
}