package org.mmert;

import org.mmert.creational.builder.Employee;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar calender = Calendar.getInstance();
        calender.set(Calendar.MONTH,7);
        calender.set(Calendar.YEAR,1992);
        calender.set(Calendar.DAY_OF_MONTH,18);

        Employee employee =  new Employee.EmployeeBuilder()
                .setName("Mehmet Mert")
                .setSurname("Usta")
                .setAddress("Ankara/Turkey")
                .setEmail("mehmetmertusta@gmail.com")
                .setPhoneNumber("90000000000")
                .setHireDate(calender.getTime())
                .build();

        System.out.println(employee.getName());
    }
}