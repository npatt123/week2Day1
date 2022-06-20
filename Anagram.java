package week2.Day1;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		
		String s1 = "Stops";
		String s2 = "Potss";
		
		int lenArray1 = s1.length();
		int lenArray2= s2.length();	
		String str1 = s1.toLowerCase();
		String str2 = s2.toLowerCase();
		char[] charArray1 = str1.toCharArray();		
		char[] charArray2 = str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		int count=0;
		
 
		
		if (lenArray1 == lenArray2) {
			
		for (int i = 0; i < lenArray1 -1 ; i++) {
			
			if(charArray1[i] == charArray2[i]) {
				
				System.out.println("Matching");
				count++;
			}
			else {
				System.out.println("Not Matching");
			}
		}
		}
		
		if (count>0) {
			
			System.out.println("The given word is Anagram");
				}
		else {
			System.out.println("The given word is not Anagram");
			
		}
			
		
		
		
	
		
	}



}
