import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
 
public class JaxBExample {
	public static void main(String[] args) {
 
	 try {
 
		File file = new File("plants.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Catalog.class);

		//Unmarshall xml to class
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Catalog catalog = (Catalog) jaxbUnmarshaller.unmarshal(file);
		
		for(Plant plant : catalog.getPlants()){
			System.out.println("--------------------------------");
			System.out.println(plant.getCommon());
			System.out.println(plant.getBotanical());
			System.out.println(plant.getZone());
			System.out.println(plant.getLigth());
			System.out.println(plant.getPrice());
			System.out.println(plant.getAvailability());
			System.out.println();
		}
		
		//Marshall class to xml
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(catalog, System.out);		
 
	  } catch (JAXBException e) {
		e.printStackTrace();
	  }
 
	}
}