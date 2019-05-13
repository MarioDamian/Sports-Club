package sportsClub.athlete;

import sportsClub.address.Address;
import sportsClub.salary.Salary;
import sportsClub.sponsors.Sponsor;

import java.util.Arrays;

public class KarateAthlete extends Athlete{
    private String specialization;
    private static int bonusPerChampionshipWon;

    static {
        bonusPerChampionshipWon = 3000;
    }

    public KarateAthlete() {
    }

    public KarateAthlete(Address home, Salary salary, String nume, int age, int height, int weight, Sponsor sponsor, String specialization) {
        super(home, salary, nume, age, height, weight, sponsor);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public static int getBonusPerChampionshipWon() {
        return bonusPerChampionshipWon;
    }

    public Integer getSalaryWithBonus() {
        return salary.getAmount() + bonusPerChampionshipWon;
    }

    @Override
    public String toString() {
        return "KarateAthlete{" +
                "specialization='" + specialization + '\'' +
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
