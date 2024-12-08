import java.util.Scanner;
public class IT24400002LAB5Q1{
public static void main(String[] args){


Scanner input =new Scanner(System.in);

int smallest, largest;

System.out.print("Enter the first integer :");
int num1=input.nextInt();
System.out.print("Enter the second integer :");
int num2=input.nextInt();
System.out.print("Enter thee third integer :");
int num3=input.nextInt();

System.out.println("User entered numbers are: " + num1 + " " + num2 + " " + num3);
if (num1>num2&&num1>num3){
largest=num1;}

else if (num2>num3){
largest=num2;}

else { largest=num3;}


if (num1<num2&&num1<num3){
smallest=num1;}

else if (num2<num3){
smallest=num2;}

else { smallest=num3;}

System.out.println("The Smallest number is: " + smallest);
System.out.println("The Largest number is: " + largest);

        input.close();




	}
}