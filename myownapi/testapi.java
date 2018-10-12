package myownapi;
import myownapi.OSOperations;

public class testapi {
	
	public static void main(String[] args) {
		
		OSOperations os1 = new OSOperations();
		
		os1.getOS();
		os1.getAllContentsOfDirectory("/"); // enter your path name
	}

}
