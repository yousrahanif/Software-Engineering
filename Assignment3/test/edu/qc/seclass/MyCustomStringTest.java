package edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MyCustomStringTest {

	private MyCustomStringInterface mycustomstring;

	@Before
	public void setUp() {
		mycustomstring = new MyCustomString();
	}

	@After
	public void tearDown() {
		mycustomstring = null;
	}

	@Test
	public void testCountNumbers1() { // 3,3,0,161,5,1,6 seven digits
		mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
		assertEquals(7, mycustomstring.countNumbers());
	}

	@Test(expected = NullPointerException.class)
	public void testCountNumbers2() {
		mycustomstring.setString(null);
		assertEquals(0, mycustomstring.countNumbers());// nothing here so 0
	}

	@Test
	public void testCountNumbers3() {
		mycustomstring.setString("5h0u1d 1 g0 t0 a r1d3");// 5,0,1,1,0,0,1,3 ==8
		assertEquals(8, mycustomstring.countNumbers());
	}

	@Test
	public void testCountNumbers4() {
		mycustomstring.setString("br0 13t m3 3at b33f");// 0,13,3,3,33 ==5
		assertEquals(5, mycustomstring.countNumbers());
	}

	@Test
	public void testCountNumbers5() {
		mycustomstring.setString("y0ur ar3 g00d");// 0,3,00 ==3
		assertEquals(3, mycustomstring.countNumbers());
	}

	@Test
	public void testCountNumbers6() {
		mycustomstring.setString("k33p qui3t.");// 33,3 ==2
		assertEquals(2, mycustomstring.countNumbers());
	}

	@Test
	public void testGetEveryNthCharacterFromBeginningOrEnd1() {
		mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
		assertEquals("d33p md1  i51,it", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, false));//false means from left and we targeting every 3rd charcater from left. special character and space also considered as a character
	}

	@Test
	public void testGetEveryNthCharacterFromBeginningOrEnd2() {
		mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
		assertEquals("'bt t0 6snh r6rh", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));//true means from right. We are targeting every 3rd charcater from right and writing from right too
	}

	@Test
	public void testGetEveryNthCharacterFromBeginningOrEnd3() {
		mycustomstring.setString("Hello Mr.");
		assertEquals("HlM", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));//targeting 3rd charcater from right
	}

	@Test
	public void testGetEveryNthCharacterFromBeginningOrEnd4() {
		mycustomstring.setString("I love you");
		assertEquals("Ie", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(5, true));//targting 5th charcater from right
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetEveryNthCharacterFromBeginningOrEnd5() {
		mycustomstring.setString("I am very tired with my life. I want a break from it ASAP");
		assertEquals("IllegalArgumentException", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(-5, false));//cannot be negative number
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetEveryNthCharacterFromBeginningOrEnd6() {
		mycustomstring.setString("There can be only one winner, Let's go");
		assertEquals("IllegalArgumentException", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(-7, false));//cannot be negative number
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetEveryNthCharacterFromBeginningOrEnd7() {
		mycustomstring.setString("I want to be a professor. So I will be paid as I am increasing my knowledge");
		assertEquals("IllegalArgumentException", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(-9, false));//cannot be a negative number
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetEveryNthCharacterFromBeginningOrEnd8() {
		mycustomstring.setString("I want to live with my parents forever");
		assertEquals("IllegalArgumentException", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(0, false));//cannot be 0. has to be greater than 0
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetEveryNthCharacterFromBeginningOrEnd9() {
		mycustomstring.setString("Life is not easy for all");
		assertEquals("IllegalArgumentException", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(0, false));//must be greater than 0
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetEveryNthCharacterFromBeginningOrEnd10() {
		mycustomstring.setString("Sometimes you have to lose in order to win");
		assertEquals("IllegalArgumentException", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(-3, false));
	}

	@Test(expected = NullPointerException.class)
	public void testGetEveryNthCharacterFromBeginningOrEnd11() {
		mycustomstring.setString(null);
		assertEquals("NullPointerException", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));
	}

	@Test(expected = NullPointerException.class)
	public void testGetEveryNthCharacterFromBeginningOrEnd12() {
		mycustomstring.setString(null);
		assertEquals("NullPointerException", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(4, false));
	}

	@Test
	public void testGetEveryNthCharacterFromBeginningOrEnd13() {
		mycustomstring.setString("Thanks");
		assertEquals("k", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(5, false));
	}

	@Test
	public void testGetEveryNthCharacterFromBeginningOrEnd14() {
		mycustomstring.setString("GoodBoy");
		assertEquals("y", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(7, false));
	}

	@Test
	public void testConvertDigitsToNamesInSubstring1() {
		mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
		mycustomstring.convertDigitsToNamesInSubstring(17, 23);
		assertEquals("I'd b3tt3r put sZerome dOneSix1ts in this 5tr1n6, right?", mycustomstring.getString());//look for 17th and 23rd chracater and replace than digit with the name of digits
	}

	@Test
	public void testConvertDigitsToNamesInSubstring2() {
		mycustomstring.setString("99");
		mycustomstring.convertDigitsToNamesInSubstring(1, 2);
		assertEquals("NineNine", mycustomstring.getString());
	}

	@Test
	public void testConvertDigitsToNamesInSubstring3() {
		mycustomstring.setString("g00d girl");
		mycustomstring.convertDigitsToNamesInSubstring(2, 3);
		assertEquals("gZeroZerod girl", mycustomstring.getString());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConvertDigitsToNamesInSubstring4() {
		mycustomstring.setString("3v3ry Day is a n3w b3ginning");
		mycustomstring.convertDigitsToNamesInSubstring(25, 11);
		assertEquals("IllegalArgumentException", mycustomstring.getString());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConvertDigitsToNamesInSubstring5() {
		mycustomstring.setString("1 always want3d t0 b3 l1k3 my par3nt5");
		mycustomstring.convertDigitsToNamesInSubstring(13, 9);
		assertEquals("IllegalArgumentException", mycustomstring.getString());
	}

	@Test(expected = MyIndexOutOfBoundsException.class)
	public void testConvertDigitsToNamesInSubstring6() {
		mycustomstring.setString("B33f is my favorit3 f00d. I can 3at b33f 3v3ry day.");
		mycustomstring.convertDigitsToNamesInSubstring(-11, 9);
		assertEquals("MyIndexOutOfBoundsException", mycustomstring.getString());
	}

	@Test(expected = MyIndexOutOfBoundsException.class)
	public void testConvertDigitsToNamesInSubstring7() {

		mycustomstring.setString("G00d n1ght t0 3v3ry 0n3. Mak3 a habit to sl33p 3arli3r and wak3 up 3arly");
		mycustomstring.convertDigitsToNamesInSubstring(-25, 33);//cannot be negative
		assertEquals("MyIndexOutOfBoundsException", mycustomstring.getString());

	}

	@Test(expected = NullPointerException.class)
	public void testConvertDigitsToNamesInSubstring8() {
		mycustomstring.setString(null);
		mycustomstring.convertDigitsToNamesInSubstring(25, 33);
		assertEquals("NullPointerException", mycustomstring.getString());
	}

}
