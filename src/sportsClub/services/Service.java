package sportsClub.services;

import sportsClub.athlete.*;
import sportsClub.clubRecords.*;
import sportsClub.sponsors.*;
import sportsClub.address.*;
import sportsClub.salary.*;

import java.util.*;

public class Service {
    private static List<Athlete> athletesList = new ArrayList<Athlete>();
    //private static Vector<File> filesVector = new Vector<File>();
    private static Athlete[] athletes = new Athlete[10];
    private static Sponsor[] sponsors = new Sponsor[10];
    private static File[] files = new File[30];
    //0->9 Contract
    //10-19 MedicalRecord
    //20-29 TrainingCampRecord
    private static Address[] addresses = new Address[10];
    private static Salary[] salaries = new Salary[10];
    private static final Service instance = new Service();

    public static Service getInstance() {
        return instance;
    }

    private Service() {
        addresses[0] = new Address("Baker Street", 221);
        addresses[1] = new Address("Cambridge Street", 11);
        addresses[2] = new Address("Oxford Street", 73);
        addresses[3] = new Address("Harvard Street", 1);
        addresses[4] = new Address("King Street", 32);
        addresses[5] = new Address("Queen Street", 432);
        addresses[6] = new Address("John Doe Street", 1);
        addresses[7] = new Address("Jane Doe Street", 11);
        addresses[8] = new Address("John Doe Street", 2);
        addresses[9] = new Address("Jane Doe Street", 12);

        salaries[0] = new Salary(10000);
        salaries[1] = new Salary(5000);
        salaries[2] = new Salary(15000);
        salaries[3] = new Salary(25000);
        salaries[4] = new Salary(2000);
        salaries[5] = new Salary(4000);
        salaries[6] = new Salary(7500);
        salaries[7] = new Salary(12000);
        salaries[8] = new Salary(10000);
        salaries[9] = new Salary(15000);

        sponsors[0] = new SponsorAdidas("Adidas", 5000, true, true);
        sponsors[1] = new SponsorAdidas("Nike", 2000, true, false);
        sponsors[2] = new SponsorAdidas("New Balance", 1000, false, false);
        sponsors[3] = new SponsorAdidas("New Balance", 2500, true, true);
        sponsors[4] = new SponsorAdidas("NikeAirMax", 5000, true, false);
        sponsors[5] = new SponsorAdidas("AdidasOriginal", 7500, true, false);
        sponsors[6] = new SponsorAdidas("Nike", 1500, false, false);
        sponsors[7] = new SponsorAdidas("New Balance", 3500, true, true);
        sponsors[8] = new SponsorAdidas("Adidas", 10000, true, true);
        sponsors[9] = new SponsorAdidas("Nike", 2500, false, false);

        athletes[0] = new KarateAthlete(addresses[0], salaries[0], "John Johnes", 23, 195, 93, sponsors[0], "Kumite");
        athletes[1] = new KarateAthlete(addresses[1], salaries[1], "Alex Stanley", 29, 172, 77, sponsors[1], "Kata");
        athletes[2] = new Footballer(addresses[2], salaries[2], "Cristiano Ronaldo", 34, 185, 81, sponsors[2], "Right");
        athletes[3] = new Footballer(addresses[3], salaries[3], "Gareth Bale", 23, 183, 77, sponsors[3], "Left");
        athletes[4] = new TennisPlayer(addresses[4], salaries[4], "Rafael Nadal", 31, 185, 75, sponsors[4], "Left");
        athletes[5] = new TennisPlayer(addresses[5], salaries[5], "Roger Federer", 34, 187, 72, sponsors[5], "Right");
        athletes[6] = new Powerlifter(addresses[6], salaries[6], "Ronnie Coleman", 51, 185, 115, sponsors[6], "Bench", 225);
        athletes[7] = new Powerlifter(addresses[7], salaries[7], "Hafthor Bjornsson", 35, 201, 143, sponsors[7], "Squat", 320);
        athletes[8] = new Powerlifter(addresses[8], salaries[8], "Lee Haney", 45, 175, 117, sponsors[8], "Deadlift", 300);
        athletes[9] = new TennisPlayer(addresses[9], salaries[9], "Novak Djokovic", 31, 187, 77, sponsors[9], "Right");

        files[0] = new Contract(athletes[0], "23 07 2021", true);
        files[10] = new MedicalRecord(athletes[0], true, true, 0);
        files[20] = new TrainingCampRecord(athletes[0], "Antalya", 15, 500);
        files[1] = new Contract(athletes[1], "10 06 2023", false);
        files[11] = new MedicalRecord(athletes[1], false, false, 10);
        files[21] = new TrainingCampRecord(athletes[1], "Antalya", 15, 500);
        files[2] = new Contract(athletes[2], "07 08 2019", false);
        files[12] = new MedicalRecord(athletes[2], true, true, 0);
        files[22] = new TrainingCampRecord(athletes[2], "Istanbul", 21, 2000);
        files[3] = new Contract(athletes[3], "14 05 2023", true);
        files[13] = new MedicalRecord(athletes[3], false, false, 14);
        files[23] = new TrainingCampRecord(athletes[3], "Istanbul", 21, 2000);
        files[4] = new Contract(athletes[4], "30 12 2020", true);
        files[14] = new MedicalRecord(athletes[4], true, true, 0);
        files[24] = new TrainingCampRecord(athletes[4], "Madrid", 10, 1500);
        files[5] = new Contract(athletes[5], "30 12 2022", true);
        files[15] = new MedicalRecord(athletes[5], false, true, 0);
        files[25] = new TrainingCampRecord(athletes[5], "Madrid", 15, 1500);
        files[6] = new Contract(athletes[6], "01 01 2024", false);
        files[16] = new MedicalRecord(athletes[6], false, false, 7);
        files[26] = new TrainingCampRecord(athletes[6], "Venice", 10, 1000);
        files[7] = new Contract(athletes[7], "01 01 2025", true);
        files[17] = new MedicalRecord(athletes[7], false, true, 7);
        files[27] = new TrainingCampRecord(athletes[7], "Venice", 10, 1000);
        files[8] = new Contract(athletes[8], "01 01 2021", true);
        files[18] = new MedicalRecord(athletes[8], true, true, 0);
        files[28] = new TrainingCampRecord(athletes[8], "Venice", 10, 1000);
        files[9] = new Contract(athletes[9], "30 12 2026", true);
        files[19] = new MedicalRecord(athletes[9], true, false, 21);
        files[29] = new TrainingCampRecord(athletes[9], "Madrid", 15, 1500);

        for (int i = 0; i < 10; i++) {
            athletesList.add(athletes[i]);
        }
        Collections.sort(athletesList);
    }

