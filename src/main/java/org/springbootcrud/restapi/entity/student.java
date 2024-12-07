package org.springbootcrud.restapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student") //create student table
public class student {

    @Id //make the roll no primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollNo;

    @Column
    private String name;

    @Column
    private float percentage;

    @Column
    private String branch;

    public student(){

    }

    public student(String name, float percentage, String branch) {
        this.name = name;
        this.percentage = percentage;
        this.branch = branch;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                ", branch='" + branch + '\'' +
                '}';
    }
}
