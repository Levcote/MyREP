package com.company;
import java.util.Scanner;
import java.lang.String;
public class Main {

    public static void main(String[] args) {
    Scanner of_on =new Scanner(System.in);
    boolean num= of_on.nextBoolean();
    Computer PS_1 =new Computer();
    if(num==true){
        PS_1.i5.start();
        PS_1.transfer.start();
    }
    else{
        PS_1.i5.shutdown();
        PS_1.transfer.shutdown();
    }



    }
}



