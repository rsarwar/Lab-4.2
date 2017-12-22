import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList; 
import java.util.List;

public class CSVUtilities {

	ArrayList<String> CSVData = new ArrayList<String>();
	int numColumns;
	int rows;
	
	public CSVUtilities(File csv)
	{
		FileReader reader = null;
		BufferedReader filein = null;
		try 
		{
			reader = new FileReader(csv);
			filein = new BufferedReader(reader);
			try
			{
				String line = filein.readLine(); 
			
				while (line != null)
				{ 
					String[] data = line.split(",");
					numColumns = data.length;
					for(int i = 0; i < numColumns; i++)
					{
						CSVData.add(data[i]);
	
					}
					rows++;
					line = filein.readLine();
				}
			}
			 catch (IOException e) 
			{
				e.printStackTrace();
			}
		}

		catch (FileNotFoundException fnfe) 
		{
			System.out.println("ERROR: File not found!");
		
		}

	}

	public List<String> getColumnHeaders()
	{
		ArrayList<String> headers = new ArrayList<String>();
		for(int i = 0; i < numColumns; i++)
		{
			headers.add(CSVData.get(i));
		}
		return headers;
	}
	
	public List<String> getDataString(int column)
	{
		ArrayList<String> data = new ArrayList<String>();
		int x = column + numColumns;
		int y = numColumns*rows;
		while(x < y)
		{
			String datastr = CSVData.get(x);
			data.add(datastr);
			x = x+numColumns;;
		}
		return data;
	}
	
	public List<Integer> getDataInt(int column)
	{
		ArrayList<Integer> dataInt = new ArrayList<Integer>();
		int x = column + numColumns;
		int y = numColumns*rows;
		while(x < y)
		{
			int data = Integer.parseInt(CSVData.get(x));
			dataInt.add(data);
			x = x+numColumns;
		}
		return dataInt;
	}
	
	public List<Double> getDataDouble(int column)
	{
		ArrayList<Double> dataDouble = new ArrayList<Double>();
		int x = column + numColumns;
		int y = numColumns*rows;
		while(x < y)
		{
			double data = Double.parseDouble(CSVData.get(x));
			dataDouble.add(data);
			x = x+numColumns;
		}
		return dataDouble;
	}
}
