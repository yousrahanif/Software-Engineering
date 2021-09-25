package edu.qc.seclass;

public class MyCustomString implements MyCustomStringInterface {
	private String string;

	@Override
	public String getString() {
		// TODO Auto-generated method stub
		if (this.string.isEmpty())

			return null;

		else
			return this.string;
	}

	@Override
	public void setString(String string) {
		// TODO Auto-generated method stub

		this.string = string;
	}

	@Override
	public int countNumbers() {
		// TODO Auto-generated method stub
		if (this.string == null) {
			throw new NullPointerException();
		} else if (string.isEmpty()) {
			return 0;
		}

		int countNum = 0;

		char end = string.charAt(string.length() - 1);
		for (int i = 0; i < string.length(); i++) {
			if (Character.isDigit(string.charAt(i))) {
				for (int j = i; j < string.length(); j++) {
					if (string.charAt(j) == end) {
						countNum++;
						i = j;
						break;

					} else if (string.charAt(j) == ' ') {
						countNum++;
						i = j;
						break;
					} else if (!Character.isDigit(string.charAt(j))) {
						countNum++;
						i = j;
						break;

					}

				}
			}
		}
		return countNum;
	}

	@Override
	public String getEveryNthCharacterFromBeginningOrEnd(int n, boolean startFromEnd) {
		// TODO Auto-generated method stub
		String string2;
		string2 = string;
		StringBuilder Str = new StringBuilder();

		if (startFromEnd) {
			string2 = new StringBuilder(string).reverse().toString();

		} else if (this.string.equals(null) && n > 0)

		{
			throw new NullPointerException();
		}

		else if (n <= 0) {
			throw new IllegalArgumentException();
		}
		for (int i = 0; i < string2.length(); i++) {
			if (((i + 1) % n) == 0) {
				Str.append(string2.charAt(i));

			}
		}
		if (startFromEnd) {
			Str = Str.reverse();
		}

		return Str.toString();
	}

	@Override
	public void convertDigitsToNamesInSubstring(int startPosition, int endPosition) {
		// TODO Auto-generated method stub

		String stringName = "";
		String temp = "";
		char charcater[] = this.string.toCharArray();

		if (startPosition > endPosition) {
			throw new IllegalArgumentException();
		}

		else if (startPosition > this.string.length()) {
			throw new MyIndexOutOfBoundsException();
		}

		else if (startPosition < 1) {
			throw new MyIndexOutOfBoundsException();
		}

		else if (endPosition > this.string.length()) {
			throw new MyIndexOutOfBoundsException();
		} else if (endPosition < 1) {
			throw new MyIndexOutOfBoundsException();
		}

		else if (this.string == null && startPosition > 0) {
			throw new NullPointerException();
		} else if (this.string == null && endPosition > 0) {
			throw new NullPointerException();

		}

		for (int i = 0; i < startPosition - 1; i++) {
			temp = temp + charcater[i];
		}

		for (int i = startPosition - 1; i < endPosition; i++) {
			if (Character.isDigit(this.string.charAt(i))) {

				int newString = Character.getNumericValue((this.string.charAt(i)));

				switch (newString) {

				case 0:
					stringName = "Zero";
					break;

				case 1:
					stringName = "One";
					break;

				case 2:
					stringName = "Two";
					break;

				case 3:
					stringName = "Three";
					break;

				case 4:
					stringName = "Four";
					break;

				case 5:
					stringName = "Five";
					break;

				case 6:
					stringName = "Six";
					break;

				case 7:
					stringName = "Seven";
					break;

				case 8:
					stringName = "Eight";
					break;

				case 9:
					stringName = "Nine";
					break;
				}
				temp = temp + stringName;
			} else
				temp = temp + charcater[i];

		}

		for (int i = endPosition; i < this.string.length(); i++) {
			temp = temp + charcater[i];
		}

		this.setString(temp);

	}

}
