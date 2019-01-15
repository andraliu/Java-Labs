import java.util.Scanner; //allows user to type in information

public class UserInput //sorts code into a class
{

	public static void main(String[] args) //sorts code into a string
	{
		
		Scanner keyboard = new Scanner(System.in); //allows input to be typed into program
		int n = keyboard.nextInt(); //creates variable n and sets it to the integer typed in on the keyboard
		System.out.println("2 * " + n + "=" + (n+n)); //prints out 2*n = (n+n) when integer is typed in on the keyboard
		
		
		//int y = n + n + n;
		//System.out.println("3 *" + n + "=" + y);

	}

}
