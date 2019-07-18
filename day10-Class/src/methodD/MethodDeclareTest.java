package methodD;

public class MethodDeclareTest {
	public void convertStringToCharArray(String input) {
		char[] letters;
		
		letters = new char[input.length()];
		
		for (int idx = 0; idx < letters.length; idx++) {
			letters[idx] = input.charAt(idx);
		}
		
		for (char toChar : letters) {
			System.out.println(toChar);
		}
	}
	
	public char[] sortLetters(String input) {
		char[] letters;
		char temp;
		
		letters = new char[input.length()];
		
		for (int idx = 0; idx < letters.length; idx++) {
			letters[idx] = input.charAt(idx);
		}
		
		for (int idx = 0; idx < letters.length; idx++) {
			for (int ind = 0; ind < letters.length; ind++ ) {
				if (letters[idx] < letters[ind]) {
					temp = letters[idx];
					letters[idx] = letters[ind];
					letters[ind] = temp;
				}
			}
		}
		
		for (char toChar : letters) {
			System.out.println(toChar);
		}
		
		return letters;
	}
		
}