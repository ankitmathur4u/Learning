package com.mathur;

import java.io.*;
import java.util.stream.IntStream;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        char[] ampm= s.toCharArray();
        if (ampm[ampm.length-2]=='A'){
            if ((s.substring(0,2).equals("12"))){
                return "00"+s.substring(2,8);
            }
            return s.substring(0,8);
        } else {
            int hh = Integer.parseInt(s.substring(0, 2));
            if (!s.substring(0,2).equals("12")){
                hh = hh +12;
            }
            return Integer.toString(hh)+s.substring(2,8);
        }

    }

}

public class TimeConversion_HR {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);
        bufferedReader.close();

        System.out.println(result);
    }
}
