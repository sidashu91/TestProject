package multiLevel;

import java.util.Scanner;

public class Sports extends Marks{

int score ;

void inputScore()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the score");
score = sc.nextInt();

}


void display() 
{
System.out.println(name+" "+rollNo+" "+marks+" "+score);	

}
	
}
