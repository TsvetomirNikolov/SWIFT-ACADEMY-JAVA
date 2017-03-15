package com.company;

import java.math.BigDecimal;


public class Task4_AppropriateTypes {
    public static void main(String[] args) {
        short ageOfHuman = 32767;
        String gender = "m/f";
//        For money we use BigDecimal, I think it has 26 flags after decimal comma
        double bankAccount1 = 0.0;
        BigDecimal bankAccount = new BigDecimal(bankAccount1);
        short weightOfFood  = 32767;
        byte gradeSystem = 127;
        byte seconds = 127;
    }
}

