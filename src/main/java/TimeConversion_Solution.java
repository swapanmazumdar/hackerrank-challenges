/**
 * Time conversion
 * <p>
 * Problem: Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
 * <p>
 * Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour
 * clock, and 12:00:00 on a 24-hour clock.
 */
public class TimeConversion_Solution {

    static String timeConversion(String s) {
        String[] tokens = s.split(":");
        String hh = tokens[0];
        String mm = tokens[1];
        String ss = tokens[2];
        if (Integer.parseInt(hh) != 12 && s.endsWith("PM")) {
            hh = String.valueOf(Integer.parseInt(hh) + 12);
        } else if (Integer.parseInt(hh) == 12 && s.endsWith("AM")) {
            hh = "00";
        }
        StringBuilder builder = new StringBuilder();
        builder.append(hh).append(":").append(mm).append(":").append(ss.substring(0, 2));
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45PM"));
        System.out.println(timeConversion("07:05:45AM"));
        System.out.println(timeConversion("12:05:45AM"));
        System.out.println(timeConversion("12:05:45PM"));
    }
}
