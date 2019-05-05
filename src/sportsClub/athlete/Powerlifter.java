package sportsClub.athlete;

import sportsClub.address.Address;
import sportsClub.salary.Salary;

import java.util.Arrays;

public class Powerlifter extends Athlete {
    private String[] lift;
    private int weightRecord;

    public Powerlifter() {
    }

    public Powerlifter(Address home, Salary salary, String[] nume, int age, int height, int weight, String[] lift, int weightRecord) {
        super(home, salary, nume, age, height, weight);
        this.lift = lift;
        this.weightRecord = weightRecord;
    }

    public String[] getLift() {
        return lift;
    }

    public void setLift(String[] lift) {
        this.lift = lift;
    }

    public int getWeightRecord() {
        return weightRecord;
    }

    public void setWeightRecord(int weightRecord) {
        this.weightRecord = weightRecord;
    }

    @Override
    public String toString() {
        return "Powerlifter{" +
                "lift=" + Arrays.toString(lift) +
                ", weightRecord=" + weightRecord +
                ", home=" + home +
                ", salary=" + salary +
                ", nume=" + Arrays.toString(nume) +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
