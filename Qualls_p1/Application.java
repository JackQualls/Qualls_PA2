import java.util.Scanner;
import java.util.Arrays;
public class Application {
	
	public static void main(String[] args) {
		
		System.out.printf("1- Encrypt Data\n2- Decrypt Data\n\nChoose an option:");
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		 System.out.print("Please enter a 4 digit number: ");
	      int valIn = in.nextInt();
		
		if(choice==1) {
		      System.out.printf("%04d",Encrypter.encrypt(valIn));
		}
		
		else if(choice==2) {
			System.out.printf("%04d",Decrypter.decrypt(valIn));
		}
		else {System.out.printf("Invalid input. Try again");
			}
}
}
