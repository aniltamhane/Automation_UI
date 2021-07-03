package utils;

public class StringUtils {
	
	//Take argument in the format $34,500 and return int e.g. 34500
	
	public int getIntegerFromString(String s1){
		
		String s2 = s1.replaceAll("[$,]", "");
		return Integer.parseInt(s2);
	}
	
	//This method compares the strings
	public boolean compareStrings(String s1, String s2){
		
		return s1.equals(s2);
		
	}

}
