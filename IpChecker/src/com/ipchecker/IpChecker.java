package com.ipchecker;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by f15 on 25.05.17.
 */
public class IpChecker {
    public static String userAddress(){
        Scanner in = new Scanner(System.in);
        System.out.println("Write address you want to check: ");

        return in.nextLine();
    }

    public static boolean isIpAddress(String addressToCheck){
        String IPv4Regex = "^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}" +
                "([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";

        Pattern pattern = Pattern.compile(IPv4Regex);
        Matcher matcher = pattern.matcher(addressToCheck);

        return matcher.find();
    }

    public static void main(String[] args) {

        System.out.println("Program checks if given address is IP number");

        String addressToCheck = userAddress();

        if (isIpAddress(addressToCheck) == true)
            System.out.println("This is proper IPv4 address");
        else
            System.out.println("This address isn't proper");
    }
}
