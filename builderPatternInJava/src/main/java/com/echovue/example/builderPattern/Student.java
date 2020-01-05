package com.echovue.example.builderPattern;

public class Student {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String streetAddress2;
    private String city;
    private String zipCode;
    private String state;
    private String major;
    private int startYear;

    public Student(String firstName, String lastName, String streetAddress, String streetAddress2,
                   String city, String zipCode, String state, String major, int startYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.streetAddress2 = streetAddress2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.major = major;
        this.startYear = startYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getStreetAddress2() {
        return streetAddress2;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getState() {
        return state;
    }

    public String getMajor() {
        return major;
    }

    public int getStartYear() {
        return startYear;
    }

/*    public static StudentBuilder builder() {
        return new StudentBuilder();
    }*/

    public static class StudentBuilder {
        private String firstName;
        private String lastName;
        private String streetAddress;
        private String streetAddress2;
        private String city;
        private String zipCode;
        private String state;
        private String major;
        private int startYear;

        StudentBuilder() {
        }

        public StudentBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public StudentBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public StudentBuilder withStreetAddress(String streetAddress) {
            this.streetAddress = streetAddress;
            return this;
        }

        public StudentBuilder withStreetAddress2(String streetAddress2) {
            this.streetAddress2 = streetAddress2;
            return this;
        }

        public StudentBuilder withCity(String city) {
            this.city = city;
            return this;
        }

        public StudentBuilder withZipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public StudentBuilder withState(String state) {
            this.state = state;
            return this;
        }

        public StudentBuilder withMajor(String major) {
            this.major = major;
            return this;
        }

        public StudentBuilder withStartYear(int startYear) {
            this.startYear = startYear;
            return this;
        }

        public Student build() {
            return new Student(firstName, lastName, streetAddress, streetAddress2, city, zipCode, state, major, startYear);
        }

        public String toString() {
            return "Student.StudentBuilder(firstName=" + this.firstName + ", lastName=" + this.lastName + ", streetAddress=" + this.streetAddress + ", streetAddress2=" + this.streetAddress2 + ", city=" + this.city + ", zipCode=" + this.zipCode + ", state=" + this.state + ", major=" + this.major + ", startYear=" + this.startYear + ")";
        }
    }
}
