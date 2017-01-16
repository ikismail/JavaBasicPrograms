package Day1;

public class palindromeString {

	public static void main(String[] args) {
		String originalValue = "malayalam";
		String value = originalValue.toLowerCase();
		int sPos = 0;
		int ePos = value.length();
		boolean isPal = true;
		
		while (sPos < ePos) {
			char sLetter = value.charAt(sPos);
			char eLetter = value.charAt(ePos-1);
			if(sLetter != eLetter){
				isPal=false;
				break;
			}
			sPos++;
			ePos--;
		}
		if(isPal == true){
			System.out.println("Palindrome");
		}else{
			System.out.println("Not a Palindrome");
		}

	}
}
