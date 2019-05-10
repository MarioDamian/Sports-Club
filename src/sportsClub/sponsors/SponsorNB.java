package sportsClub.sponsors;

import sportsClub.salary.Salary;

import java.util.Arrays;

public class SponsorNB extends Sponsor {
    private boolean hasOwnCollection;

    public SponsorNB() {
    }

    public SponsorNB(String[] logo, Salary bonusAwardFromSponsor, boolean appearsInAds, boolean hasOwnCollection) {
        super(logo, bonusAwardFromSponsor, appearsInAds);
        this.hasOwnCollection = hasOwnCollection;
    }

    public boolean isHasOwnCollection() {
        return hasOwnCollection;
    }

    public void setHasOwnCollection(boolean hasOwnCollection) {
        this.hasOwnCollection = hasOwnCollection;
    }

    @Override
    public String toString() {
        return "SponsorNB{" +
                "hasOwnCollection=" + hasOwnCollection +
                ", logo=" + Arrays.toString(logo) +
                ", bonusAwardFromSponsor=" + bonusAwardFromSponsor +
                ", appearsInAds=" + appearsInAds +
                '}';
    }
}
