package src;

public class SimpleLogicalSentence extends LogicSentence {

	public String propConstant;

	public String explanation;
	
	String operator;
	
	LogicSentence left, right;

	public String toString(){
		return propConstant;
	}

}
