package dataStructure.arraysAndStrings;

public class uniqueCharacter1_1 {
    public boolean isUniqueChars(String str) {
        if (str.length() > 256) return false;

        boolean[] char_set = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);  // int将string转化为int，比如'h'会被转化为104
            if (char_set[val]) return false;
            char_set[val] = true;
        }
        return true;
    }

    public static void main(String args[]) {
        String character = "hello";
        for (int i = 0; i < character.length(); i++) {
            int val = character.charAt(i);
            System.out.println(val);
        }
        System.out.println(character.charAt(0) - 'a');
        System.out.println("-------------------------");
        String val = "hello";
        for (int i = 0; i < val.length(); i++) {
            int cha = val.charAt(i);
            System.out.println(cha);
        }

    }
}

