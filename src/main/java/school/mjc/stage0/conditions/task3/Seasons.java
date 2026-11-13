package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {

        String season ="wrong number!";
        if(month == 1 || month == 2 || month == 12)
            season = "Winter";
        if(month == 3 || month == 4 || month == 5)
            season = "Spring";
        if(month == 6 || month == 7 || month == 8)
            season = "Summer";
        if(month == 9 || month == 10 || month == 11)
            season = "Autumn";
        System.out.println(season);
    }
}
