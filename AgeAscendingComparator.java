import java.util.Comparator;

public class AgeAscendingComparator implements Comparator<Hero>{

	public AgeAscendingComparator() {
	}

	@Override
	public int compare(Hero hero1, Hero hero2) {
		return Integer.valueOf(hero1.getAge()).compareTo(Integer.valueOf(hero2.getAge()));
	}

}
