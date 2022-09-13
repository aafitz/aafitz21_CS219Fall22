package logicExercises.Logic;

public class order {
    public static boolean ordered(int d1, int d2, int d3) {
        return (d1 < d2 && d3 > d2) || (d1 > d2 && d2 > d3);
        }
    }
