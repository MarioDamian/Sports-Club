package sportsClub.sponsors;

public class SponsorRolex extends Sponsor{
    private boolean appearsOnWatches;

    public SponsorRolex() {
    }

    public SponsorRolex(String logo, int bonusAwardFromSponsor, boolean appearsInAds, boolean appearsOnWatches) {
        super(logo, bonusAwardFromSponsor, appearsInAds);
        this.appearsOnWatches = appearsOnWatches;
    }

    public boolean isAppearsOnWatches() {
        return appearsOnWatches;
    }

    public void setAppearsOnWatches(boolean appearsOnWatches) {
        this.appearsOnWatches = appearsOnWatches;
    }

    @Override
    public String toString() {
        return "SponsorRolex{" +
                "appearsOnWatches=" + appearsOnWatches +
                ", logo='" + logo + '\'' +
                ", bonusAwardFromSponsor=" + bonusAwardFromSponsor +
                ", appearsInAds=" + appearsInAds +
                '}' + "\n";
    }
}
