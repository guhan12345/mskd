import java.util.*;
public class Main
{
	public static void main(String[] args) {
	char i;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the alphabet");
	i=s.next().charAt(0);
	if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u')
	{
	    System.out.println("the given alphabet is vowel");
	}
	else
	{
	    System.out.println("the given alphabet is constant");
	}
	}
}
