package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        String season;
        if (monthNumber == 1 || monthNumber == 2 || monthNumber == 12) {
            season = "Winter";
        }
        else if (monthNumber >= 3 && monthNumber < 6) {
            season = "Spring";
        }
        else if (monthNumber >= 6 && monthNumber < 9) {
            season = "Summer";
        }
        else if (monthNumber >= 9 && monthNumber < 12) {
            season = "Fall";
        }
        else {
            season = "Wrong month number";
        }

        System.out.println(season);
    }

}
