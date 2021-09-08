package com.example.subscriber.unitTest.model;

import javax.persistence.*;

@Entity
@Table(name= "tbl_subscriber")
public class Subscriber {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String surname;
    private int birthYear;
    private String gender;
    private int age;
    @Column(name="desc", nullable = true)
    private String description;

    public Subscriber () {

    }

    public Subscriber(String name, String surname, int birthYear, String gender,
                      int age, String description)
    {
        this.name=name;
        this.surname=surname;
        this.birthYear=birthYear;
        this.gender=gender;
        this.age=age;
        this.description=description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname=surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear (int birthYear) {
        this.birthYear=birthYear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender=gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age=age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description=description;
    }
}
