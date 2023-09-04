import java.util.*;

class NumberGame
{
	public static void main(String args[])
	{
		System.out.println("Welcome to NumberGame ");
		System.out.println("Here You have to guess a Correct  Number to win the game ");
		System.out.println("You have maximum 3 attempt");
		Random no=new Random();
		int k=no.nextInt(100);
		Scanner sc=new Scanner(System.in);
		int cnt=0;
		int m=5;
		for(int i=1;i<=5;i++)
		{
		  System.out.println("Enter Guess No: ");
		  int n=sc.nextInt();
		  
		  if(n==k)
		  {
		  	System.out.println("OOhhOO!,Your number is correct you win the game");
		  	cnt=1;
		  	break;
		  }
		  else if (n<k)
		  {
		  	System.out.println("Your guess number is Smaller");
		  }
		  else
		  {
		  		System.out.println("Your guess number is Greater");
		  }
		  m--;
		  System.out.println("You Have "+m+" Attempts Left.>.!");
		  
	  }
	  if(cnt!=1)
	  {
	  		System.out.println("Sorry ! You loose the game");
	  }
	}
}
