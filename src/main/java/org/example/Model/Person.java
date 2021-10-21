package org.example.Model;

import java.util.UUID;

/*
* @a
*/


public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public Person(int id, String firstName, String lastName, String email) {
        if (id <= 0) throw new RuntimeException();
        this.id = id;
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
    }


    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) throw new RuntimeException("first name must not be null");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) throw new RuntimeException("last name must not be null");
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null) throw new RuntimeException("email must not be null");
        this.email = email;
    }

    public String getSummary(){
        return "{id: " + getId()
                + ", name: " + getFirstName() + " " + getLastName() +
                ", email: " + getEmail() + "}";
    }
}

