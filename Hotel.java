import java.util.*;
import java.io.*;
public class Hotel{
public static void main (String args[]){
Random random = new Random();
Scanner mom = new Scanner(System.in);
int number;
System.out.println("Hello welcome to our hotel\nHow can I help you?\n");
System.out.println("1- I want to find a room");
System.out.println("2- I want a room");
System.out.println("3- I want to pay for my stay in hotel");
int Answer = mom.nextInt();
if(Answer == 1)
{
System.out.print("please tell me the number of the room? ");
number = mom.nextInt();

if(number<=5 && number>=1)
{
	System.out.println("Go to fisrt floor you can find it in there.");
}

else if(number>=6 && number<=10)
{
	System.out.println("Go to second floor you can find it in there.");
}
else if (number>=11 && number<=15)
{
	System.out.println("Go to third floor you can find it in there.");
}
else
{
	System.out.println("This hotel contain 3 floor with 15 room.");
}
}

else if(Answer == 2)
{
	System.out.print("How many person you are? ");
	number = mom.nextInt();

	if(number>=1 && number<=3)
	{
		System.out.println("ok we have it.");
	}
	else if(number>3 && number<=7)
	{
		System.out.println("Sorry we don't have it.");
	}
	else
	{
		System.out.println("Sorry! are you kidding.");
	}
}

else if(Answer == 3)
{
	System.out.print("How many daies you have been stay: ");
	number = mom.nextInt();

	System.out.println("You have to pay " + number * 5 + "$");
}
else
{
	System.out.println("please choose one of them");
}










}
}















































