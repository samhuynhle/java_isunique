package com.company;
import java.util.HashSet;

public class IsUnique {
    public static boolean isUnique(String str){
        String[] str_arr = str.split("");
        HashSet<String> set = new HashSet<String>();

        for(int i = 0; i < str_arr.length; i++){
            if(set.contains(str_arr[i])) {
                return false;
            } else {
                set.add(str_arr[i]);
            }
        }

        return true;
    }
}
