 package HW5;

public class Exercise66 {
    public static boolean canSpell(String word, String tiles) {
        boolean canSpellNow = false;
        StringBuilder newword = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char word_char = word.charAt(i);

            for (int j = 0; j < tiles.length(); j++) {
                char tiles_char = tiles.charAt(j);

                // store the character of the indicie
                if (word_char == tiles_char) {
                    //word = word.substring(0, word.indexOf(word_char)) + word.substring(word.indexOf(word_char) + 1);
                    tiles = tiles.substring(0, tiles.indexOf(tiles_char)) + tiles.substring(tiles.indexOf(tiles_char) + 1);
                    newword.append(tiles_char);
                    break;
                }
            }
        }
        if(newword.toString().equals(word)){
            canSpellNow = true;
        }

        return canSpellNow;
    }
        /// if they do match then boolean = true


        public static void main (String[]args){
            System.out.println(canSpell("boot", "axobasrto"));
            System.out.println(!canSpell("hippo", "haxobapsrito"));
            System.out.println(canSpell("anna", "bgtydaynewna"));
           System.out.println(canSpell("celsius","gyuicelshy"));

            // Student: add more test cases
        }
    }


