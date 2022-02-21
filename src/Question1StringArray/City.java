package Question1StringArray;

public class City {
	public String[] cityName = { "Toronto", "Mississauga", "Brampton", "Timins" };

	public String setCity(String city) {
		for (int i = 0; i < city.length(); i++) {
			cityName[i] = city;
			if (cityName[i].equals(city)) {
				System.out.println("City name found");
				break;
			}
		}
		return "City not found in the list";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City city = new City();
		
		city.setCity("Toronto");
		
		for (int i = 0; i < city.cityName.length; i++) {
			if(city.cityName[i].startsWith("T") ) {
				System.out.println(city.cityName[i].replace("T", "Mississauga"));
			}
		}
		
	}
}
