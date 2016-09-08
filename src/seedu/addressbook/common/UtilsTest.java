package seedu.addressbook.common;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.Test;

public class UtilsTest {

	@Test
	public void nullPresent_returnTrue() {
		boolean test = Utils.isAnyNull("alsjfblasfbnjusf", 4635465, new ArrayList<>(), null);
		assertTrue(test);
	}
	
	@Test
	public void nullNotPresent_returnFalse() {
		boolean test = Utils.isAnyNull("aojshbnfkljsf", 654354, new LinkedList<>());
		assertFalse(test);
	}

	@Test
	public void allUnique_returnTrue(){
		ArrayList<String> testList = new ArrayList<String>();
		testList.add("random");
		testList.add("unique");
		testList.add("fun");
		assertTrue(Utils.elementsAreUnique(testList));
	}
	
	@Test
	public void someCommon_returnFalse(){
		ArrayList<String> testList = new ArrayList<String>();
		testList.add("random");
		testList.add("unique");
		testList.add("fun");
		testList.add("fun");
		assertFalse(Utils.elementsAreUnique(testList));
	}
	
}
