package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
    LocalDateTime currentTime = LocalDateTime.now();

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double overtimePayRate;
    private double hoursWorked;

   private double totalPay;
   private double regularHours;
   private double overtimeHours;

   private double punchIn;
   private double punchOut;
   private double time;

    public double getTotalPay() {
        if (hoursWorked > 40) {
            totalPay = (payRate * regularHours) + (overtimePayRate * overtimeHours);
        } else {
            totalPay = payRate * regularHours;
        }
        return totalPay;
    }

    public double getRegularHours() {
        if (hoursWorked > 40) {
            regularHours = 40;
        } else {
            regularHours = hoursWorked;
        }
        return regularHours;
    }

    public double getOvertimeHours() {
        overtimeHours = hoursWorked - 40; //we are trying to identify overtime hours so we can use it elsewhere
        return overtimeHours;
    }
    public double getOvertimePayRate() {
        overtimePayRate = payRate * 1.5F;
        return overtimePayRate;
    }

    public void punchIn(double time) {      //finish this later, sleep is needed
    }
    public void punchIn() {                 //punchOut time - punchIn time = time.
    }
    public void punchOut(double time) {
    }
    public void punchOut() {

    }
}
