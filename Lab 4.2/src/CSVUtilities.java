import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException; 
import java.util.ArrayList; 
import java.util.List;

public class CSVUtilities {

	ArrayList<String> CSVData;
	int numColumns;
	
	public CSVUtilities(File csv)
	{
		FileReader reader = null;
		BufferedReader filein = null;
		try {
			reader = new FileReader(csv);

		filein = new BufferedReader(reader);
		}

		catch (FileNotFoundException fnfe) {
		System.out.println("ERROR: File not found!");


		}

	}

	public List<String> getColumnHeaders()
	{
		
	}
	
	public List<String> getDataString(int column)
	{
		
	}
	
	public List<Integer> getDataInt(int column)
	{
		
	}
	
	public List<Double> getDataDouble(int column)
	{
		
	}
}
