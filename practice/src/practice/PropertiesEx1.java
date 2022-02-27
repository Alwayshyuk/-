package practice;
import java.util.*;
public class PropertiesEx1 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		
		//prop에 키와 값(key, value)을 저장한다.
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "kr");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		//prop에 저장된 요소들을 Enumeration을 이용해서 출력한다.
		Enumeration e = prop.propertyNames();
		
		while(e.hasMoreElements()) {
			String element = (String)e.nextElement();
			System.out.println(element + "="+prop.getProperty(element));
			//capacity=10   size=10   timeout=30   language=kr
		}
		prop.setProperty("size", "20");		
		System.out.println(prop.getProperty("size"));				//20
		System.out.println(prop.getProperty("capacity", "20"));		//10
		System.out.println(prop.getProperty("loadfactor", "0.75"));	//0.75
		System.out.println(prop);									//{size=20, language=kr, timeout=30, capacity=10}
		prop.list(System.out);
		//-- listing properties --
		//size=20
		//language=kr
		//timeout=30
		//capacity=10
	}
}
