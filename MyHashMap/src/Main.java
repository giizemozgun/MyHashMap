

public class Main {

	public static void main(String[] args) {
		MyHashMap cities = new MyHashMap();
		
		cities.add("1", "Adana");
		cities.add("57", "Sinop");
		cities.add("34", "İstanbul");
		
		for(String item:cities.listData()) {
			System.out.println(item);
		}

	}

}
