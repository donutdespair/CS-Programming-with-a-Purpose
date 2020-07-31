public class UseThree
{
	public static void main(String[] args)
	{
		//Accepts 3 command-line arguments typed after the program name 
		//and prints it to the terminal window as part of the message.
        System.out.print("Hi, ");
        System.out.print(args[2]);
        System.out.print(", ");
        System.out.print(args[1]);
        System.out.print(", and ");
        System.out.print(args[0]);
        System.out.println(".");
	}
}