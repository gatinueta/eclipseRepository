package ch.frank;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RestClient {

	private static final String REST_URI = "https://samples.openweathermap.org/data/2.5/weather";
	private static final Object APP_ID = "b6907d289e10d714a6e88b30761fae22";

	private Client client = ClientBuilder.newClient();

	public RestClient() {
		new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

	}

	public WeatherData getWeather(String city) {
		return client.target(REST_URI).queryParam("q", city).queryParam("appid", APP_ID)
				.request(MediaType.APPLICATION_JSON).get(WeatherData.class);
	}
}
