//Part 1 : Create a String array which stores names of cities using initialization block.
//Part 2 : Add code to take a city name as input and search that city name is array created in part1 . 
//IF a match is found, then print “City name found” else print “City not found in the list”
//Part 3 : Replace a city which starts with ‘T’   with new city name. New city name = “Mississauga”.

package Question1StringArray;

import java.util.Scanner;
public class City {
	public String[] cityName = { "Toronto", "Mississauga", "Brampton", "Timins, Ottawa, ThunderBay" };

	public String setCity(String city) {
		for (int i = 0; i < city.length(); i++) {
			cityName[i] = city;
			if (cityName[i].equalsIgnoreCase(city)) {
				System.out.println("City name found");
				break;
			}
		}
		return "City not found in the list";
	}
	
	public void replaceCityIndex(){
	    for (int i = 0; i < cityName.length; i++) {
			if (cityName[i].startsWith("T")) {
			    System.out.println("\nReplacing City name starting with T");
				System.out.println(cityName[i].replace(cityName[i], "Mississauga"));
				break;
			}
			else{
			    System.out.println("City name  doesn't start with T");
			    break;
			}
		}
	  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		City city = new City();
        System.out.println("Enter city name");
        String newCity = sc.next();
		city.setCity(newCity);
		
        city.replaceCityIndex();
        
	}
}
