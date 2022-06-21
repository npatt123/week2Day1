package week2.Day1;

public class FindTypes {
	
	public static void main(String[] args) {
		
		String test = "$$ 3Welcome to 2nd Class of Automation $$ ";
		int  letter = 0;
		int space = 0;
		int numb = 0;
		int specialChar = 0;
		
		
		char[] charArray = test.toCharArray();
		int lengthArray = charArray.length;
		
		for(int i = 0; i <lengthArray -1; i++) {
	
			
			if(Character.isLetter(charArray[i]) == true) {

				letter++;
			
			}
			else if(Character.isDigit(charArray[i]) == true) {
				numb++;
				
				
			}
			else if(Character.isSpaceChar(charArray[i]) == true) {
				space++;
			
		}
			else {

				specialChar++;
			}
			
				
			}
		
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + numb);
		System.out.println("specialCharcter: " + specialChar);

		


	}
	
	}


