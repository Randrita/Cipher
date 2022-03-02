package com.randrita.JavaExam;
import java.util.Scanner;

public class Office {

    public static void main(String[] args) {

        Worker obj1 = new Worker();
        String Name=obj1.Name("Rimi");
        String Address=obj1.Address("32/B,JKM Road,Kolkata-700037");
        int age= obj1.Age(21);
        int noDaysWorked= obj1.nDaysWorked(20);
        int dailyWage = obj1.DailyWage(1000);
        int totalSalary = obj1.totalSalary(noDaysWorked,dailyWage);

        System.out.println("Employee Details(Output Employee Class):\nName: " +Name +"\nAddress: "+Address +"\nAge: "+age );
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Manager Details(Output Manager Class):\nDepartment: " + obj1.Department("IT") +"\nSalary: "+ obj1.Salary(100000));
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Worker Details(Output Worker Class):\ntotalSalary: " + totalSalary );

    }
}

class Employee{

    public String Name(String name) {
        return name;
    }

    public String Address(String address) {
        return address;
    }

    public int Age(int age){
        return age;
    }
}

class Manager extends Employee{
    public String Department(String department) {
        return department;
    }
    public int Salary(int salary){
        return salary;
    }

}

class Worker extends Manager{

    public int nDaysWorked(int n_days_worked){
        return n_days_worked;
    }

    public int totalSalary(int a,int b){
        int total_salary= a*b;
        return total_salary;
    }

    public int DailyWage(int daily_wage){
        return daily_wage;
    }

}

