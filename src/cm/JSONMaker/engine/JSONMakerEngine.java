package cm.JSONMaker.engine;

import java.util.ArrayList;
import java.util.Scanner;

import cm.JSONMaker.models.JSONRecord;
import cm.JSONMaker.randomizer.JSONRandomDataCreator;
import cm.JSONMaker.reader.JSONFileReader;
import cm.JSONMaker.writer.JSONWriter;

public class JSONMakerEngine {
	 String pathToSampleDataFile;
	 int numofRandomRecords;
	 int lengthOfRandomField;
	 JSONRecord sampleRecord;
	 JSONRandomDataCreator rdmDataCreator;
	 String pathToOutput;
	public void setPathToOutput(String pathToOutput) {
		this.pathToOutput = pathToOutput;
	}
	public void setLengthOfRandomField(int lengthOfRandomField) {
		this.lengthOfRandomField = lengthOfRandomField;
	}
	public void setNumofRandomRecords(int numofRandomRecords) {
		this.numofRandomRecords = numofRandomRecords;
	}
	public void setPathToSampleDataFile(String pathToSampleDataFile) {
		this.pathToSampleDataFile = pathToSampleDataFile;
	}
	public static void main(String[] args) {
		System.out.println("Enter the path to sample data file");
		JSONMakerEngine eng = new JSONMakerEngine();
		
		Scanner sc = new Scanner(System.in);
		eng.setPathToSampleDataFile(sc.nextLine());
		System.out.println("Enter the number of radom records Required");
		eng.setNumofRandomRecords(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter the length of the field to be made random");
		eng.setLengthOfRandomField(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter location of outputFile");
		eng.setPathToOutput(sc.nextLine());
		sc.close();
		eng.readSampleData();
		eng.makeRandomData();
		System.out.println();
	}
	private void makeRandomData() {
		// TODO Auto-generated method stub
		rdmDataCreator = new JSONRandomDataCreator();
		ArrayList<Long> listOfRandomData=rdmDataCreator.generateRandomValuesForLong(3104877427967206400l, 19, numofRandomRecords);
		ArrayList<JSONRecord> randomRecords = new ArrayList<JSONRecord>();
//		JSONRecord[] randomRecordArray = new JSONRecord[100];
		System.out.println(listOfRandomData.size());
		JSONRecord tmp =sampleRecord;
//		long i =1;
		for(long h:listOfRandomData){
			tmp =(JSONRecord)sampleRecord.clone();
			tmp.setVisIdHigh(h);
			System.out.println(tmp);
			randomRecords.add(tmp);
			
		}
//		for(long h:listOfRandomData){
//			if(i%100==0)
//				randomRecordArray = new 
//		}
		System.out.println("No of records generated: "+randomRecords.size());
		System.out.println("Random Records Generated");
		JSONWriter filewriter = new JSONWriter(pathToOutput,randomRecords);
		System.out.println("Done");
		
	}
	private void readSampleData() {
		// TODO Auto-generated method stub
		JSONFileReader rdr = new JSONFileReader(pathToSampleDataFile);
		sampleRecord = rdr.getSampleData();
		System.out.println("Sample Record:read");
		//System.out.println(sampleRecord.toString());
	}
	

}
