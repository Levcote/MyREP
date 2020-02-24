package com.company;
import java.util.Scanner;
import java.lang.String;
public class Main {

    public static void main(String[] args) {
    Scanner RTX_P99_of_on = new Scanner(System.in);
    boolean num_RTX = RTX_P99_of_on.nextBoolean();
    Computer RTX_P99 = new Computer();

    Scanner of_on =new Scanner(System.in);
    boolean num= of_on.nextBoolean();
    Computer PS_1 =new Computer();

    if (num_RTX == true){
        RTX_P99.i9.Dat_analysis();
        RTX_P99.transfer.Dat_analysis();

        }
    else {
        RTX_P99.i9.shutdown();
        RTX_P99.transfer.shutdown();
    }
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



