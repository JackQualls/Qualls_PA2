import java.util.Arrays;
import java.util.Scanner;
public class Decrypter {

	public static int decrypt(int valIn) {
		//read 4 digit entered code
		
		 int placehold = 0;
	      int[] input = new int[4];
	      for (int i = 3; i >=0; i--) {
	         input[i] = valIn % 10;
	         valIn /= 10;
	      }
	    //swap first and third digit
		  placehold=input[0];
		  input[0]=input[2];//replaces digit 1 with 3
		  input[2]=placehold;//replaces digit 3 with 1
		//swap second and fourth digit
		  placehold=input[1];
		  input[1]=input[3];//replaces digit 2 with 4
		  input[3]=placehold;//replaces digit 4 with 2
		  
		//undo x+7%10
		  for(int i = 0; i < input.length; i++){
			    input[i]=(input[i]+3)%10;
			  }
		
		  // converts array numbers to single int output
	      int output = 0;
	      for (int i = 0; i < 4; i++) {
	         output *= 10;
	         output += input[i];
	      }
		//print encryption
		
	      return output;
			  
		  
	}

}
