import java.util.Scanner;
public class iul7 {

    // Function that returns true if
    // str is a palindrome
	  public static void main(String args[]){
		Scanner Scanner =new Scanner (System.in);

		System.out.print("Sisesta nimi: ");
		String myString = Scanner.nextLine();
		//Saab sisestatud nime kätte
	      StringBuffer buffer = new StringBuffer(myString);
	      //Kontrolib nime tagur pidi kas on samma moodi või ei ole.
	      buffer.reverse();
	      String data = buffer.toString();
	      if(myString.equals(data)){
	         System.out.println("On palindroom ");
	      }else{
	         System.out.println("Ei ole palindroom");
	      }
	   }
	}