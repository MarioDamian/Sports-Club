package sportsClub.clubRecords;

import sportsClub.athlete.Athlete;

public abstract class File {
    protected Athlete athlete;

    public File() {
    }

    public File(Athlete athlete) {
        this.athlete = athlete;
    }

    public Athlete getAthlete() {
        return athlete;
    }

    public void setAthlete(Athlete athlete) {
        this.athlete = athlete;
    }
}
