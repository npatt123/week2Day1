package week2.Day1;

public class ReverseEvenWords {
	public static void main(String[] args) {
	
	String test = "I am a software tester"; 
	String[] text = test.split(" ");
	
	
	
	for (int i = 0; i < text.length; i++) {
		
		int remainder = i%2;
		
		if (remainder == 0) {
			
			String output = text[i];
			char[] charArrays = output.toCharArray();
			//char[] charArrays = text[i].toCharArray();
			for(int j = charArrays.length-1; j >=0 ; j--) {
				System.out.print(charArrays[j]);			
				
			}
			System.out.print(" ");
		}
			
			
			else {
				System.out.print(text[i] + " ");
		
			}
	
			
		}
		


}
}

