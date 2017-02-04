package com.company;

/**
 * Created by ridita on 2/3/17.
 */
public class BackAround {
    public String backAround(String str) {
        return (str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1));
    }
}
