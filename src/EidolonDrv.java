import java.io.FileNotFoundException;


import java.io.IOException;
import java.util.*;
public class EidolonDrv {

	public static void main(String[]args) throws IOException{
		
		EidolonCollection eidolons = new EidolonCollection("stats.txt");
		//System.out.println(eidolons);
		//EidolonCollection  testArray= new EidolonCollection("stats.txt");
		//System.out.println(testArray);
		eidolons.arrayByType();
	}

	
}
