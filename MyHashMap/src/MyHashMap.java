
public class MyHashMap {

	private String[] plateCodes;
	private String[] tempPlateCodes; 
	
	private String[] cities;
	private String[] tempCities; 
	
	public MyHashMap() {
		plateCodes = new String[0];
		cities = new String[0];
	}
	public void add(String plateCode,String city) {
		tempPlateCodes = plateCodes;
		tempCities = cities;
		
		plateCodes= new String[plateCodes.length+1];
		cities = new String[cities.length+1];
		
		for(int i=0; i< tempPlateCodes.length; i++) {
			plateCodes[i] = tempPlateCodes[i];
			cities[i] = tempCities[i];
		}
			
		cities[cities.length-1] = city;
		plateCodes[plateCodes.length-1] = plateCode;
	}
	
	public String[] listData() {
		String[] city=new String[this.cities.length];
		for (int i = 0; i < cities.length; i++) {
			
			city[i]  = plateCodes[i]+","+cities[i];
			
		}
		return city;
		
		
	}
}
