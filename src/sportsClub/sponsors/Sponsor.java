package sportsClub.sponsors;

import sportsClub.salary.Salary;

public class Sponsor {
    protected String[] logo;
    protected Salary bonusAwardFromSponsor;
    protected boolean appearsInAds;

    public Sponsor() {
    }

    public Sponsor(String[] logo, Salary bonusAwardFromSponsor, boolean appearsInAds) {
        this.logo = logo;
        this.bonusAwardFromSponsor = bonusAwardFromSponsor;
        this.appearsInAds = appearsInAds;
    }

    public String[] getLogo() {
        return logo;
    }

    public void setLogo(String[] logo) {
        this.logo = logo;
    }

    public Salary getBonusAwardFromSponsor() {
        return bonusAwardFromSponsor;
    }

    public void setBonusAwardFromSponsor(Salary bonusAwardFromSponsor) {
        this.bonusAwardFromSponsor = bonusAwardFromSponsor;
    }

    public boolean isAppearsInAds() {
        return appearsInAds;
    }

    public void setAppearsInAd(boolean appearsInAd) {
        this.appearsInAds = appearsInAd;
    }
}
