package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner inpun = new Scanner(System.in);
        String[] array = inpun.nextLine().split(" ");
        for (String e:array){
            if (Pattern.matches(".*?a.*?b.*?c.*?",e))
                System.out.println(e);

        }



    }
}
