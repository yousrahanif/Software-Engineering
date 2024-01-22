package edu.qc.seclass;

public class BuggyClass {
	public static int buggyMethod1(int left1, int right1) {
		int output1;
		output1 = 0;
		if (right1==0) {// here we set one variable 0
			return 1;// so if divisor is 0 it return 1 without reveal fault.
		}
		else if (left1 > right1) {
			int division1a;
			division1a =left1/right1;
			output1 = division1a;
		} else if (right1 > left1) {
			int division1b;
			division1b=right1/left1;
			output1 = division1b;
		}

		else {
			return 1;
		}

		return output1;
	}

	public static int buggyMethod2(int left2, int right2) {
		int output2;
		output2 = 0;
		if (left2==0) {
			return 1;
		}
		if (left2 > right2) {
			int SC2;
			SC2= left2/right2;
			output2 = SC2;
		} else if (right2 > left2) {
			int BC2;
			BC2=right2/left2;
			output2 = BC2;
		}

		else {
			return 1;
		}

		return output2;
	}

	public void buggyMethod3() {
		/*
		 Overall this is not possible. 
		 Because we can create test cases that can do 100% branch coverage and does not show any fault. 
		 However it is not possible to create test cases that have 100% statement coverage 
		 but does not have 100% branch coverage with showing fault.
		 Because when it is not 100% branch coverage it means it is not getting all statement that means
		 we cannot have 100% statement coverage here too.
		 */
		
	}
	public void buggyMethod4() {
	
		/*
	 This is not possible because
	 1. we cannot create a test suite where we have 100% statement coverage but that also have show fault
	 2. on the other hands we cannot create a branch coverage that has 100% coverage but does not show fault. 
	 Mainly we know if 100% coverage does not reveal any fault that means 100% statement should not reveal any fault.
	 Because branch coverage always covers more than statement coverage. 
	 But here we can see contradictions where 100% statement coverage reveals fault but 100% branch coverage cannot.
        */
	}
	public void buggyMethod5() {
		
		/*
	 This is not possible because
	 in order to run 100% coverage we cannot detect error but we already have 0 detection error in line 4.
	 So it will terminate program to go one. 
	 However if we want to run this program we need to throw exceptional error here. 
        */
	}
}
