package com.mathur;

import java.io.*;
import java.util.*;

class Results {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        Map lonely = new HashMap();
        for (int i=0; i< a.size(); i ++){
            if (lonely.containsKey(a.get(i))){
                int v = ((Integer) lonely.get(a.get(i)));
                lonely.put(a.get(i), v+1);
            } else {
                lonely.put(a.get(i), 1);
            }
        }
        for (Object key :  getKeys(lonely, 1)) {
            System.out.println(key);
            return (int) key;
        }

        return 0;
    }
    private static Set<Integer> getKeys(Map<Integer, Integer> map, Integer value) {

        Set<Integer> result = new HashSet<>();
        if (map.containsValue(value)) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (Objects.equals(entry.getValue(), value)) {
                    result.add(entry.getKey());
                }
                // we can't compare like this, null will throws exception
              /*(if (entry.getValue().equals(value)) {
                  result.add(entry.getKey());
              }*/
            }
        }
        return result;

    }
}



public class LonelyInteger_HR {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        int result = Results.lonelyinteger(a);
        System.out.println(result);
        bufferedReader.close();
    }
}
