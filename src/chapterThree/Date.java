package chapterThree;

public class Date {
    private int month;
    private int day;
    private int year;

    public void month(int month) {
        if (month > 0 && month <= 12) {
            this.month = month;
        }

    }
    public int getMonth() {
        return month;
    }

    public void day(int day) {

        if (month == 2 && day < 30 && year %4 == 0){
            this.day = day;
        }else {
            if (month == 2 && day < 29) {
                this.day = day;
            }
        }
        if((month == 4 || month == 6 || month == 9 || month ==11) && day < 31 ){
            this.day =  day;
        }
        if((month == 1 || month == 3 || month == 5 || month ==7 || month == 10 || month ==12) && day < 31 ){
            this.day =  day;
        }
    }

    public int getDay() {
        return day;
    }

    public void year(int year) {
        if (year >= 1900 && year <= 2021) {
            this.year = year;
            if (year % 4 == 0){
//                month(2) <= 28;
            }
        }
    }
    public int getYear() {
        return year;
    }

    public String getDisplayDate() {
        return day + "/" + month + "/" + year;
    }
}
