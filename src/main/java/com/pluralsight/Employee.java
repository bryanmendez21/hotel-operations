package com.pluralsight;

public class Employee {
    int employeeId;
    String name;
    String department;
    double payRate;
    double hoursWorked;


    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }


    int getEmployeeId() {
        return this.employeeId;
    }

    String getName() {
        return this.name;
    }

    String getDepartment() {
        return this.department;
    }

    double getPayRate() {
        return this.payRate;
    }

    double getHoursWorked() {
        return this.hoursWorked;
    }
    double getRegularHours(){
        if (hoursWorked >= 40){
            return 40;
        }
        return hoursWorked;
    }
    double getOvertimeHours(){
        if (hoursWorked > 40){
            return hoursWorked - 40;
        }
        return 0;
    }
    double getTotalPay(){
        return (getRegularHours() * payRate + (getOvertimeHours() * (payRate * 1.5)));
    }


}
