package com.mitrais.algo.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.mitrais.algo.main.InsertingNode;
import com.mitrais.algo.main.InsertingNode.Node;
import com.mitrais.algo.main.RerversingSomeArrayElements;

class ExampleTest {
	
	public static int[] array ;
	
	@BeforeAll
	public static void setUp() {
		array = new int[] {5,9,0,4,0,7,0,1,0};
	}

	@Disabled
	@Test
	void test() {
		RerversingSomeArrayElements.reverseArray(array);
		assertArrayEquals(new int[] {1,7,0,4,0,9,0,5,0}, array);
	}
	
	@Test
	void testInsertNode() {
		Node head = new Node(5).next = new Node(7).next = new Node(9).next = new Node(12);
		Node result = new Node(5).next = new Node(7).next = new Node(8).next = new Node(9).next = new Node(12);
		InsertingNode.insertNode(head, new Node(8));
		assertEquals(result, head);
	}

}
