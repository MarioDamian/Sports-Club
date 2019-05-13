package sportsClub.athlete;

import sportsClub.address.Address;
import sportsClub.salary.Salary;
import sportsClub.sponsors.Sponsor;

import java.util.Arrays;

public class Footballer extends Athlete {
    private String favoriteFoot;
    private static int bonusPerChampionshipWon;

    static {
        bonusPerChampionshipWon = 10000;
    }

    public Footballer() {
    }

    public Footballer(Address home, Salary salary, String nume, int age, int height, int weight, Sponsor sponsor, String favoriteFoot) {
        super(home, salary, nume, age, height, weight, sponsor);
        this.favoriteFoot = favoriteFoot;
    }

    public String getFavoriteFoot() {
        return favoriteFoot;
    }

    public void setFavoriteFoot(String favoriteFoot) {
        this.favoriteFoot = favoriteFoot;
    }

    public static int getBonusPerChampionshipWon() {
        return bonusPerChampionshipWon;
    }

    public Integer getSalaryWithBonus() {
        return salary.getAmount() + bonusPerChampionshipWon;
    }

    @Override
    public String toString() {
        return "Footballer{" +
                "favoriteFoot='" + favoriteFoot + '\'' +
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
