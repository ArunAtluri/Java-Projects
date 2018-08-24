package com.javaprojects;

public class EmailApp {
    private String firstName;
    private String lastName;
    private String department;
    private String company;
    private String password;
    private int mailboxCapacity = 500;
    private String email;
    private String alternateEmail;

    public EmailApp() {
        this("Arun", "Atluri", "Development", "Google");
    }

    public EmailApp(String firstName, String lastName, String department, String company) {
        this.firstName = firstName;
        this.lastName = lastName;

        //call to method to verify the department
        this.department = setDepartment(department);

        this.company = company;

        //call a method to generate random password
        this.password = randomPassword(8);
        //System.out.println("The Generated Password is " + this.password);

        //generate email
        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + company + ".com";


    }

    private String setDepartment(String department) {
        String checkDepartment = department.toLowerCase();
        if(checkDepartment.equals("sales") || checkDepartment.equals("development") || checkDepartment.equals("accounting")) {
            return department;
        } else {
            return "Unknown";
        }
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789#$%@!";
        char[] password = new char[length];
        for(int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    public String getAlternateEmail() {
        return this.alternateEmail;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    public String getPassword() {
        return this.password;
    }

    public String showInfo() {
        return "The name is " + getName() +
                "\nThe company email is " + email +
                "\nThe mailbox capacity is " + mailboxCapacity + "mb" +
                "\nThe Generated Password is " + this.password;


    }
}
