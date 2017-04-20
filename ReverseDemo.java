class Reverse {

	private char newChars[];

	String newString;

	int num;

	int length;

	Reverse(String x) {
		
		newString = x;

		num = 0;

		length = x.length(); 

		newChars = new char[length];

	}


	// public String reverseR() {

	// 	if (num < length) {

	// 		newChars[num] = newString.charAt(length-1 - num); 
	// 		num++;
	// 		reverseR();
	// 	} 

	// 	String newnewString = new String(newChars);


	// 	//System.out.print(newnewString);

	// 	return newnewString;
	// }

	public String reverseR(String x, String j) {
		
		String k;

		if (j.length() == x.length()) {
				return j;
			}


		k = "";

		if (j.length() < x.length()) {
			
			String p = j + x.substring(x.length() - j.length() - 1, x.length() - j.length());

			
			k = reverseR(x, p);

			//System.out.println(j); 

			// return k;



		}

		// else if (j.length() <= x.length()) {
			
		// 	k = reverseR(x, j);
		// }

		return k;

		// String k = j + x.substring(0, 1);

		// return ;


	}

	public String reverseI(String x) {

		int stringLength = x.length();

		char[] newString  = new char[stringLength];



		// System.out.println(x);

		//char firstLetter = x.charAt(0);

		//char lastLetter = x.charAt(stringLength - 1);

		//System.out.println(lastLetter);

		for (int i = stringLength - 1, j = 0 ; i >= 0; i--, j++) {

			char currentLetter = x.charAt(i);

			// System.out.print(currentLetter);

			newString[j] = currentLetter;
			
		}

		//System.out.println();
		//System.out.println(newString);

		String newStringString = new String(newString); 

		return newStringString;
	}
}

class ReverseDemo {

	public static void main(String[] args) {
		

		Reverse ob = new Reverse(args[0]);

		//System.out.println(ob.reverseI(args[0]));

		System.out.println(ob.reverseR(args[0], ""));

	}
}