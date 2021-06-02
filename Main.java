import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		var bot = new Random();
		var user = new Scanner(System.in);
		var motion = new ArrayList<Integer>(3);

		System.out.println("Zagraj w gr� RPS! Kamie�, papier, no�yce przeciwko robotowi. Wszystkie prawa zastrze�one. Copyright by ITshnyk 2021");
		System.out.println("\"1\" kamie� \n "
				+ "\"2\" no�yce \n "
				+ "i \"3\" papier");
		
		for(int i = 0; i < 3; i++ ) {
			int userChoose = user.nextInt();
			String sUserChoose;
			int botChoose = bot.nextInt(3);
			String sBotChoose;
			
			if(userChoose < 4) {
				if(userChoose == 1) {
					sUserChoose = "kamie�";
					System.out.print(sUserChoose + " VS ");
				}else if(userChoose == 2) {
					sUserChoose = "no�yce";
					System.out.print(sUserChoose + " VS ");
				}else if(userChoose == 3){
					sUserChoose = "papier";
					System.out.print(sUserChoose + " VS ");
				}
				
				if(botChoose == 0) {
					sBotChoose = "kamie�";
					System.out.println(sBotChoose);
				}else if(botChoose == 1) {
					sBotChoose = "no�yce";
					System.out.println(sBotChoose);
				}else if(botChoose == 2){
					sBotChoose = "papier";
					System.out.println(sBotChoose);
				}	
			}else {
				System.out.println("Poda�e� z�� cyfr� mo�esz poda� cyfry 1, 2 lub 3");
				i--;
			}
						
			if(userChoose == 1 && botChoose == 0 || userChoose == 2 && botChoose == 1 || userChoose == 3 && botChoose == 2) {
				System.out.println("remis");
				i--;
			}else if(userChoose == 1 && botChoose == 1 || userChoose == 2 && botChoose == 2 || userChoose == 3 && botChoose == 0) {
				System.out.println("wygra�e�");
				motion.add(0);
			}else if(userChoose == 2 && botChoose == 0 || userChoose == 3 && botChoose == 1 || userChoose == 1 && botChoose == 2) {
				System.out.println("przegra�e�");
			}
			
			if(i == 2) {
				System.out.println("Gra sko�czona! Tw�j wynik to: \n"
						+ motion.size() + "/3");
			}
		}
	}
}