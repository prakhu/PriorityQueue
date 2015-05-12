package com.prakhar.sampleProjects.priorityQueue.InstructionMessage;

/*
 * @author Prakhar Srivastava 
 * @version 1.0.0
 *
 */
public class InstructionMessage implements Comparable<InstructionMessage>
{
   private String message;
   private Integer InstructionType;
   private Integer ProductCode;
   private Integer Quantity;
   private Integer UOM;
   private Integer TimeStamp;
   private InstructionMessage next;
   
   public InstructionMessage getNext() {
	return next;
}

public void setNext(InstructionMessage next) {
	this.next = next;
}

public InstructionMessage(String message,Integer InstructionType,Integer ProductCode,Integer Quantity,Integer UOM,Integer TimeStamp){
	  
	   this.message= message;
	   this.InstructionType = InstructionType;
	   this.ProductCode = ProductCode;
	   this.Quantity= Quantity;
	   this.TimeStamp = TimeStamp;
	   this.UOM = UOM;
   }

public Integer getInstructionType() {
	return InstructionType;
}

public void setInstructionType(Integer instructionType) {
	InstructionType = instructionType;
}

public Integer getProductCode() {
	return ProductCode;
}

public void setProductCode(Integer productCode) {
	ProductCode = productCode;
}

public Integer getQuantity() {
	return Quantity;
}

public void setQuantity(Integer quantity) {
	Quantity = quantity;
}

public Integer getUOM() {
	return UOM;
}

public void setUOM(Integer uOM) {
	UOM = uOM;
}

public Integer getTimeStamp() {
	return TimeStamp;
}

public void setTimeStamp(Integer timeStamp) {
	TimeStamp = timeStamp;
}

public int compareTo(InstructionMessage message) {

	if (this.getInstructionType().equals(message.getInstructionType()))
		return 0;
	else if (this.getInstructionType() < message.getInstructionType())
		return -1;
	else
		return 1;
	
	
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}
   
   
   
}
