package sportsClub.sponsors;

public class Sponsor {
    protected String logo;
    protected int bonusAwardFromSponsor;
    protected boolean appearsInAds;

    public Sponsor() {
    }

    public Sponsor(String logo, int bonusAwardFromSponsor, boolean appearsInAds) {
        this.logo = logo;
        this.bonusAwardFromSponsor = bonusAwardFromSponsor;
        this.appearsInAds = appearsInAds;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getBonusAwardFromSponsor() {
        return bonusAwardFromSponsor;
    }

    public void setBonusAwardFromSponsor(int bonusAwardFromSponsor) {
        this.bonusAwardFromSponsor = bonusAwardFromSponsor;
    }

    public boolean isAppearsInAds() {
        return appearsInAds;
    }

    public void setAppearsInAd(boolean appearsInAd) {
        this.appearsInAds = appearsInAd;
    }
}
