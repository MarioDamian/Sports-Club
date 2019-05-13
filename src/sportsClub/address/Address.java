package sportsClub.address;

import java.util.Arrays;

public class Address {
    private String street;
    private int nr;

    public Address() {
    }

    public Address(String street, int nr) {
        this.street = street;
        this.nr = nr;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", nr=" + nr +
                '}';
    }
}
