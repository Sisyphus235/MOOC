package dataStructure.arraysAndStrings;

public class compressString1_5 {
    public static String compress1(String str) {
        String mystr = "";
        char last = str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == last) {
                count++;
            } else {
                mystr += last + "" + count;
                last = str.charAt(i);
                count = 1;
            }
        }
        return mystr + last + count;
    }

    public static void main(String args[]) {
        System.out.println(compress1("helloooo"));
    }
}
