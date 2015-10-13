package bucket;

import java.util.Random;
import java.util.Scanner;

public class Sisinsusin {
	public static void main(String[] args) {
		
		//esiteks see osa, kus programm genereerib suvalise arvu
		Random randomGenerator = new Random(); //selle võtsin siit: http://www.javapractices.com/topic/TopicAction.do?Id=62
		//for (int idx = 1; idx <= 10; ++idx){ //selle võtsin siit: http://www.javapractices.com/topic/TopicAction.do?Id=62
		int randomInt = randomGenerator.nextInt(100); //selle võtsin siit: http://www.javapractices.com/topic/TopicAction.do?Id=62
			System.out.println(randomInt); //selle võtsin siit: http://www.javapractices.com/topic/TopicAction.do?Id=62
		
			//teiseks see osa, kus mängija peab pakutule reageerima 
			int vastus;
			Scanner sisinsusin = new Scanner(System.in);
			System.out.println("Kui see arv jagub 3ga, ütle 3. Kui 5ga, ütle 5. Kui mõlemaga, ütle 53. Kui mitte kummagagi, liida arvule 42");
			vastus = sisinsusin.nextInt();
			switch (vastus) {
			case 1:
			}
				System.out.println("Tubli! Võta kapist pirukat!");
			  System.out.println("Läks vähe nihu");
	}

}

//TODO
//"ütle 3 või 5 asemel sisin, susin ja sisinsusin"
//kuidas öelda, et sisinsusin on siis kui jagub nii kolme kui ka viiega.
//42 asemel võiks ka rändom arv olla
// ja kuidas teha selline loogiline tingimus, et 42 saab liita ainult siis, kui 3 ja 5 ei jagu

	    
	    
	      

	    
