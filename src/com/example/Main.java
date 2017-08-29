package com.example;

import com.example.common.Month;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**********************************");
        System.out.println("Choose one of the following months: \n");

        for (Month months: Month.values()) {
            System.out.println(months.getEnglishName() + " - " + months.ordinal());

        }
        System.out.println("--------------------------");
        String input = sc.nextLine().toUpperCase();
        Month userMonth = Month.valueOf(input);
        System.out.println("Selected month: " + userMonth);
        System.out.println("--------------------------");
        System.out.println("The next months this year are: " + "\n");
        for (Month month: Month.values()) {
            if (month.ordinal() > userMonth.ordinal()) {
                System.out.println(month.englishName);
            }
        }
        System.out.println("**********************************");
    }
}