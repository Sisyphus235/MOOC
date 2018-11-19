package dataStructure.arraysAndStrings;

public class replaceSpace1_4 {
    public static String replaceSpace1(char[] str, int length) {
        int spaceCount = 0, newLength, i;  // 同时声明多个变量spaceCount, newLength, i，第一个赋值，其余未赋值
        for (i = 0; i < length; i++) {
            if (str[i] == ' ') {  // 单引号引的数据 是char类型的，双引号引的数据 是String类型的
                spaceCount++;
            }
        }
        newLength = length + spaceCount * 2;
        str[newLength] = '\0';
        for (i = length - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[newLength - 1] = '0';
                str[newLength - 2] = '2';
                str[newLength - 3] = '%';
                newLength = newLength - 3;
            } else {
                str[newLength - 1] = str[i];
                newLength = newLength - 1;
            }
        }
        return new String(str);
    }
    public static void main(String args[]){
        String s = "  he ll   o";
        int s_length = s.length();
        System.out.println(replaceSpace1(s.toCharArray(), s_length));
    }
}
