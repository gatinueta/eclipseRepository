package ch.frank;

public class Main {
	public static void main(String[] args) {
		String city = "London,uk";
		 WeatherData weather = new RestClient().getWeather(city);
		 System.out.println(weather);
	}
}
