package edu.qc.seclass;

import static org.junit.Assert.*;

import org.junit.Test;

public class BuggyClassTestSC2 {

	@Test
	public void buggyMethod2() {

		assertEquals(2, BuggyClass.buggyMethod1(28, 14));
		assertEquals(1, BuggyClass.buggyMethod1(19, 19));
		assertEquals(2, BuggyClass.buggyMethod1(17, 34));

	}
}
