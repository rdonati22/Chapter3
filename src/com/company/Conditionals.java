package com.company;

public class Conditionals {

    public static boolean chimpTrouble(boolean aSmile, boolean bSmile) {
        return !(aSmile || bSmile) || (aSmile && bSmile);
    }

    public static boolean negPos(int a, int b, boolean negative) {
        if (negative && (a<0 && b<0)){
            return true;
        }
        else{
            return (!negative && ((a>0 && b<0) || (a<0 && b>0)));
        }
    }

    public static boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep) {
        return !(isAsleep || (isMorning && !isMom));
    }

//    public static boolean setAlarm(){
//
//    }

    public static void main(String[] args) {
        //System.out.println(chimpTrouble (true, true));
        //System.out.println(negPos(-1,-1, false));
        //System.out.println(pickUpPhone(false, false, false));
        //System.out.println(setAlarm());
    }
}

