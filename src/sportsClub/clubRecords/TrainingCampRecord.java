package sportsClub.clubRecords;

import sportsClub.athlete.Athlete;

public class TrainingCampRecord extends File{
    private String city;
    private int durationDays;
    private int price;

    public TrainingCampRecord() {
    }

    public TrainingCampRecord(Athlete athlete, String city, int durationDays, int price) {
        super(athlete);
        this.city = city;
        this.durationDays = durationDays;
        this.price = price;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDurationDays() {
        return durationDays;
    }

    public void setDurationDays(int durationDays) {
        this.durationDays = durationDays;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TrainingCampRecord{" +
                "city='" + city + '\'' +
                ", durationDays=" + durationDays +
                ", price=" + price +
                ", athlete=" + athlete +
                '}';
    }
}
