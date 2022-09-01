package HW;

public class Time {
    public static void main(String[] args) {
        int hour = 15;
        int minute = 0;
        int second = 0;
        int passed = Math.round((hour * 60 * 60) + (minute * 60) + second);
        int day = 24 * 60 * 60;
        double percent = (((double)passed / day) * 100);

        System.out.println(hour + ":" + minute + ":" + second +" is " + passed + " seconds since midnight");
        System.out.println("There are " + (day - passed) + " seconds remaining in the day.");
        System.out.println(percent + "%" + " of the day has elapsed.");
    }


}