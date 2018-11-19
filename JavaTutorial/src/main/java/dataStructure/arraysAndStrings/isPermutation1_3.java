package dataStructure.arraysAndStrings;

public class isPermutation1_3 {
    public static String sort1(String s) {
        char[] content = s.toCharArray(); // string.toCharArray()将string转化为array
        java.util.Arrays.sort(content);  // java.util.Arrays.sort()排序一个array
        return new String(content);  // String(<string_array>)将一个string array转化为string
    }

    public static boolean permutation1(String s, String t) {
        if (s.length() != t.length()) return false;
        return sort1(s).equals(sort1(t));
    }

    public static boolean permutation2(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] letters = new int[256];

        char[] s_array = s.toCharArray();
        for (char c : s_array) {  // for (<type> name: <array>){}获取array中每个元素的index
            letters[c]++;
        }

        for (int i = 0; i < t.length(); i++) {
            int c = (int) t.charAt(i);
            if (--letters[c] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String a = "hello";
        String b = "ehlloi";
        System.out.println(permutation1(a, b));
        char[] content = a.toCharArray();
        for (int i = 0; i < content.length; i++) {
            System.out.println(content[i]);
        }
        int[] num = new int[]{5, 3, 4, 2};  // array赋值方式：new <type>[]{val1, val2...}
        java.util.Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        String contentString = new String(content);
        System.out.println(contentString);
        int[] letters = new int[256];
        for (char c : content) {
            System.out.println(letters[c]);
        }
    }
}
