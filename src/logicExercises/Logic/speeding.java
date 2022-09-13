package logicExercises.Logic;

public class speeding {
    public static void main(String[] args) {

        System.out.println(caughtSpeeding(60, false) == 0);
        System.out.println(caughtSpeeding(65, false) == 1);
        System.out.println(caughtSpeeding(65, true) == 0);
        System.out.println(caughtSpeeding(81, false) == 2);
        System.out.println(caughtSpeeding(81, true) == 1);

    }


    public static int caughtSpeeding(int speed, boolean isBirthday) {

        if (isBirthday) {   // if it is their birthday
            if (speed <= 65) {
                return 0;
            } else if (speed < 86) {
                return 1;
            } else {
                return 2;
            }
        }
        else {
            return -99;
        }
    }
}

