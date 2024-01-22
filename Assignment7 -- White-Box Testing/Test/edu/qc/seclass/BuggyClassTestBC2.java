package edu.qc.seclass;

import static org.junit.Assert.*;

import org.junit.Test;

public class BuggyClassTestBC2 {

	@Test
	public void buggyMethod2() {
		assertEquals(7, BuggyClass.buggyMethod2(21, 3));
		assertEquals(1, BuggyClass.buggyMethod2(29, 29));
		assertEquals(3, BuggyClass.buggyMethod2(7, 21));
		assertEquals(1, BuggyClass.buggyMethod2(9, 0));
		assertEquals(1, BuggyClass.buggyMethod2(0, 9));

	}

}
