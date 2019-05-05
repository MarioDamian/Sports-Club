package sportsClub.athlete;

import sportsClub.address.Address;
import sportsClub.salary.Salary;

import java.util.Arrays;

public class Athlete {
    protected Address home;
    protected Salary salary;
    protected String[] nume;
    protected int age;
    protected int height;
    protected int weight;

    public Athlete() {
    }

    public Athlete(Address home, Salary salary, String[] nume, int age, int height, int weight) {
        this.home = home;
        this.salary = salary;
        this.nume = nume;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Address getHome() {
        return home;
    }

    public void setHome(Address home) {
        this.home = home;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public String[] getNume() {
        return nume;
    }

    public void setNume(String[] nume) {
        this.nume = nume;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
