package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {

    // Implement all methods as public static
    public static void oneMonthCalendar(int days, int start) {
        int a = 0;
        int b = -1;
        for (int i = 0; i < days; i++) {
            for (int k = 1; k < start && i == 0; k++) {
                System.out.print("   ");
                b++;
            }
            b++;
            a++;
            if (b % 7 == 0) {
                System.out.println();
            }
           System.out.printf("%2d ", a);
        }
        System.out.println();
    }

        public static long [] lcg (long seed)
        {
            long [] result = new long[10];
            final long x = 1103515245;
            final int y = 12345;
            final long m = (long) Math.pow(2,31);

                for (int i = 0; i < result.length; i++){
                result[i] = (x * seed + y) % m;
                seed = result[i];
            }
                return result;
    }
        // test your method implementations here
        // make method calls
        // print their results
        // etc.

    public static void guessingGame(int numberToGuess) {
        Scanner scanner = new Scanner(System.in);
        int counter;
        int i = 1;
        do {
            System.out.print("Guess number " + i + ": ");
            counter = scanner.nextInt();
            if (i == 10) {
                System.out.println("You lost! Have you ever heard of divide & conquer?");
                return;
            } else if (counter < numberToGuess) {
                System.out.println("The number AI picked is higher than your guess.");
            } else if (counter > numberToGuess) {
                System.out.println("The number AI picked is lower than your guess.");
            } else System.out.println("You won wisenheimer!");
            i++;
        } while (counter != numberToGuess);
    }

    public static int randomNumberBetweenOneAndHundred() {
        return new Random().nextInt(99) + 1;
    }

    public static String camelCase(String text){
        int spaces = 0;
        int length = text.length( );
        char[] ch = text.toCharArray();
        int c = 0;
        for ( int i = 0; i < length; i++ )
        {
            ch[i] = Character.toLowerCase( ch[i] ) ;
        }
        for ( int i = 0; i < length; i++ )
        {
            if( i == 0 )
                ch[ i ] = Character.toUpperCase( ch[ i ] );
            if (ch[ i ] == '\''|| ch[ i ] == '!'|| ch[ i ] == '"'|| ch[ i ] == ','|| ch[ i ] == '.'  ){
                ch[ i ] = ' ';
                spaces++;
                continue;
            }
            if (ch[i] == ' ') {
                spaces++;
                ch[i + 1] = Character.toUpperCase( ch[ i + 1] );
                continue ;
            }
            ch[c++] = ch[i];
        }
        return String.valueOf( ch, 0, length - spaces ) ;
    }

    public static boolean swapArrays(int[] x, int[] y) {
        int []temp = new int[x.length];
        if(x.length != y.length){
            return false;
        }
        for(int i =0; i < x.length; i++){
        temp[i] = x[i];
        x[i] = y[i];
        y[i] = temp[i];
        }
        return true;
    }

    public static int checkDigit(int[] number) {
        int sum=0;
        int checkDigit;
        for(int i =0; i < number.length; i++){
                sum = sum + (2+i)*(number[i]);
            }
            int remainder = sum % 11;
            checkDigit = (11 - remainder);

            if (checkDigit == 11){
                checkDigit = 5;
            }
             else if (checkDigit == 10){
                checkDigit = 0;
            } return checkDigit;
    }
}



