import java.util.Random;
import java.util.Scanner;
public class Tutorial03 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //Question 1
        //a
        System.out.println(3*8 == 27);
        //b
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
        //c
        System.out.print("Enter a alphabet: ");
        char alphabet = sc.next().charAt(0);
        System.out.println(Character.isUpperCase(alphabet));
        //d
        System.out.print("Enter first word: ");
        String firstWord = sc.next();
        System.out.print("Enter second word: ");
        String secondWord = sc.next();
        int comparison = firstWord.compareToIgnoreCase(secondWord);
        if (comparison < 0) {
            System.out.println(firstWord + "\n" + secondWord);
        } else if (comparison > 0) {
            System.out.println(secondWord + "\n" + firstWord);
        } else {
            System.out.println("Both words are the same.");
        }
        //e
        System.out.print("Enter a number: ");
        int day = sc.nextInt();
        switch (day) {
            case 1-> System.out.println("Monday");                
            case 2-> System.out.println("Tuesday");
            case 3-> System.out.println("Wednesday");    
            case 4-> System.out.println("Thursday");  
            case 5 -> System.out.println("Friday");
            case 6-> System.out.println("Saturday");   
            case 7 -> System.out.println("Sunday");    
            default -> System.out.println("Invalid day number.");
        }

        //Question 2
        /*a
        if (num1 == num2)     //== for comparison, = for assignment
            System.out.println("Number 1 is equal to number 2.");*/
        /*b
        if (x > y && y > z)  //add and instead of double >
            System.out.println("x is the largest number");*/
        /*c
        String s1, s2; 
        if (s1.equals(s2))  //use equals() method to compare strings
            System.out.println("They are equal strings."); 
        else  //no need condition   
            System.out.println("They are not equal strings."); */
        /*d
        if (x > 0 || y > 0)    //use || for or and add parenthesis for condition
            System.out.println("Either x or y is positive");*/
        
        //Question 3
        /*a
        #####
        $$$$$ 
        */

        /*b
        #####
        $$$$$
        */

       /*c 
       #####
       */

       /*d

        */

       //Question 5
       System.out.print("Enter a year: ");
       int year = sc.nextInt();
       if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
           System.out.println(year + " is a leap year.");
       } else {
           System.out.println(year + " is not a leap year.");
       }
   
    }
    //Question 4
    static void Q4(int num1 , int num2 , int num3) {
        if(num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the largest number.");
        } else if(num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the largest number.");
        } else if(num3 > num1 && num3 > num2) {
            System.out.println(num3 + " is the largest number.");
        } else {
            System.out.println("There is a tie for the largest number.");
        }
    }
}
