package fp.bitcoin;

import java.time.LocalDate;

public interface Bitcoin {
	
	public LocalDate getDate();
	public void setDate(LocalDate date);
	
	public Double getOpen();
	public void setOpen(Double open);  
	
	public Double getHigh();
	public void  setHigh(Double high);
	
	public Double getLow();
	public void setLow(Double low);
	
	public Double getClose();
	public void setClose(Double close);
	
	public Double getAdjClose();
	public void setAdjClose(Double adjDouble);
	
	public Long getVolume();
	public void setVolume(Long volume);

}

 