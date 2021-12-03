package com.company;
import java.util.HashSet;

public class IsUnique {
    public static boolean isUnique(String str){
        String[] arr = str.split("");
        HashSet<String> set = new HashSet<String>();

        for(int i = 0; i < arr.length; i++){
            if(set.contains(arr[i])) {
                return false;
            } else {
                set.add(arr[i]);
            }
        }
        return true;
    }
}
