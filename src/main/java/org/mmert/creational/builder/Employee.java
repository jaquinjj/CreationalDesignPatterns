package org.mmert.creational.builder;

import java.util.Date;

public class Employee {

    public Employee(EmployeeBuilder builder)
    {
        this.setName(builder.name);
        this.setSurname(builder.surname);
        this.setAddress(builder.address);
        this.setHireDate(builder.hireDate);
        this.setEmail(builder.email);
    }
    private String name;
    private String surname;
    private Date hireDate;
    private String address;
    private String phoneNumber;
    private String email;

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

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public static class EmployeeBuilder
    {
        private String name;
        private String surname;
        private Date hireDate;
        private String address;
        private String phoneNumber;
        private String email;

        public  EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public EmployeeBuilder setHireDate(Date hireDate) {
            this.hireDate = hireDate;
            return this;
        }

        public EmployeeBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public EmployeeBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public EmployeeBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Employee build()
        {
            Employee employee = new Employee(this);
            return employee;
        }


    }
}
