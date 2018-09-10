import java.util.Scanner;

public class decisionMaker
	{

		public static void main(String[] args)
			{
				System.out.println("How many choices are you considering?");
				Scanner choices = new Scanner(System.in);
				String userChoices = choices.nextLine();
				
				for(int i = 0; i < userChoices.length(); i++)
					{
						System.out.println("Please input choice #" + userChoices.substring(i, i + 1));
					}
				
			
			}

	}
