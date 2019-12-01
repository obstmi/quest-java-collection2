import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Thanos {

    public static void main(String[] args) {

        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Thor", 1501));

        // TODO 1 : Modify Hero to implements Comparable and sort by name (ascending)
        
        // 
        Collections.sort(heroes);


        System.out.println("\nOrder by name:");
        showList(heroes);

        // TODO 2: Add a Comparator and sort by age (descending)
        // anonymen Comparator erzeugen, der einen Vergleich für absteigende Sortierung implementiert

        Comparator<Hero> ageDescendingComparator = new Comparator<Hero>() {

        	@Override
			public int compare(Hero hero1, Hero hero2) {
				return Integer.valueOf(hero2.getAge()).compareTo(Integer.valueOf(hero1.getAge()));
			}
        	
        };
        
        // jetzt die ArrayList mit dem erzeugten Comparator absteigend sortieren und ausgeben

        Collections.sort(heroes, ageDescendingComparator);
        System.out.println("\nOrder by age (absteigend, mit anonymen Comparator):");
        showList(heroes);

        //Alternative 2: einen externen Comparator an die sort()-Methode übergeben (hier aufsteigend) und ausgeben
 
        Collections.sort(heroes, new AgeAscendingComparator());
        System.out.println("\nOrder by age (aufsteigend, mit separater Comparator-Klasse):");
        showList(heroes);

        
        //Alternatve 3: die sort()-Methode vom Interface List verwenden (wieder mit dem "absteigenden" Comparator) und ausgeben
 
        heroes.sort(ageDescendingComparator);
        System.out.println("\nOrder by age (wieder absteigend, dieses Mal mit sort()-Methode vom Interface List:");
        showList(heroes);
        
            }

    private static void showList(List<Hero> heroes) {
        for (Hero heroe : heroes) {
            System.out.println(heroe.getName() + ", " + heroe.getAge());
        }
    }
}