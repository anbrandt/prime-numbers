package com.andrzej;

public class Main {

   //prime numbers exercise

    //using verifying method inPrime print 10 prime numbers in a range between 10 and 50

    public static void main(String[] args) {

//czyli i to 5
        for(int i = 2; i <= 50; i++) {
            for(int x = 2; x <= i; x++) {
                if(i == x){
                    System.out.println(i);
                }
                if(i%x == 0){
                    break;
                }
            }
        }
        System.out.println("--------------------");

    int count = 0;

    for(int i=2; i<50; i++) {
        if(isPrime(i)){
            count++;
            System.out.println( "Number " + i + " is a prime number");
        if(count == 15) {
            System.out.println("Exiting for loop");
            break;
            }
        }
    }


// przykładowa realizacja metody poniżej
        // int 8, jeżeli jest jedynką, returne false. nie jest, więc idziemy dalej
        //for - dla zmiennej i równej 2, 2 <= 9/2, 10
        // jeżeli reszta z dzielenia 9 / 2 == 0, to false, skończ
        // return true

//        int n;
//        System.out.println("Liczba pierwsza " + isPrime(6));





        for(int i=2; i<50; i++) {
            if(isPrime(i)){
                System.out.println( "Number " + i + " is a prime number");
                }
            }

        int n;
        System.out.println("Liczba pierwsza " + isPrime(6));

    }


    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for(int i = 2; i <= n/2; i++) {
//            System.out.println("Looping " + i);
            if(n % i == 0)

                return false;
        }
//        System.out.println("Looping after " + n);
        return true;
    }

}

