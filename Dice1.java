import java.util.Random;

public class Dice1{

   private Random randGen;

   public Dice1 ( ) {
      randGen = new Random ( );
   }

   public int nextRoll( ) {
      // You supply this code.
	  return -1; 
   }
	
   public void tester (int howMany) {
	  int k;
	  k = 0;
	  while (k < howMany) {
	     System.out.println (nextRoll ( ));
	     k = k + 1;
	  }
   }
   
  
}
