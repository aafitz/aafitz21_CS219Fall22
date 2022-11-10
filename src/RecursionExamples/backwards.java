package RecursionExamples;

public class backwards {
    public static int sum(int [] aoi, int i) {
        // i = aoi.length;

        if(i == 0) {
            return 0;

        }
        else {
            return sum(aoi, i+1) + aoi[i+1];
        }

    }
}

