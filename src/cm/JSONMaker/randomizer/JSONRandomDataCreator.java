package cm.JSONMaker.randomizer;

import java.util.ArrayList;

public class JSONRandomDataCreator {

	public ArrayList<String> generateRandomValuesForString(String argTobeMadeRandom, int sizeOfarg,
			int numberOfRandomRecords) {
		StringBuffer sb = new StringBuffer("");
		if (argTobeMadeRandom.length() < sizeOfarg) {
			for (int i = 0; i < sizeOfarg - argTobeMadeRandom.length(); i++)
				sb.append("0");
		}
		ArrayList<String> lst = new ArrayList<String>();

		StringBuffer rndbf = new StringBuffer(argTobeMadeRandom);
		rndbf.append(sb);
		for (int i = 0; i < numberOfRandomRecords; i++) {
			if (i % 3 == 0)
				rndbf.setCharAt(argTobeMadeRandom.length() / 2, 'x');
			else if (i % 2 == 0)
				rndbf.setCharAt(argTobeMadeRandom.length() / 12, 'q');
			else if (i % 5 == 0)
				rndbf.setCharAt(argTobeMadeRandom.length() - 1, 'a');
			else if (i % 7 == 0)
				rndbf.setCharAt(0, 't');
			else if (i % 11 == 0)
				rndbf.setCharAt(argTobeMadeRandom.length() / 3, 'l');
			else if (i % 17 == 0)
				rndbf.setCharAt(argTobeMadeRandom.length() / 12, 'i');
			else if (i % 23 == 0)
				rndbf.setCharAt(argTobeMadeRandom.length() / 21, 'r');
			else if (i % 27 == 0)
				rndbf.setCharAt(sizeOfarg - 1, 'h');
			else if (i % 31 == 0)
				rndbf.setCharAt(argTobeMadeRandom.length() / 3, 'e');
			else if (i % 41 == 0)
				rndbf.setCharAt(argTobeMadeRandom.length() / 10, 'y');
			else {

			}
			lst.add(rndbf.toString());
		}
		return lst;

	}

	public ArrayList<Long> generateRandomValuesForLong(long argTobeMadeRandom, int lengthOfarg,
			int numberOfRandomRecords) {
		String tmp = Long.toString(argTobeMadeRandom);
		ArrayList<Long> lst = new ArrayList<Long>();
		long newValue = -1l;
		if (tmp.length() < lengthOfarg) {
			StringBuffer sb = new StringBuffer(tmp);
			for (int i = 0; i < lengthOfarg - tmp.length(); i++)
				sb.append("0");

			newValue = new Long(sb.toString());
		} else {
			newValue = argTobeMadeRandom;
		}
		System.out.println(numberOfRandomRecords);
		for (long i = 0; i < numberOfRandomRecords; i++) {
			newValue = newValue % lengthOfarg;
			lst.add(newValue);
			newValue += i % 997;
			newValue += i % 2;
			newValue += i % 9;
			newValue += i % 41;
		}
		return lst;

	}
}
