package edu.qc.seclass;

import static org.junit.Assert.*;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class BuggyClassTestSC1a {

    

    @Test
	public void buggyMethod1() {
		assertEquals(4, BuggyClass.buggyMethod1(8, 2));
		assertEquals(4, BuggyClass.buggyMethod1(2, 8));
		assertEquals(1, BuggyClass.buggyMethod1(17, 17));

	}
}



