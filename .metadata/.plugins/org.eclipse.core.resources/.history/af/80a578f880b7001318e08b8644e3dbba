
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException; 

public class Input {

	
	public ArrayList<Blocks> blocks;
	
	//Scanner and File Objects
		static Scanner s; 
		static File f;

		public static void main (String [] args){


			f = new File("input.txt");
	
			try {
				s = new Scanner(f).useDelimiter("\n");
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}
		
	
			
			while(s.hasNext()){
	 
				System.out.print(s.next());

			}

		}
	
	

}
