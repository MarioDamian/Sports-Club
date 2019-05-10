package sportsClub.sponsors;

import java.util.Arrays;

public class SponsorAdidas extends Sponsor{
    private boolean appearsOnEquipment;

    public SponsorAdidas() {
    }

    public SponsorAdidas(boolean appearsOnEquipment) {
        this.appearsOnEquipment = appearsOnEquipment;
    }

    public boolean isAppearsOnTshirts() {
        return appearsOnEquipment;
    }

    public void setAppearsOnTshirts(boolean appearsOnTshirts) {
        this.appearsOnEquipment = appearsOnTshirts;
    }

    @Override
    public String toString() {
        return "SponsorAdidas{" +
                "appearsOnEquipment=" + appearsOnEquipment +
                ", logo=" + Arrays.toString(logo) +
                ", bonusAwardFromSponsor=" + bonusAwardFromSponsor +
                ", appearsInAds=" + appearsInAds +
                '}';
    }
}
