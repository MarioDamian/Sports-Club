package sportsClub.clubRecords;

import sportsClub.athlete.Athlete;

public class Contract extends File{
    private String expiryDate;
    private boolean canBeFinishedBeforeExpiryDate;

    public Contract() {
    }

    public Contract(Athlete athlete, String expiryDate, boolean canBeFinishedBeforeExpiryDate) {
        super(athlete);
        this.expiryDate = expiryDate;
        this.canBeFinishedBeforeExpiryDate = canBeFinishedBeforeExpiryDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public boolean isCanBeFinishedBeforeExpiryDate() {
        return canBeFinishedBeforeExpiryDate;
    }

    public void setCanBeFinishedBeforeExpiryDate(boolean canBeFinishedBeforeExpiryDate) {
        this.canBeFinishedBeforeExpiryDate = canBeFinishedBeforeExpiryDate;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "expiryDate='" + expiryDate + '\'' +
                ", canBeFinishedBeforeExpiryDate=" + canBeFinishedBeforeExpiryDate +
                ", athlete=" + athlete +
                '}';
    }
}
