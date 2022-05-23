
public class CreateDog
	{

		public static void main(String[] args)
			{
			Dog myDog = new Dog("Millie", 3, "Chocolate lab");
			
			System.out.println("My dog's name is " + myDog.getName());
			myDog.setName("Penny");
			
			System.out.println("My dog's name is now " + myDog.getName());

			}

	}