        public int howManyAthletesOnDoeStreet() {
            int n = 0;
            for(int i = 0; i < athletes.length; i++)
                if(athletes[i].getHome().getStreet() == "John Doe Street" || athletes[i].getHome().getStreet() == "Jane Doe Street")
                    n++;
            return n;
        }

        public int howManySalariesUnder10000() {
            int n = 0;
            for(int i = 0; i < salaries.length; i++)
                if(salaries[i].getAmount() < 10000)
                    n++;
            return n;
        }

        public int howManyAthletesWithoutMedicalInsurance() {
            int n = 0;
            for(int i = 0; i < files.length; i++)
                if(files[i] instanceof MedicalRecord && ((MedicalRecord)files[i]).isMedicallyCleared())
                    n++;
            return n;
        }

        public Salary biggestSalary() {
            Salary s = new Salary();
            int n = 0;
            for(int i = 0; i < athletes.length; i++)
            {
                if(n < athletes[i].getSalary().getAmount())
                    n = athletes[i].getSalary().getAmount();
            }
            s.setAmount(n);
            return s;
        }

        public Athlete athleteWithBiggestSalaryAndBonus() {
            Athlete a = null;
            Salary s = new Salary();
            int n = 0;
            for(int i = 0; i < athletes.length; i++)
            {
                if(n < athletes[i].getSalaryWithBonus())
                {
                    a = athletes[i];
                    n = athletes[i].getSalaryWithBonus();
                }
            }
            return a;
        }

        public Vector<Athlete> athletesAppearingInAds() {
            Vector<Athlete> v = new Vector<Athlete>();
            for(int i = 0; i < athletes.length; i++)
            {
                if(athletes[i].getSponsor().isAppearsInAds())
                    v.add(athletes[i]);
            }
            return v;
        }

        public int howManyAthletesUnder30() {
            int n = 0;
            for(int i = 0; i < athletes.length; i++)
                if(athletes[i].getAge() < 30)
                    n++;
            return n;
        }

        public Vector<Sponsor> allAdidasSponsors() {
            Vector<Sponsor> v = new Vector<Sponsor>();
            for(int i = 0; i < sponsors.length; i++)
                if(sponsors[i] instanceof SponsorAdidas)
                    v.add(sponsors[i]);
            return v;
        }

        public int howManyInjuredAthletes() {
            int n = 0;
            for(int i = 0; i < files.length; i++)
                if(files[i] instanceof MedicalRecord && !((MedicalRecord)files[i]).isMedicallyCleared())
                    n++;
            return n;
        }

        public int howManyRightHandedTennisPlayers() {
            int n = 0;
            for(int i = 0; i < athletes.length; i++)
                if(athletes[i] instanceof TennisPlayer && ((TennisPlayer)athletes[i]).getFavoriteHand() == "Right")
                    n++;
            return n;
        }

        public void printAthletesSorted() {
            for(int i = 0; i < athletes.length; i++)
                System.out.println(athletesList);
        }
}
