package xmlread;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Sample {
public static void main(String[] args) throws JAXBException {
	covetToJava();
}
	
	public static void covetToJava() throws JAXBException{
		JAXBContext con = JAXBContext.newInstance(Details.class);
		Unmarshaller un = con.createUnmarshaller();
		File f = new File("D:\\TCD\\Sel\\xmlReading\\NewFile.xml");
		Details d = (Details)un.unmarshal(f);
		ArrayList<Data> s = new ArrayList<Data>();
		s.addAll(d.getData());

		for (Data d1 : s){
			System.out.println(d1.getId());
			System.out.println(d1.getName());
			System.out.println(d1.getMailid());
		}
		
		
		
	}
}
