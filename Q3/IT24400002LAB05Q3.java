import java.util.Scanner;
public class IT24400002LAB05Q3{
public static void main(String []args){

Scanner input=new Scanner(System.in);
int dis ,days ,total;
final int RPRICE=48000;

System.out.print ("Enter Start date (1-31) :");
int sdays=input.nextInt();
System.out.print ("Enter end date (1-31) :");
int edays=input.nextInt();

if (sdays < 1 || sdays > 31 || edays < 1 || edays > 31){
System.out.print("Error : Days must be between 1 and 31");}
else if (sdays>edays){
System.out.print("Error : Start Date must be less than End Date");}
else {
	days=edays-sdays;
	if (days==3||days==4){
	dis=days*10;
	total=RPRICE*days-dis;
	}

	else if (days>=5){
	dis=days*20;
	total=RPRICE*days-dis;
	}

	else {total=days*RPRICE;
	}
System.out.println("Room Charges Per Day ; RS. 48000.0/=");
System.out.println("Number Of Days Reserved : " +days);
System.out.println("Total Amount to Be Paid : "+total);
		}
input.close();


	}
}