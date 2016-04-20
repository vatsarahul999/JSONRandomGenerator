package cm.JSONMaker.randomizer;

import java.util.ArrayList;

public class JSONUniqueProductNameMaker {
	
	public ArrayList<Long> generateUniqueProductName(long numberofRecordsRequired, int lengthOfrecord) {
		ArrayList<Long> lst = new ArrayList<Long>();
		long startPoint = 1l;
		for (int i = 0; i < lengthOfrecord; i++) {
			startPoint = startPoint * 10;
		}
		for (long i = startPoint; i < numberofRecordsRequired; i++) {
			lst.add(i);

		}

		return lst;

	}

}
