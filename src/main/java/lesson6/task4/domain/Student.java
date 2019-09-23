package lesson6.task4.domain;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
    private final Long id;
    private final String name;
    private final String surname;
    private final LocalDate birthday;
    private final Address address;
    private final Department department;
    private final PhoneNumber phoneNumber;

    private Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.birthday = builder.birthday;
        this.address = builder.address;
        this.department = builder.department;
        this.phoneNumber = builder.phoneNumber;
    }

    public static Builder builder(){
        return new Builder();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Address getAddress() {
        return address;
    }

    public Department getDepartment() {
        return department;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname) &&
                Objects.equals(birthday, student.birthday) &&
                Objects.equals(address, student.address) &&
                Objects.equals(department, student.department) &&
                Objects.equals(phoneNumber, student.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, birthday, address, department, phoneNumber);
    }

    public static class Builder{
        private  Long id;
        private  String name;
        private  String surname;
        private  LocalDate birthday;
        private  Address address;
        private  Department department;
        private  PhoneNumber phoneNumber;

        private Builder() {
        }
        
        public Student build(){
            return new Student(this);
        }

        public Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder withBirthday(LocalDate birthday) {
            this.birthday = birthday;
            return this;
        }

        public Builder withAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder withDepartment(Department department) {
            this.department = department;
            return this;
        }

        public Builder withPhoneNumber(PhoneNumber phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
    }
}
