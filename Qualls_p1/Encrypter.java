import java.util.Arrays;
import java.util.Scanner;
public class Encrypter {

	public static int encrypt(int valIn) {
		//read 4 digit entered code
		 
		 int placehold = 0;
		 
	      int[] input = new int[4];
	      for (int i = 3; i >=0; i--) {
	         input[i] = valIn % 10;
	         valIn /= 10;
	      }
		//add seven to each digit
		//divide the result by 10
		  for(int i = 0; i < input.length; i++){
			    input[i]= input[i]+7;
			    input[i]=input[i]%10;
			  }
		//swap first and third digit
		  placehold=input[2];
		  input[2]=input[0];//replaces digit 3 with 1
		  input[0]=placehold;//replaces digit 1 with 3
		//swap second and fourth digit
		  placehold=input[3];
		  input[3]=input[1];//replaces digit 4 with 2
		  input[1]=placehold;//replaces digit 2 with 4
	
		
		//print encryption
		  // converts array numbers to single int output
	      int output = 0;
	      for (int i = 0; i < 4; i++) {
	         output *= 10;
	         output += input[i];
	      }
	      	return output;
			  
		  
	}

}
