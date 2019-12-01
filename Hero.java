// Hero implementiert das Comparable-Interface für den Typ Hero
public class Hero implements Comparable<Hero>{

    // attributs
    private String name;
    private int age;

    // constructeurs
    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Vergleichsmethode implementieren, nach der mittels Collections.sort() sortiert werden soll
    @Override
    public int compareTo(Hero anotherHero) {
    	// Es wird nach dem Namen des Hero aufsteigend sortiert
    	return this.getName().compareTo(anotherHero.getName());
    }
    

    // accesseurs (getters)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // mutateurs (setters)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}