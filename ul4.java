
import java.util.Scanner;



public class ul4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in); //kasutaja sisestus
		System.out.print("Sisesta oma nimi: "); 
		String nimi = scanner.nextLine(); //lisab sisestuse s�ne muutujasse
		System.out.print("Sisesta oma vanus: "); 
		int vanus = scanner.nextInt(); //lisab sisestuse t�isarvu muutujasse
		 
		System.out.println("Tere "+nimi.toUpperCase()+", "+vanus+"!"); // v�ljastab nime ja vanuse
		System.out.println("S�nas on "+nimi.length()+" t�hem�rki"); // v�ljastab mitu t�hem�rki on s�nas
		
		//S�nade kokku lugemine
        int count = 1;

        for (int i = 0; i < nimi.length(); i++) 
        {
            if (nimi.charAt(i) == ' ') // kui on t�hik sees siis paneb +1 s�nale juurde 
            {
                count++; // loetab kokku
            } 
        }

        System.out.println("S�nasi kokku = " + count); // V�ljastab mitu s�na on nimes.
		
        String esimene[] = nimi.split(" ", 2);
        System.out.printf("Esimene s�na: %s",esimene);
        
        scanner.close();
	}

}
