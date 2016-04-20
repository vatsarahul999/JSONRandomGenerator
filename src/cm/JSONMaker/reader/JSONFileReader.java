package cm.JSONMaker.reader;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import cm.JSONMaker.model.cartadditions.JSONRecord;


public class JSONFileReader {
	
	String pathToFile;
	JSONRecord sampleData;
	
	public JSONFileReader(String pathToFile){
		this.pathToFile = pathToFile;
		sampleData = new JSONRecord();
		readFile();
	}

	private void readFile() {
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			sampleData  = mapper.readValue(new File(pathToFile),JSONRecord.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}

	public JSONRecord getSampleData() {
		return sampleData;
	}



}
