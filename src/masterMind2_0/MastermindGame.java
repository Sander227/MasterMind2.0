package masterMind;

		import java.util.Random;
		import java.util.Scanner;
		 
		public class MastermindGame {
		    private static final String[] COLORS = {"Rood", "Groen", "Blauw", "Geel", "Oranje", "Paars"};
		    private String[] secretCode = new String[4];
		 
		    public MastermindGame() {
		        generateSecretCode();
		    }
		 
		    private void generateSecretCode() {
		        Random rand = new Random();
		        for (int i = 0; i < 4; i++) {
		            secretCode[i] = COLORS[rand.nextInt(COLORS.length)];
		        }
		    }
		 
		    public void play() {
		        Scanner scanner = new Scanner(System.in);
		        boolean won = false;
		        int attempts = 0;
		 
		        while (!won && attempts < 10) {
		            System.out.println("Voer je gok in (bijv. Rood Groen Blauw Geel):");
		            String[] guess = scanner.nextLine().split(" ");
		            String feedback = getFeedback(guess);
		            System.out.println("Feedback: " + feedback);
		            if (feedback.equals("4 correct")) {
		                won = true;
		            }
		            attempts++;
		        }
		 
		        if (won) {
		            System.out.println("Gefeliciteerd! Je hebt de code gekraakt.");
		        } else {
		            System.out.println("Helaas, je hebt verloren. De geheime code was: " + String.join(" ", secretCode));
		        }
		    }
		 
		    private String getFeedback(String[] guess) {
		        int correct = 0;
		        for (int i = 0; i < 4; i++) {
		            if (guess[i].equals(secretCode[i])) {
		                correct++;
		            }
		        }
		        return correct + " correct";
		    }
		 
		    public static void main(String[] args) {
		        MastermindGame game = new MastermindGame();
		        game.play();
		    }
		}
					
					
					
					
					
			
	
	


