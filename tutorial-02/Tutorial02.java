import java.util.Scanner;

public class Tutorial02 {
    public static void main(String[] args) {
        //Question 1
        //a
        System.out.print(" Faculty of Computer Science");
        System.out.println(" and Information Technology.");
        //b
        System.out.println("Faculty of Computer Science\nand\nInformation Technology.");

        //Question 2
        System.out.println("\"SDN\" - Software-defined networking");
        
        //Question 3
        //a :System.out.println("Java Programming"); 
        //   miss "out" and p is not in capital letter

        //b : System.out.println("Introduction to Java!"); 
        // "in" to "out" and miss symbol ;

        //c :System.out.println("\\t is the horizontal tab character"); 
        //  \\ to print normal \
        
        //d :System.out.println("Java is case sensitive!" ); 
        //  System should start with capital letter 

        //Question 4
        //a
        int matricNumber;
        //b
        double pi;
        //c
        boolean M = false;
        //d
        long P =  8800000000L;
        //e
        char letter = 'u';
        //f
        final String PRO = "Java";

        //Question 5
        //a
        double AMOUNT = 32.5; //remove final and symbol ""
        AMOUNT += 10;
        System.out.println("The amount is " + AMOUNT); 
        //b
        String chapter = "Summary"; //string to upper case and '' to ""
        System.out.println(chapter); 
        //c
        int num = 0;//initialize num to 0
         ++num;//remove ++ from one side
        int num1 = num;//declare num1
        //d
        int Num = 3000;
         System.out.printf("%4d\n", Num); //turn Num to num and remove %4.2d to %4d
        //e
        String contact; 
        Scanner keyboard = new Scanner(System.in);//declare scanner
        contact = keyboard.nextLine();

        //Question 6
        System.out.print("Enter diameter: ");
        double dismeter = keyboard.nextDouble();
        double radius = dismeter / 2;
        double circumference = 2 * Math.PI * radius;
        System.out.printf("The circumference is: %.2f\n", circumference);

        //Question 7
        System.out.print("Enter distance in inches: ");
        double inches = keyboard.nextDouble();
        double meters = inches * 2.54*0.01;
        System.out.printf("%.2f inches = %,2f meters\n", inches, meters);
    }
}
