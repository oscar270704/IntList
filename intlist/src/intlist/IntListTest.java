package intlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntListTest {


	@Test
	void TestConstructor() {
	IntList lijst  = new IntList();
	assertArrayEquals(new int [] {},lijst.IntArray());
	assertEquals(0, lijst.ListLength());

	}
	
	
	@Test
	void TestAdd() {
	IntList lijst  = new IntList();
	assertEquals(0, lijst.ListLength());
	lijst.Add(5);
	assertEquals(1, lijst.ListLength());
	assertEquals(5, lijst.IntArray()[0]);
	lijst.Add(5);
	assertArrayEquals(new int [] {5,10},lijst.IntArray());
	assertEquals(2, lijst.ListLength());
	assertEquals(5, lijst.IntArray()[0]);
	assertEquals(10, lijst.IntArray()[1]);

	}
	
	
	@Test
	void TestDel() {
	IntList lijst  = new IntList();
	lijst.Add(5);
	lijst.Add(10);
	lijst.Del();
	assertArrayEquals(new int [] {5},lijst.IntArray());
	assertEquals(1, lijst.ListLength());
	assertEquals(5, lijst.IntArray()[0]);

		
	}
	/*
	 * tests op representation exposure : als er wijzigbaar object voorkomt in interactie (inputs 
	 * gegeven door klant of output verkregen door klant ) met de klant.
	 *  wijzigen van dit wijzigbaar object verandert niets aan de abstractie =. enkel bij IntArray 
	 *  is er een wijzigbaar object in de interactie dus enkel deze checken 
	 */
	
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
