import java.util.Scanner;

public class h7_kareln {
		//Karel Nurmetalo
		//5/6/2021
	 public static void main(String[] args) {
		    while (1==1) {
		        try {
		        Scanner Scanner = new Scanner(System.in);
		        System.out.print("Esimene arv: ");
		        double arv = Scanner.nextInt();


		        System.out.print("Teine arv: ");
		        double arv2 = Scanner.nextInt();

		        double arvutamine = arv*arv2-arv;
		        System.out.print(arvutamine);
		        break;
		    }
		        catch (Exception e) {
		            System.out.println("Sisesta number!!!");
		        }

		}
		}
		}
