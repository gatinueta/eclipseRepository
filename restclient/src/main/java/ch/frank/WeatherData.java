package ch.frank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class WeatherData {
	private Coord m_coord;


	private MainData main;
	private String name;
	
	public Coord getCoord() {
		return m_coord;
	}

	public void setCoord(Coord coord) {
		m_coord = coord;
	}
	
	public MainData getMain() {
		return main;
	}

	public void setMain(MainData main) {
		this.main = main;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "WeatherData [m_coord=" + m_coord + ", main=" + main + ", name=" + name + "]";
	}
	
}
