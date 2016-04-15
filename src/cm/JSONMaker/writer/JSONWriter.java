package cm.JSONMaker.writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import cm.JSONMaker.models.JSONRecord;

public class JSONWriter {
	String pathToFile;
	ArrayList<JSONRecord> objectsCreated;
	ObjectMapper mapper;

	public JSONWriter(String pathToFile, ArrayList<JSONRecord> objectsCreated) {
		super();
		this.pathToFile = pathToFile;
		this.objectsCreated = objectsCreated;
		//writeToManyFiles();
		mapper = new ObjectMapper();
		writeToFile();
	}

	private void writeToManyFiles() {
		// TODO Auto-generated method stub
		long cnt = 0;
		for (JSONRecord t : objectsCreated) {
			try {
				mapper.writeValue(new File(pathToFile + "/part" + cnt), t);
			} catch (JsonGenerationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cnt++;
		}
	}

	private void writeToFile() {

		StringBuffer sb = new StringBuffer();
		int cnt = 0;
		File f = new File(pathToFile + "/1JSONfile/output.JSON");
		File f1 = f.getParentFile();
		if(f1.exists())
			f1.mkdirs();
		
		if (!f.exists()) {
			try {
				
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		BufferedWriter br =null;
		try {
			br = new BufferedWriter(new FileWriter(f));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		for (JSONRecord t : objectsCreated) {
			try {
				sb.append(mapper.writeValueAsString(t));
				sb.append("\n");
				if (cnt == 10) {
					br.write(sb.toString());
					sb = new StringBuffer();
					System.out.println("Wrtitng to File......");
					cnt = 0;
				}
				cnt++;
				
			} catch (JsonGenerationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		}
		if(cnt!=0)
		{
			try {
				br.write(sb.toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//sb = new StringBuffer();
			System.out.println("Wrtitng to File......");
		}
		

	}

}