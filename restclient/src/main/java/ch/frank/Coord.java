package ch.frank;

import java.math.BigDecimal;

public class Coord {
	private BigDecimal m_lon;
	private BigDecimal m_lat;
	public BigDecimal getLat() {
		return m_lat;
	}
	public void setLat(BigDecimal lat) {
		m_lat = lat;
	}
	public BigDecimal getLon() {
		return m_lon;
	}
	public void setLon(BigDecimal lon) {
		m_lon = lon;
	}
	@Override
	public String toString() {
		return "Coord [m_lon=" + m_lon + ", m_lat=" + m_lat + "]";
	}
	
}
