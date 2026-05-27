import java.util.Scanner;
public class EvenNumbers{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        
System.out.println("Enter a number");
int userInput = input.nextInt(); 

if(userInput % 2 == 0){
System.out.println("Even");
}
else{
System.out.println("Odd");
}
}
}

