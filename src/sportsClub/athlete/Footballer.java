package sportsClub.athlete;

import sportsClub.address.Address;
import sportsClub.salary.Salary;

import java.util.Arrays;

public class Footballer extends Athlete {
    private String[] favoriteFoot;

    public Footballer() {
    }

    public Footballer(Address home, Salary salary, String[] nume, int age, int height, int weight, String[] favoriteFoot) {
        super(home, salary, nume, age, height, weight);
        this.favoriteFoot = favoriteFoot;
    }

    public String[] getFavoriteFoot() {
        return favoriteFoot;
    }

    public void setFavoriteFoot(String[] favoriteFoot) {
        this.favoriteFoot = favoriteFoot;
    }

    @Override
    public String toString() {
        return "Footballer{" +
                "favoriteFoot=" + Arrays.toString(favoriteFoot) +
                ", home=" + home +
                ", salary=" + salary +
                ", nume=" + Arrays.toString(nume) +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
