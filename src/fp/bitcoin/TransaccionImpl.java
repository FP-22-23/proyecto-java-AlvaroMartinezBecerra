package fp.bitcoin;

import java.time.LocalDate;
import java.util.Objects;

public class TransaccionImpl implements Bitcoin{
	
	  
	
	
	//ATRIBUTOS
	private LocalDate date;
	private Double open;
	private Double high;
	private Double low;
	private Double close;
	private Double adjClose;
	private Long volume;
	
	//MÉTODOS CONSTRUCTORES
	public TransaccionImpl(LocalDate date, Double open, Double close, Double adjClose) {
		this.date = date;
		this.open = open;
		this.close = close;
		this.adjClose = adjClose;
		
	}
	
	public TransaccionImpl(Double high, Double low, Long volume) {
		this.high = high;
		this.low = low;
		this.volume = volume;
		
	}
	
	
	//OTROS MÉTODOS
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
	}
	
	public Double getOpen() {
		return open;
	}
	
	public void setOpen(Double open) {
		
	}
	
	public Double getHigh() {
		return high;
	}
	
	public void setHigh(Double high) {		
	}	

	public Double getLow() {
		return low;
	}
	
	public void setLow(Double low) {		
	}

	public Double getClose() {
		return close;
	}
	
	public void setClose(Double close) {		
	}
	
	public Double getAdjClose() {
		return adjClose;
	}
	
	public void setAdjClose(Double adjDouble) {
	}
	
	public Long getVolume() {
		return volume;
	}

	public void setVolume(Long volume) {		
	}
	 
	public void valorEnEuros() {
		System.out.println("Los dolares son muchos más pequeños");
	}
	
	
	//REPRESENTACION COMO CADENA
	public String toString() {
		return "TransaccionImpl [date=" + date +
				", open=" + open +
				", high= " + high + ", low=" + low + ", close= " + close +
				", adjClose=" + adjClose + ", volume=" + volume + "]";
	}
	
	//CRITERIO DE IGUALDAD
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TransaccionImpl other = (TransaccionImpl) obj;
		return Objects.equals(date, other.date) && Objects.equals(open, other.open)
		&& Objects.equals(high, other.high) && Objects.equals(low, other.low) && 
		Objects.equals(close, other.close) && Objects.equals(adjClose, other.adjClose)
		&& Objects.equals(volume, other.volume);
		
	}
	
	//CRITERIO DE ORDEN NATURAL
	public int compareTo(Bitcoin o) {
		int r = this.getVolume().compareTo(o.getVolume());	
		if (r==0) {
			r = this.getDate().compareTo(o.getDate());
		}
	}	
	
	
	private void checkVolume(String s) {
		if(s.replaceAll(" ", "").equals("")) {
			throw new IllegalArgumentException(
					"El volume no puede estar vacío");
		}
	}
	
	private void checkDate(String s) {
		if(s.replaceAll(" ", "").equals("")) {
			throw new IllegalArgumentException(
					"La fecha no puede estar vacía");
		}
	}
	

}
