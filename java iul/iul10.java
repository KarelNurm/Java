import java.util.Scanner;
public class iul10 {
	  public static void main(String[] args) {
		  //Palju numbreid tuleb v�lja printida
		    for(int number = 1; number <= 66; number++) {
		    	//palju numbreid �hte ritta mahub
		        if(number % 14 == 0 && number > 0)
		            System.out.println(number);
		        else
		            System.out.print(number + " ");
		    }
	  }
}


