package sportsClub;

import sportsClub.services.Service;

public class Main {
    public static void main(String[] args) {
        System.out.println(Service.getInstance().howManyAthletesOnDoeStreet());
        System.out.println(Service.getInstance().howManySalariesUnder10000());
        System.out.println(Service.getInstance().howManyAthletesWithoutMedicalInsurance());
        System.out.println(Service.getInstance().biggestSalary());
        System.out.println(Service.getInstance().athleteWithBiggestSalaryAndBonus());
        System.out.println(Service.getInstance().athletesAppearingInAds());
        System.out.println(Service.getInstance().howManyAthletesUnder30());
        System.out.println(Service.getInstance().allAdidasSponsors());
        System.out.println(Service.getInstance().howManyInjuredAthletes());
        System.out.println(Service.getInstance().howManyRightHandedTennisPlayers());
        Service.getInstance().printAthletesSorted();
    }
}
