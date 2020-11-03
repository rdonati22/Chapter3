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

    public static String setAlarm(int dayOfWeek, boolean isVacation){
        if (isVacation && (dayOfWeek==0 || dayOfWeek==6)){
            return ("off");
        }
        else if ((isVacation && dayOfWeek<6) || (dayOfWeek == 0 || dayOfWeek == 6)){
            return ("10:00");
        }
        else{
            return ("7:00");
        }
    }

    public static boolean onesDigitSame(int a, int b, int c){
        return (a%10 == b%10 || b%10 == c%10 || a%10 == c%10);
    }

    public static int blackjack(int x, int y){
        if (x>21 && y>21){
            return 0;
        }
        else if ((x>=y && x<=21) || y>21){
            return x;
        }
        else {
            return y;
        }
    }

    public static void main(String[] args) {
        System.out.println(chimpTrouble (true, true));
        System.out.println(chimpTrouble (false, false));
        System.out.println(chimpTrouble (true, false));
        System.out.println(chimpTrouble (false, true));

        System.out.println(negPos(1,-1, false));
        System.out.println(negPos(-1,1, false));
        System.out.println(negPos(1,1, false));
        System.out.println(negPos(-1,-1, false));
        System.out.println(negPos(-4,-5, true));
        System.out.println(negPos(-4,5, true));
        System.out.println(negPos(4,5, true));
        System.out.println(negPos(4,-5, true));


        System.out.println(pickUpPhone(false, false, true));
        System.out.println(pickUpPhone(true, true, true));
        System.out.println(pickUpPhone(true, true, false));
        System.out.println(pickUpPhone(false, true, false));
        System.out.println(pickUpPhone(true, false, false));
        System.out.println(pickUpPhone(false, false, false));

        System.out.println(setAlarm(1,false));
        System.out.println(setAlarm(5,false));
        System.out.println(setAlarm(0,false));
        System.out.println(setAlarm(3,true));
        System.out.println(setAlarm(4,true));
        System.out.println(setAlarm(6,true));

        System.out.println(onesDigitSame(23, 19,3));
        System.out.println(onesDigitSame(23, 19,12));
        System.out.println(onesDigitSame(23, 19,3));
        System.out.println(onesDigitSame(423, 13,3));
        System.out.println(onesDigitSame(23, 29,25));

        System.out.println(blackjack(19,21));
        System.out.println(blackjack(21,19));
        System.out.println(blackjack(19,22));
        System.out.println(blackjack(8,8));
        System.out.println(blackjack(25,24));

    }
}

