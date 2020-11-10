package com.company;

public class Conditionals2 {

    public static boolean isLeapYear(int year){
        if (year%100!=0 && year%4==0) {
            return true;
        }
        else{
            return (year%400==0);
        }
    }

    public static boolean isLater(int month1, int day1, int year1, int month2, int day2, int year2){
        if (year1>year2 || year1==year2 && month1>month2){
            return true;
        }
        else{
            return (year1==year2 && month1==month2 && day1>day2);
        }
    }

    public static String bestMatch(int r, int g, int b){
        if (r>g && r>b){
            return "RED";
        }
        else if (g>r && g>b){
            return "GREEN";
        }
        else if (b>r && b>g){
            return "BLUE";
        }
        else if (r==g && r>b){
            return "YELLOW";
        }
        else if (g==b && g>r){
            return "CYAN";
        }
        else if (r==b && r>g){
            return "MAGENTA";
        }
        else{
            return "GRAY";
        }
    }

    public static int findBestFit(int size1, int size2, int space){
        int x;
        if (size1+size2<=space){
            x=3;
        }
        else if (size1<=space && (size1>=size2 || size2>space)){
            x=1;
        }
        else if (size2<=space){
            x=2;
        }
        else{
            x=0;
        }
        return x;
    }

    public static boolean makeBench(int small, int big, int goal){
        return (small+big*5<=goal);
    }

    public static void main (String[] args){
        System.out.println("2000 " + isLeapYear(2000));
        System.out.println("2004 " + isLeapYear(2004));
        System.out.println("2003 " + isLeapYear(2003));
        System.out.println("2100 " + isLeapYear(2100));

        System.out.println("1/2/2010 is later than 1/2/2011 " + isLater(1,2,2010, 1,2,2011));
        System.out.println("1/2/2011 is later than 1/2/2010 " + isLater(1,2,2011, 1,2,2010));
        System.out.println("1/5/2010 is later than 3/2/2010 " + isLater(1,5,2010, 3,2,2010));
        System.out.println("3/2/2010 is later than 1/2/2010 " + isLater(3,2,2010, 1,2,2010));
        System.out.println("1/3/2010 is later than 1/2/2010 " + isLater(1,3,2010, 1,2,2010));
        System.out.println("1/2/2010 is later than 1/3/2010 " + isLater(1,2,2010, 1,3,2010));
        System.out.println("1/2/2010 is later than 1/2/2010 " + isLater(1,2,2010, 1,2,2010));
        System.out.println("4/8/2010 is later than 1/2/2011 " + isLater(4,8,2010, 1,2,2011));

        System.out.println("Best match 2 3 4 " + bestMatch(2,3,4));
        System.out.println("Best match 4 3 3 " + bestMatch(4,3,3));
        System.out.println("Best match 3 8 4 " + bestMatch(3,8,4));
        System.out.println("Best match 4 3 4 " + bestMatch(4,3,4));
        System.out.println("Best match 2 4 4 " + bestMatch(2,4,4));
        System.out.println("Best match 8 8 4 " + bestMatch(8,8,4));
        System.out.println("Best match 4 4 4 " + bestMatch(4,4,4));

        System.out.println("Find Best fit 2 3 6 is " + findBestFit(2,3,6));
        System.out.println("Find Best fit 4 3 6 is " + findBestFit(4,3,6));
        System.out.println("Find Best fit 3 4 6 is " + findBestFit(3,4,6));
        System.out.println("Find Best fit 2 3 1 is " + findBestFit(2,3,1));
        System.out.println("Find Best fit 6 3 4 is " + findBestFit(6,3,4));
        System.out.println("Find Best fit 3 6 4 is " + findBestFit(3,6,4));

        System.out.println("Make bench 3 1 8 is " + makeBench(3,1,8));
        System.out.println("Make bench 3 1 9 is " + makeBench(3,1,9));
        System.out.println("Make bench 11 1 15 is " + makeBench(11,1,15));
        System.out.println("Make bench 4 2 15 is " + makeBench(4,2,15));
        System.out.println("Make bench 20 0 20 is " + makeBench(20,0,20));
        System.out.println("Make bench 3 4 20 is " + makeBench(3,4,20));
        System.out.println("Make bench 0 6 30 is " + makeBench(0,6,30));
        System.out.println("Make bench 0 5 30 is " + makeBench(0,5,30));
    }
}