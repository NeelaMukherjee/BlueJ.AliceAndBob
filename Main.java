/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args ){
        
        Scanner name = new Scanner(System.in);
        System.out.println("Please Enter your Name");
        
        String enteredName=name.nextLine();
        if (enteredName.equals("Alice")||enteredName.equals("Bob"))
        {
        System.out.println ("Hello "+ enteredName);
    }
    
    else {
        System.out.println("You are not Alice or Bob");

    }
}
}
