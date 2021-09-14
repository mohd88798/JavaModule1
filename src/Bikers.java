/*
Five Bikers Compete in a race such that they drive at
a constant speed which may or may not be the same as
the other. To qualify the race, the speed of a racer must
be more than the average speed of all 5 racers. Write a
Java program to take as input the speed of each racer
and print back the speed of qualifying racers
*/

import java.util.Scanner;

public class Bikers {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        float b1=10,b2=20,b3=25,b4=30,b5=20,average;

        average=(b1+b2+b3+b4+b5)/5;
        System.out.println("Average= "+average);

        if(b1>average)
            System.out.println("b1 qualified");
        if(b2>average)
            System.out.println("b2 qualified");
        if(b3>average)
            System.out.println("b3 qualified");
        if(b4>average)
            System.out.println("b4 qualified");
        if(b5>average)
            System.out.println("b5 qualified");
    }
}