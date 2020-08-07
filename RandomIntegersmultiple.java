import java.security.SecureRandom;
public class RandomIntegersmultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom randomNumbers = new SecureRandom();
		
		int freq1 = 0; //count of 1s rolled
		int freq2 = 0; //count of 2s rolled
		int freq3 = 0; //count of 3s rolled
		int freq4 = 0; //count of 4s rolled
		int freq5 = 0; //count of 5s rolled
		int freq6 = 0; //count of 6s rolled
		
		for (int count=1; count<=6000000; count++) {
			int face = 1 + randomNumbers.nextInt(6);
			
			switch (face) 
			{
			case 1:
				++freq1;
				break;
			case 2:
				++freq2;
				break;
			case 3:
				++freq3;
				break;
			case 4:
				++freq4;
				break;
			case 5:
				++freq5;
				break;
			case 6:
				++freq6;
				break;
			
			}
				
		}
		
		System.out.println("Face\tFrequency");
		System.out.printf("1\t%d\n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", freq1, freq2, freq3, freq4, freq5, freq6);
		
	}

}
