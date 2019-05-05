package sportsClub.athlete;

import sportsClub.address.Address;
import sportsClub.salary.Salary;

import java.util.Arrays;

public class KarateAthlete extends Athlete{
    private String[] specialization;

    public KarateAthlete() {
    }

    public KarateAthlete(Address home, Salary salary, String[] nume, int age, int height, int weight, String[] specialization) {
        super(home, salary, nume, age, height, weight);
        this.specialization = specialization;
    }

    public String[] getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String[] specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "KarateAthlete{" +
                "specialization=" + Arrays.toString(specialization) +
                ", home=" + home +
                ", salary=" + salary +
                ", nume=" + Arrays.toString(nume) +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
