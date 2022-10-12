 /* package HW5;

public class Exercise66 {
    public static boolean canSpell(String word, String tiles) {
        String Check = '';

        for (int i =0; i < word.length(); i++) {
            char word_char = word.charAt(i);


            for (int i = 0; i < tiles.length(); i++) {
                char tiles_char = tiles.charAt(i);

                // store the character of the indicie
                if (word_char == tiles_char) {
                    tiles_char += Check;
                    tiles = tiles.charAt(0, i) + tiles.substring(i + 1);
                    break;
                }
            }
        }
        // if they dont match then keep going forward-- boolean false
        return Check.equals(word); /// if they do match then boolean = true




    public static void main(String [] args) {
        System.out.println(canSpell("boot", "axobasrto"));
        System.out.println(!canSpell("hippo", "haxobapsrito"));
        System.out.println(canSpell("anna"))

        // Student: add more test cases
    }
}
}
/*
/*
  */