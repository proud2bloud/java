import java.util.Scanner;
public class ParkingCharges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the total number of hours: ");
		double hours = input.nextDouble();
		
		System.out.printf("The total parking charge is $%.2f. Thank you", calculateCharge(hours));

	}
	
	public static double calculateCharge(double hours) {
		
	if (hours <= 3)
		return 2.0;
	
	
	else if (hours > 3 && hours < 24)
		return 	2.0 + ((hours-3)*0.5);
	
	else 
		return 10.0 + (hours%24)*0.5;
	
	
				
			
	}

}