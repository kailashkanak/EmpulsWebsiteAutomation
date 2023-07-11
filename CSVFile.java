package navigatingDemo;

import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

import com.opencsv.CSVWriter;

public class CSVFile {
	
	@Test
	public void createCsvFile()
	{
		try {
	        // create FileWriter object with file as parameter
	        FileWriter outputfile = new FileWriter("/Users/kailash.k/Documents/firstReport.csv");
	  
	        // create CSVWriter object filewriter object as parameter
	        CSVWriter writer = new CSVWriter(outputfile);
	  
	        // adding header to csv
	        String[] header = { "Name", "Class", "Marks" };
	        writer.writeNext(header);
	  
	        // add data to csv
	        String[] data1 = { "Aman", "10", "620" };
	        writer.writeNext(data1);
	        String[] data2 = { "Suraj", "10", "630" };
	        writer.writeNext(data2);
	  
	        // closing writer connection
	        writer.close();
	    }
	    catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	}
	
	
}


