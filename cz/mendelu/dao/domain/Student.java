package cz.mendelu.dao.domain;

public class Student {
    private int id;
    private String name;
    private String surname;
    private String personalNumber;
    private String phone;
    private int age;
    private Address address;


    public Student(int id, String name, String surname, String personalNumber, String phone, int age, Address address) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.personalNumber = personalNumber;
        this.phone = phone;
        this.age = age;
        this.address = address;

    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
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

    public Address getaddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", personalNumber='" + personalNumber + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public boolean isNull() {
        return false;
    }

    private Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.personalNumber = builder.personalNumber;
        this.phone = builder.phone;
        this.age = builder.age;
        this.address = builder.address;
    }

    public static class Builder {
        private int id;
        private String name;
        private String surname;
        private String personalNumber;
        private String phone;
        private int age;
        private Address address;

        public Builder(int id, String name, String surname) {
            this.id = id;
            this.name = name;
            this.surname = surname;
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder personalNumber(String personalNumber) {
            this.personalNumber = personalNumber;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder address(Address address) {
            this.address = address;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
