import java.util.Scanner;
public class iul5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double x=0.0,y=0.0,z=0.0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Esimene arv: ");
         x=sc.nextDouble();
         System.out.print("Teine arv: ");
         y=sc.nextDouble();
         System.out.print("Kolmas arv: ");
         z=sc.nextDouble();
         //arvutad kõik kokku
         double series=x+y+z;
         // jagab esimese,teise ja kolmanda numbriga
         double parallel=1/x + 1/y +1/z;
         parallel /=1;
         System.out.println  ("Kui on järjestikkus siis takistus on "+ series + "\n"+ "kui paralleelselt siis ekv. vastupanu on " +parallel);
	}

}
