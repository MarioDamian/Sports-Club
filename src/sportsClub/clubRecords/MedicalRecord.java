package sportsClub.clubRecords;

import sportsClub.athlete.Athlete;

public class MedicalRecord extends File {
    private boolean hasMedicalInsurance;
    private boolean isMedicallyCleared;
    private int daysInHospital;

    public MedicalRecord() {
    }

    public MedicalRecord(Athlete athlete, boolean hasMedicalInsurance, boolean isMedicallyCleared, int daysInHospital) {
        super(athlete);
        this.hasMedicalInsurance = hasMedicalInsurance;
        this.isMedicallyCleared = isMedicallyCleared;
        this.daysInHospital = daysInHospital;
    }

    public boolean isHasMedicalInsurance() {
        return hasMedicalInsurance;
    }

    public void setHasMedicalInsurance(boolean hasMedicalInsurance) {
        this.hasMedicalInsurance = hasMedicalInsurance;
    }

    public boolean isMedicallyCleared() {
        return isMedicallyCleared;
    }

    public void setMedicallyCleared(boolean medicallyCleared) {
        isMedicallyCleared = medicallyCleared;
    }

    public int getDaysInHospital() {
        return daysInHospital;
    }

    public void setDaysInHospital(int daysInHospital) {
        this.daysInHospital = daysInHospital;
    }

    @Override
    public String toString() {
        return "MedicalRecord{" +
                "hasMedicalInsurance=" + hasMedicalInsurance +
                ", isMedicallyCleared=" + isMedicallyCleared +
                ", daysInHospital=" + daysInHospital +
                ", athlete=" + athlete +
                '}';
    }
}
