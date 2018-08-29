package xmlwrite;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Details {
private ArrayList<Data> data;

public ArrayList<Data> getData() {
	return data;
}

public void setData(ArrayList<Data> data) {
	this.data = data;
}


}
