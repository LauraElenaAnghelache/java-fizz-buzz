package jana60;


public class FizzBuzz {

	public static void main(String[] args) {
		// Scrivi un programma che stampi i numeri da 1 a 100, ma per i multipli di 3 stampi Fizz al posto del numero e per i multipli di 5 stampi Buzz. Per i numeri che sono sia multipli di 3 che di 5 stampi FizzBuzz.

		System.out.println("Inizia il Gioco ");

         for (int i = 1;i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0 ) {
				System.out.println("FIZZ-BUZZ! "); //è un multiplo di 3 o di 5?
			}
	    else if (i % 3 == 0) {
			System.out.println("FIZZ! "); //è un multiplo di 3?
		    }
	    else if (i % 5 == 0) {
			System.out.println("BUZZ! "); //è un multiplo di 5?
		    }
		else {
			System.out.println(i); // non è un multiplo di 3 o 5
		}
				
		}
	}
	

}
