package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Employee {
    LocalDateTime currentTime = LocalDateTime.now();

    private String employeeId, name, department;
    private double payRate, hoursWorked, startTime;

   public Employee(String employeeId, String name, String department, double payRate, double hoursWorked) {
       this.employeeId = employeeId;
       this.name = name;
       this.department = department;
       this.payRate = payRate;
       this.hoursWorked = hoursWorked;
       this.startTime = 0;
   }
   public double getTotalPay() {
       double regularPay = this.payRate * this.getRegularHours();
       double overtimePay = (this.payRate * 1.5) * this.getOvertimeHours(); //if we have no overtime hours, this will return as 0
       return regularPay + overtimePay;
   }

    public double getRegularHours() {

        if (this.hoursWorked <= 40) {
            //return Math.min(this.hoursWorked, 40)
            return this.hoursWorked;
        } else {
            return 40;  //Can only get to 40
        }
    }

    public double getOvertimeHours() {
       return (this.hoursWorked > 40) ? this.hoursWorked - 40 : 0;
    }

    public void punchIn(double startTime) {
       this.startTime = startTime; //finish this later, sleep is needed
    }
    public void punchIn() {
       DateTimeFormatter format = DateTimeFormatter.ofPattern("hh.mm");
       this.startTime = Double.parseDouble(LocalDateTime.now().format(format));     //LocalDateTime is for planning future possibles
    }

    public void punchOut(double endTime) {
       this.hoursWorked += endTime-startTime;
       this.startTime = 0;
    }
    public void punchOut() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh.mm");
        this.hoursWorked += Double.parseDouble(LocalDateTime.now().format(format)) - this.startTime;  //Getting a double by parsing time
    }
    public void punchTimeCard(double time) {        //Bonus!! Tracking and resetting the startTime
       if(this.startTime == 0) {                    //We need a setter if we are setting it one time
           this.startTime = time;
       } else {
           this.hoursWorked += time-this.startTime; //increasing the existing hours worked
           this.startTime = 0;
       }
    }
    public void punchTimeCard() {
        double time = Double.parseDouble(LocalDateTime.now().format(DateTimeFormatter.ofPattern("hh.mm")));
       if(this.startTime == 0) {
           this.startTime = time;
       } else {
           this.hoursWorked += time - this.startTime;
           this.startTime = 0;
       }
    }
}
