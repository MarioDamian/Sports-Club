package sportsClub.sponsors;

public class SponsorNB extends Sponsor {
    private boolean hasOwnCollection;

    public SponsorNB() {
    }

    public SponsorNB(String logo, int bonusAwardFromSponsor, boolean appearsInAds, boolean hasOwnCollection) {
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
                ", logo='" + logo + '\'' +
                ", bonusAwardFromSponsor=" + bonusAwardFromSponsor +
                ", appearsInAds=" + appearsInAds +
                '}' + "\n";
    }
}
