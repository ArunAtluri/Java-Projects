package com.javaprojects;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("how many new students to enroll : ");
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        StudentDatabase[] students = new StudentDatabase[count];

        for(int i = 0; i < count; i++) {
            students[i] = new StudentDatabase();
            students[i].enroll();
            students[i].payTuition();
        }

        for (int i = 0; i < count; i++) {
            System.out.println();
            System.out.println(students[i].showInfo());
        }
    }
}
