package Packages2;

public class Cow {

	public static void main(String[] args) {
		  int rc = 5, spaceCounter = 4, starCounter = 1;
		  for (int i = 0; i <=5; i++) { //main Loop
		 
			
			for (int j = 0; j <=spaceCounter; j++) { //Space counter
				System.out.print(" ");
				for (int k = 0; k <=starCounter; k++) { // Star Counter
					System.out.print("*");
					spaceCounter--;
					starCounter=starCounter+2;
				}
				
			}
			System.out.println();
		}
	}
}
