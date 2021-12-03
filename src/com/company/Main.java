package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Determining Uniqueness");
        System.out.println("String is... " + (IsUnique.isUnique("String") ? "all unique" : "not unique"));
        System.out.println("Strrrrring is... " + (IsUnique.isUnique("Strrrrring") ? "all unique" : "not unique"));

        Scanner scanner = new Scanner(System.in);
        for(int i = 1; i <= 5; i++){
            System.out.print("Insert a word to check for unique characters: ");
            String s = scanner.next();
            System.out.println(s + " is... " + (IsUnique.isUnique(s) ? "all unique" : "not unique"));
        }
    }
}
