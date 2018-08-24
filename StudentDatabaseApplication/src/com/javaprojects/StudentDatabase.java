package com.javaprojects;

import java.util.Scanner;

public class StudentDatabase {
    private static int id = 1000;
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String courses = "";
    private int enroll;
    private double tuitionBalance;
    private String studentID;
    private static int costOfCourse = 600;

    public StudentDatabase() {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name : ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name : ");
        this.lastName = in.nextLine();

        System.out.print("1 - Fresher\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student grade level : ");
        this.gradeYear = in.nextInt();

        setStudentID();
        //System.out.print(firstName + " " + lastName + " " + gradeYear + " " + studentID);

    }

    //generate student ID
    private void setStudentID() {
        id++;
        this.studentID = gradeYear + "" + id;
    }

    public void enroll() {
        System.out.print("Choose the courses to enroll :\nHistory 101\nEnglish 101\nMaths 101\nPhysics 101\n");
        do {
            System.out.print("Enter the course name to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n  " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);
        //System.out.println("The enrolled courses are: " + courses);
    }

    public void viewBalance() {
        System.out.println("Your balance amount is : $" + tuitionBalance);
    }

    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment : $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    //show status
    public String showInfo() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nBalance is: $" + tuitionBalance;
    }
}

