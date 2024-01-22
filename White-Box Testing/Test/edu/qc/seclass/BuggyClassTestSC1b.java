package edu.qc.seclass;

import static org.junit.Assert.*;

import org.junit.Test;

public class BuggyClassTestSC1b {

	@Test
	public void buggyMethod1() {
		assertEquals(1, BuggyClass.buggyMethod1(0, 2));
		assertEquals(1, BuggyClass.buggyMethod1(2, 1));

	}
}
