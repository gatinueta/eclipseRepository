package ch.frank;

import java.math.BigDecimal;

public class MainData {
	/**
	 * 	"main": {
			"temp": 280.32,
			"pressure": 1012,
			"humidity": 81,
			"temp_min": 279.15,
			"temp_max": 281.15
	 */
	private BigDecimal temp;
	private BigDecimal pressure;
	private BigDecimal humidity;
	private BigDecimal temp_min;
	private BigDecimal temp_max;

	public BigDecimal getTemp() {
		return temp;
	}
	public void setTemp(BigDecimal temp) {
		this.temp = temp;
	}
	public BigDecimal getPressure() {
		return pressure;
	}
	public void setPressure(BigDecimal pressure) {
		this.pressure = pressure;
	}
	public BigDecimal getHumidity() {
		return humidity;
	}
	public void setHumidity(BigDecimal humidity) {
		this.humidity = humidity;
	}
	public BigDecimal getTemp_min() {
		return temp_min;
	}
	public void setTemp_min(BigDecimal temp_min) {
		this.temp_min = temp_min;
	}
	public BigDecimal getTemp_max() {
		return temp_max;
	}
	public void setTemp_max(BigDecimal temp_max) {
		this.temp_max = temp_max;
	}
	@Override
	public String toString() {
		return "MainData [temp=" + temp + ", pressure=" + pressure + ", humidity=" + humidity + ", temp_min=" + temp_min
				+ ", temp_max=" + temp_max + "]";
	}
	
}
