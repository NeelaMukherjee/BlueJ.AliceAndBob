/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args ){
        
        Scanner name = new Scanner(System.in);
        System.out.println("Please Enter your Name");
        
        String enteredName=name.nextLine();
        System.out.println ("Hello "+ enteredName);
        

    }
}
