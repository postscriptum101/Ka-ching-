
/*
In this exercise, you will implement a popular kids counting game in Java.
The rules of the game are as follows:

In turns, the players start counting upwards beginning with "1".
For every multiple of 3, instead of calling the number itself, the player has to call out "ka"
For every multiple of 5, instead of calling the number itself, the player has to call out "ching!"
Which leads to every multiple of 15 being called out as "ka-ching!"

The first 18 steps of the game thus sound as follows: "1", "2", "ka", "4", ching!", "6", "7", "8", "ka", "ching!", "11", "ka", "13", "14", "ka-ching!", "16", "17", "ka"...

Implement this game in Java such that, when run, it executes the rules of the game as outlined above.

Once you have written your solution code, upload it to your github account and share the solution link in the field below
*/

import java.util.Scanner;
    
public class Main
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter Number");

    String number = sc.nextLine(); 
    
    
 
    try 
		{ 
			Integer.parseInt(number); 
			System.out.println("We will count up to "+ number); 
		}  
		catch (NumberFormatException e)  
		{ 
			System.out.println(number + " is not a valid integer, please enter a valid number!"); 
			return;
		} 
		
		int int_number = Integer.parseInt(number);

		for(int i = 1; i < int_number+1; i++){
		    
		   
		     System.out.println(ka_ching(i)); 
		}
		
   
    
      
        
       
    }
    private static String ka_ching(int number) {
    String out = ""+number;
        if(number%3 == 0) {
        out = "ka"; }
            if(number%5 == 0) {
                if (number%3 == 0){
        
                    out = out + "-ching!";
                    }else{
                         out ="ching!"; }}
    
        return out;
    }

}
