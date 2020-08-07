import java.security.SecureRandom;
public class Craps {
	private static final SecureRandom randomNumbers = new SecureRandom(); //create secure random number generator for use in method rollDice
	private enum Status {CONTINUE, WON, LOST}; //enum type with constants that represent the game status
	
	//constants that represent common rolls of the dice
	
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	
	//plays one game of craps
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myPoint = 0; // point if no win loss on first roll
		Status gameStatus; //can contain CONTINUE, WON or LOST
		
		int sumOfDice = rollDice(); // first roll of the dice
		
		//determine game status and point based on first roll
		switch (sumOfDice)
		{
		case SEVEN: //win with 7 on first roll
		case YO_LEVEN: //win with 11 on first roll
			gameStatus = Status.WON;
			break;
		case SNAKE_EYES: //lose with 2 on first roll
		case TREY: //lose with 3 on first roll
		case BOX_CARS: // lose with 12 on first roll
			gameStatus = Status.LOST;
		default: //did not win or lose, so remember point
			gameStatus = Status.CONTINUE;
			myPoint = sumOfDice;
			System.out.printf("Point is %d", myPoint);
			break;
		}	
			
		//while game is not complete
		while (gameStatus == Status.CONTINUE) {
			
			//not win or lost
			sumOfDice = rollDice(); //roll dice again
			if (sumOfDice == myPoint) //win by making point
				gameStatus = Status.WON;
			else
				if(sumOfDice == SEVEN) //lose by rolling 7 before point
					gameStatus = Status.LOST;
		}
		if (gameStatus == Status.WON)
			System.out.println("Player wins");
		else
			System.out.println("Player loses");
	
	}
	
	//roll dice, calculate sum and display results
	public static int rollDice() {
		//pick random die values
		int die1 = 1 + randomNumbers.nextInt(6); //first die roll
		int die2 = 1 + randomNumbers.nextInt(6); //second die roll
		
		int sum = die1 + die2;
		
		System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
		return sum;
	}
	

}
