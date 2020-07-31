public class UserArgument
{
	public static void main(String[] args)
	{
		//Accepts command-line argument typed after the program name 
		//and prints it to the terminal window as part of the message.
		System.out.print("Hi, ");
		System.out.print(args[0]); 
		// args[0] is the first command-line argument
		System.out.println(". How are you?"); 
	}
}