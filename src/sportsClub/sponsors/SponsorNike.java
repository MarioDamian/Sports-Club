package sportsClub.sponsors;

public class SponsorNike extends Sponsor{
    private boolean isTheFaceOfNewestAirMax;

    public SponsorNike() {
    }

    public SponsorNike(String logo, int bonusAwardFromSponsor, boolean appearsInAd, boolean isTheFaceOfNewestAirMax) {
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
                ", logo='" + logo + '\'' +
                ", bonusAwardFromSponsor=" + bonusAwardFromSponsor +
                ", appearsInAds=" + appearsInAds +
                '}' + "\n";
    }
}
