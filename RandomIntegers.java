//RandomIntegers.java
//Shifted and scaled random integers
import java.security.SecureRandom;
public class RandomIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom randomNumbers = new SecureRandom(); //randomNumbers object will produce secure random numbers
		
		for (int counter=1; counter<=20; counter++) {
			int face = 1 + randomNumbers.nextInt(7); //shifted value
			System.out.printf("%d", face); // display generated value
			
			if(counter%5==0) //if counter is divisible by 5, start a new line of output
				System.out.println();
		}

	}

}
