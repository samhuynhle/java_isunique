package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Determining Uniqueness");
        System.out.println("String is... " + (IsUnique.isUnique("String") ? "all unique" : "not unique"));
        System.out.println("Strrrrring is... " + (IsUnique.isUnique("Strrrrring") ? "all unique" : "not unique"));
    }
}
