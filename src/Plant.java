import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Plant {

	String common;
	String botanical;
	String zone;
	String ligth;
	String price;
	String availability;
	
	public String getCommon() {
		return common;
	}
	
	public String getBotanical() {
		return botanical;
	}

	public String getZone() {
		return zone;
	}

	public String getLigth() {
		return ligth;
	}

	public String getPrice() {
		return price;
	}

	public String getAvailability() {
		return availability;
	}
	
	@XmlElement(name="COMMON")
	public void setCommon(String common) {
		this.common = common;
	}	

	@XmlElement(name="BOTANICAL")
	public void setBotanical(String botanical) {
		this.botanical = botanical;
	}

	@XmlElement(name="ZONE")
	public void setZone(String zone) {
		this.zone = zone;
	}

	@XmlElement(name="LIGHT")
	public void setLigth(String ligth) {
		this.ligth = ligth;
	}

	@XmlElement(name="PRICE")
	public void setPrice(String price) {
		this.price = price;
	}

	@XmlElement(name="AVAILABILITY")
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	
	
	

}
