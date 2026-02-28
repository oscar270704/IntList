package intlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntListTest {

	@Test
	void TestLengte() {
	IntList lijst  = new IntList();
	assertEquals(0, lijst.ListLength());
	lijst.Add(5);
	assertEquals(1, lijst.ListLength());
	lijst.Del();
	assertEquals(0, lijst.ListLength());
	
	
	/*
	 * tests op representation exposure
	 */
	}
	
	@Test
	void TestIndexen() {
	IntList lijst = new IntList();
	lijst.Add(5);
	lijst.Add(6);
	lijst.Add(7);
	assertEquals(5,lijst.IntAtIndex(0));
	assertEquals(6,lijst.IntAtIndex(1));
	assertEquals(7,lijst.IntAtIndex(2));}
	
	@Test
	void TestRExposureOpOutputs(){
	IntList lijst = new IntList();
	lijst.Add(5);
	lijst.Add(6);
	lijst.Add(7);
	int [] array = lijst.IntArray();
	array[0] = 0;
	assertEquals(5,lijst.IntAtIndex(0));
	assertEquals(5,lijst.IntArray()[0]);
	// je kan nu geen test doen op inputs want je geeft
	// geen wijzigbaar object toe aan je constructor new IntList()
	
	}
	
	
	
}
