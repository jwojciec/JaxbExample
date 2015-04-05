import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CATALOG")
public class Catalog {
	
	List<Plant> plants;

	public List<Plant> getPlants() {
		return plants;
	}

	@XmlElement(name="PLANT")
	public void setPlants(List<Plant> plants) {
		this.plants = plants;
	}
	
	

}
