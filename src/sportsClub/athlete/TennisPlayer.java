package sportsClub.athlete;

import sportsClub.address.Address;
import sportsClub.salary.Salary;
import sportsClub.sponsors.Sponsor;

import java.util.Arrays;

public class TennisPlayer extends Athlete {
    private String favoriteHand;
    private static int bonusPerChampionshipWon;

    static {
        bonusPerChampionshipWon = 7000;
    }

    public TennisPlayer() {
    }

    public TennisPlayer(Address home, Salary salary, String nume, int age, int height, int weight, Sponsor sponsor, String favoriteHand) {
        super(home, salary, nume, age, height, weight, sponsor);
        this.favoriteHand = favoriteHand;
    }

    public String getFavoriteHand() {
        return favoriteHand;
    }

    public void setFavoriteHand(String favoriteHand) {
        this.favoriteHand = favoriteHand;
    }

    public static int getBonusPerChampionshipWon() {
        return bonusPerChampionshipWon;
    }

    public Integer getSalaryWithBonus() {
        return salary.getAmount() + bonusPerChampionshipWon;
    }

    @Override
    public String toString() {
        return "TennisPlayer{" +
                "favoriteHand='" + favoriteHand + '\'' +
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
