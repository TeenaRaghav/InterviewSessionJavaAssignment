package practiseCodes;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class HackerRankCurrencyFormat {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the payment: ");
		double payment = sc.nextDouble();
		sc.close();
		
		NumberFormat uNF = NumberFormat.getInstance(Locale.US);
		NumberFormat frNF = NumberFormat.getInstance(Locale.FRANCE);
	    NumberFormat chNF = NumberFormat.getCurrencyInstance(Locale.CHINA);

	    Locale inLocale = new Locale("en","in");
	    NumberFormat inNF = NumberFormat.getCurrencyInstance(inLocale);

	    System.out.println("US: "+ uNF.format(payment));
	    System.out.println("CHINA: "+ chNF.format(payment));
	    System.out.println("FRANCE: "+ frNF.format(payment));
	    System.out.println("INDIA: "+ inNF.format(payment));

	    
		
		
	}

}
