package chapterFive;

public class DaysOfChristmas {

    public String twelveDaysOfChristmas(int day) {

        String song;
        String daysOfChristmas ="";
        String lyrics = "";


        switch (day) {
            case 12 -> daysOfChristmas = "twelveth day";
            case 11 -> daysOfChristmas = "eleventh day";
            case 10 -> daysOfChristmas = "tenth day";
            case 9 -> daysOfChristmas = "ninth day";
            case 8 -> daysOfChristmas = "eight day";
            case 7 -> daysOfChristmas = "seventh day";
            case 6 -> daysOfChristmas = "sixth day";
            case 5 -> daysOfChristmas = "fifth day";
            case 4 -> daysOfChristmas = "fourth day";
            case 3 -> daysOfChristmas = "third day";
            case 2 -> daysOfChristmas = "second day";
            case 1 -> daysOfChristmas = "first day";
        }

        song = "On the " + daysOfChristmas + " of christmas, my true love sent to me\n";

        switch (day) {
            case 12:
                lyrics = "twelve drummers drumming\n";
                song = song + lyrics;
            case 11:
                lyrics = "eleven pipers piping\n";
                song = song + lyrics;
            case 10:
                lyrics = "ten lords a-leaping\n";
                song = song + lyrics;
            case 9:
                lyrics = "nine ladies dancing\n";
                song = song + lyrics;
            case 8:
                lyrics = "eight maids a-milking\n";
                song = song + lyrics;
            case 7:
                lyrics = "seven swans a-swimming\n";
                song = song + lyrics;
            case 6:
                lyrics = "six geese a-laying\n";
                song = song + lyrics;
            case 5:
                lyrics = "five gold rings\n";
                song = song + lyrics;
            case 4:
                lyrics = "four calling birds\n";
                song = song + lyrics;
            case 3:
                lyrics = "Three French hens\n";
                song = song + lyrics;
            case 2:
                lyrics = "Two turtle doves\n";
                song = song + lyrics;
            case 1:
                lyrics = "A partridge in a pear tree.";
                song = song + lyrics;
        }
        return song;
    }

}
