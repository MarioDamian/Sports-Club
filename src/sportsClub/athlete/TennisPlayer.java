package sportsClub.athlete;

import sportsClub.address.Address;
import sportsClub.salary.Salary;

import java.util.Arrays;

public class TennisPlayer extends Athlete {
    private String[] favoriteHand;

    public TennisPlayer() {
    }

    public TennisPlayer(Address home, Salary salary, String[] nume, int age, int height, int weight, String[] favoriteHand) {
        super(home, salary, nume, age, height, weight);
        this.favoriteHand = favoriteHand;
    }

    public String[] getFavoriteHand() {
        return favoriteHand;
    }

    public void setFavoriteHand(String[] favoriteHand) {
        this.favoriteHand = favoriteHand;
    }

    @Override
    public String toString() {
        return "TennisPlayer{" +
                "favoriteHand=" + Arrays.toString(favoriteHand) +
                ", home=" + home +
                ", salary=" + salary +
                ", nume=" + Arrays.toString(nume) +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
