package MockAssesment4;

import java.util.Arrays;
import java.util.Scanner;
public class UserMainCode {
	public static void printSecondLongestWords(String line) {
		 
		//Insert code here to check to print all the
		//2nd longest words
		String[] lineArr = line.split(" ");
		List<String> lineList = new ArrayList<String>(Arrays.asList(lineArr));
		int largestWordLength = getLargestStringLength(lineList);
		
		Iterator<String> it = lineList.iterator();