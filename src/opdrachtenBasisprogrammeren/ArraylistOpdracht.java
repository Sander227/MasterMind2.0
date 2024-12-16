package opdrachtenBasisprogrammeren;

	import java.util.*;

	public class ArraylistOpdracht {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ArrayList<String> superheroes = new ArrayList<>();
	        Random random = new Random();

	        
	        System.out.println("Voeg 5 superhelden toe aan het team.");
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Naam voor de superheld " + (i + 1) + ": ");
	            String hero = scanner.nextLine();
	            superheroes.add(hero);
	        }

	        boolean running = true;
	        while (running) {
	            System.out.println("\nKies een optie:");
	            System.out.println("1. Superheld toevoegen");
	            System.out.println("2. Superheld verwijderen");
	            System.out.println("3. Team bekijken");
	            System.out.println("4. Sorteer je team");
	            System.out.println("5. Missie voltooien");
	            System.out.println("6. Stoppen");

	            int choice = scanner.nextInt();
	            scanner.nextLine();
	            switch (choice) {
	                case 1:
	                   
	                    System.out.print("Voer de naam van de nieuwe superheld in: ");
	                    String newHero = scanner.nextLine();
	                    superheroes.add(newHero);
	                    System.out.println(newHero + " is toegevoegd aan het team!");
	                    break;

	                case 2:
	                  
	                    System.out.println("Huidige teamleden: " + superheroes);
	                    System.out.print("Voer de naam van de superheld in die je wilt verwijderen: ");
	                    String removeHero = scanner.nextLine();
	                    if (superheroes.remove(removeHero)) {
	                        System.out.println(removeHero + " is verwijderd uit het team.");
	                    } else {
	                        System.out.println(removeHero + " staat niet in het team.");
	                    }
	                    break;

	                case 3:
	                    
	                    System.out.println("Huidig team: " + superheroes);
	                    break;

	                case 4:
	                  
	                    System.out.println("Team vóór sorteren: " + superheroes);
	                    Collections.sort(superheroes);
	                    System.out.println("Team na sorteren: " + superheroes);
	                    break;

	                case 5:
	                 
	                    if (superheroes.size() < 3) {
	                        System.out.println("Er zijn minimaal 3 superhelden nodig voor een missie.");
	                        break;
	                    }
	                    System.out.println("Kies een missie:");
	                    System.out.println("1. Red de stad");
	                    System.out.println("2. Vind de slechterik en versla hem");
	                    System.out.println("3. Vind de kat van oma");
	                    int missionChoice = scanner.nextInt();
	                    scanner.nextLine(); 

	                    String mission = switch (missionChoice) {
	                        case 1 -> "Red de stad";
	                        case 2 -> "Vind de slechterik en versla hem";
	                        case 3 -> "Vind de kat van oma";
	                        default -> "Onbekende missie";
	                    };

	                    ArrayList<String> heroesOnMission = new ArrayList<>();
	                    while (heroesOnMission.size() < 3) {
	                        String selectedHero = superheroes.get(random.nextInt(superheroes.size()));
	                        if (!heroesOnMission.contains(selectedHero)) {
	                            heroesOnMission.add(selectedHero);
	                        }
	                    }

	                    System.out.println("Superhelden op missie (" + mission + "): " + String.join(", ", heroesOnMission));
	                    break;

	                case 6:
	               
	                    System.out.println("Programma beëindigd. Bedankt voor het spelen!");
	                    running = false;
	                    break;

	                default:
	                    System.out.println("Ongeldige keuze. Probeer opnieuw.");
	            }
	        }

	        scanner.close();
	    }
	}


