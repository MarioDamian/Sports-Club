package sportsClub.sponsors;

import sportsClub.salary.Salary;

import java.util.Arrays;

public class SponsorNike extends Sponsor{
    private boolean isTheFaceOfNewestAirMax;

    public SponsorNike() {
    }

    public SponsorNike(String[] logo, Salary bonusAwardFromSponsor, boolean appearsInAd, boolean isTheFaceOfNewestAirMax) {
        super(logo, bonusAwardFromSponsor, appearsInAd);
        this.isTheFaceOfNewestAirMax = isTheFaceOfNewestAirMax;
    }

    public boolean isTheFaceOfNewestAirMax() {
        return isTheFaceOfNewestAirMax;
    }

    public void setTheFaceOfNewestAirMax(boolean theFaceOfNewestAirMax) {
        isTheFaceOfNewestAirMax = theFaceOfNewestAirMax;
    }

    @Override
    public String toString() {
        return "SponsorNike{" +
                "isTheFaceOfNewestAirMax=" + isTheFaceOfNewestAirMax +
                ", logo=" + Arrays.toString(logo) +
                ", bonusAwardFromSponsor=" + bonusAwardFromSponsor +
                ", appearsInAd=" + appearsInAds +
                '}';
    }
}
