package com.prakhar.sampleProjects.priorityQueue.InstructionMessage;

import java.util.PriorityQueue;
import java.util.Queue;

/*
 * @author Prakhar Srivastava 
 * @version 1.0.0
 *
 */
public class queue {
	Queue<InstructionMessage> message = new PriorityQueue<InstructionMessage>();

	//Adds a message to the queue
	public void enqueue(InstructionMessage m) throws Exception {
		if (m.getProductCode()>0 && m.getQuantity() >0 && m.getTimeStamp()>0 && m.getUOM()>0 && (m.getInstructionType()>0 && m.getInstructionType()<100))
		message.add(m);
		else throw new Exception ("Invalid Message");
	}

	//Returns the highest­priority message from the queue,
	//without returning it
	public InstructionMessage peek() {
		return message.peek();

	}

	//Returns the number of messages currently on the queue
	public int count() {
		return message.size();
	}

	//Returns true if the queue is empty, false otherwise
	public boolean isEmpty() {
		return message.isEmpty();

	}

	//Removes the highest­priority message from the queue and returns it
	public String dequeue() {
		
		return message.poll().getMessage();
	}

}
