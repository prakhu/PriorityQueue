package com.prakhar.sampleProjects.priorityQueue.InstructionMessage;


import org.junit.Test;

import junit.framework.TestCase;


/**
 * Unit test.
 */
public class InstructionMessageTest 
    extends TestCase
{
   
	public void testEnqueQueue() throws Exception{
		InstructionMessage m1 = new InstructionMessage("A",22,11,22,22,1);
		InstructionMessage m2 = new InstructionMessage("C",2,12,22,22,1);
		InstructionMessage m3 = new InstructionMessage("B",2,11,22,22,1);
		InstructionMessage m4 = new InstructionMessage("D",23,11,22,22,1);
		InstructionMessage m5 = new InstructionMessage("Z",1,11,22,22,1);
		
		queue q1 = new queue();
		q1.enqueue(m1);
		q1.enqueue(m2);
		q1.enqueue(m3);
		q1.enqueue(m4);
		q1.enqueue(m5);
		
		System.out.println("Peek the higher priority object"+ q1.dequeue());
		System.out.println("Peek the higher priority object"+ q1.dequeue());
		System.out.println("Peek the higher priority object"+ q1.dequeue());
		System.out.println("Peek the higher priority object"+ q1.dequeue());
		System.out.println("Peek the higher priority object"+ q1.dequeue());
	}
	
	@Test(expected = Exception.class)
	  public void testqueue() throws Exception {
		InstructionMessage m2 = new InstructionMessage("test",1,11,22,22,1);
		queue q1 = new queue();
		q1.enqueue(m2);
		assertEquals("Test1",1,q1.count());
		q1.peek();
		assertEquals("Test2",1,q1.count());
		q1.enqueue(m2);
		assertEquals("test",q1.dequeue());
	  }
	
	// This class is expected to fail.
	@Test(expected = Exception.class)
	  public void testExceptionIsThrown() {
		InstructionMessage m2 = new InstructionMessage("",122,11,22,22,1);
		queue q1 = new queue();
		try {
			q1.enqueue(m2);
		} catch (Exception e) {
			assertEquals("Invalid Message",e.getMessage());
		}
	  }
	
}