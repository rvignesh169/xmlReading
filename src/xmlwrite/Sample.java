package xmlwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Sample {
public static void main(String[] args) throws JAXBException, FileNotFoundException {
	JAXBContext jc = JAXBContext.newInstance(Details.class);
	File f = new File("D:\\TCD\\Sel\\xmlReading\\writFile1.xml");
	Marshaller ms = jc.createMarshaller();
	Details d = new Details();
	ArrayList<Data> i =  new ArrayList<>();
	Data d1 = new Data();
	d1.setId(12533);
	d1.setName("Sathish");
	d1.setMailid("b@bol.in");
	d1.setPhone(985115448);
	i.add(d1);
	Data d2 = new Data();
	d2.setId(12534);
	d2.setName("vignesh");
	d2.setMailid("c@bol.in");
	d2.setPhone(999999955);
	i.add(d2);
	Data d3 = new Data();
	d3.setId(12535);
	d3.setName("aravin");
	d3.setMailid("dc@bol.in");
	d3.setPhone(998888955);
	i.add(d3);
	d.setData(i);
	ms.marshal(d, f);
}
}
