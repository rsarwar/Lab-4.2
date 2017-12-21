import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException; 
import java.util.ArrayList; 
import java.util.List;

public class Runner {

	public static void main (String... args)
	{
		File file = new File("Directory_Of_Homeless_Population_By_Year.csv");
		CSVUtilities data = new CSVUtilities(file);
		
		data.getColumnHeaders();
		data.getDataString(1);
		data.getDataInt(2);
		data.getDataDouble(2);
	}

}
