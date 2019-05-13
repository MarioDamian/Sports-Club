package sportsClub.athlete;

import sportsClub.address.Address;
import sportsClub.salary.Salary;
import sportsClub.sponsors.Sponsor;

import java.util.Arrays;

public class Powerlifter extends Athlete {
    private String lift;
    private int weightRecord;
    private static int bonusPerChampionshipWon;

    static {
        bonusPerChampionshipWon = 5000;
    }

    public Powerlifter() {
    }

    public Powerlifter(Address home, Salary salary, String nume, int age, int height, int weight, Sponsor sponsor, String lift, int weightRecord) {
        super(home, salary, nume, age, height, weight, sponsor);
        this.lift = lift;
        this.weightRecord = weightRecord;
    }

    public String getLift() {
        return lift;
    }

    public void setLift(String lift) {
        this.lift = lift;
    }

    public int getWeightRecord() {
        return weightRecord;
    }

    public void setWeightRecord(int weightRecord) {
        this.weightRecord = weightRecord;
    }

    public static int getBonusPerChampionshipWon() {
        return bonusPerChampionshipWon;
    }

    public Integer getSalaryWithBonus() {
        return salary.getAmount() + bonusPerChampionshipWon;
    }

    @Override
    public String toString() {
        return "Powerlifter{" +
                "lift='" + lift + '\'' +
                ", weightRecord=" + weightRecord +
                ", home=" + home +
                ", salary=" + salary +
                ", nume='" + nume + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", sponsor=" + sponsor +
                '}' + "\n";
    }
}
