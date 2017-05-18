package com.andrzej;

/**
 * Created by andrzej on 19.04.17.
 */
public class Main2 {

    //ćwiczenie z drukowania liczb pierwszych w różnych zestawach

    public static void main(String[] args) {

        //wszystko z zastosowaniem metody isPrime. poniżej drukowanie dla zmiennej
        int n = 10;
        if(isPrime(n)) {
            System.out.println("The number " + n + " is a prime number");
        } else {
            System.out.println("The number " + n + " is not prime");
        }

        System.out.println("The number is " + isPrime(3));

        //poniżej w pętli for dla przedziału od 5 do 100
        for (int i = 2; i < 1000 ; i++) {
            if (isPrime(i)) {
                System.out.println("The number " + i + " is the prime number");
            }
        }
    }


    public static boolean isPrime(int i){
        if (i == 1) {
            return false; 
        }

        for (int j = 2; j <= i/2 ; j++) {
            if (i % j == 0)
                return false;

        }
            return true;
    }

}
