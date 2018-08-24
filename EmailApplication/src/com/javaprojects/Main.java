package com.javaprojects;

public class Main {

    public static void main(String[] args) {
        EmailApp sample = new EmailApp("Jason", "Anthony", "Accounting", "Apple");

        System.out.println("Details are as follows " + sample.showInfo());

        sample.setPassword("TQ6yo$Va");
        System.out.println("The new password is " + sample.getPassword());

        sample.setAlternateEmail("jason.antony@gmail.com");
        System.out.println("The alternate email address is " + sample.getAlternateEmail());
    }
}
