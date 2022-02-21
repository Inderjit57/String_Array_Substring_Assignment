package Question2_SubString;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "100 queen street,Toronto,M5V 3E3";

		String streetAddress = str.substring(0, str.indexOf(",T"));
		String city = str.substring(str.indexOf("Toronto"), str.indexOf(",M"));
		String postalCode = str.substring(str.indexOf("M5V 3E3"));

		System.out.println(streetAddress);
		System.out.println(city);
		System.out.println(postalCode);

	}

}
