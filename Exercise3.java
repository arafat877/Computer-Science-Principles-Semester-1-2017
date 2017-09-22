
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 21;
		int num2 = 34;
		int num3 = 0;
		
		
		num3 = num / num2; //division
		num3 = num - num2; //subtraction
		num3 = num * num2; //multiplication
		num3 = num % num2; //Remainder
		
	    int overflow = 2147483647;  // maximum int
	    System.out.println(overflow + 1);    // -2147483648 (overflow!)
	    System.out.println(overflow + 2);    // -2147483647
	    System.out.println(overflow * overflow); //1
	    
	    int underflow = -2147483648;  // minimum int
	    System.out.println(underflow - 1);   // 2147483647 (overflow!)
	    System.out.println(underflow - 2);   // 2147483646
	    System.out.println(underflow * underflow);  // 0
	    
	    double hi = 8.2;
	    int hi2 = 0;
	    hi2 = (int) hi; //Type-Casting
	    
	    num3 += num3; //compound addition assignment
	    num3 -= num3; //compound subtraction assignment
	    num3 *= num3; //compound subtraction assignment
	    num3 /= num3; //compound division assignment
	    num3 %= num3; //compound remainder assignment
	    
	    ++num3; //increment
	    --num3; //decrement
	    
	    //Relation and Logical Operators
	    if (!(num > num2)||(num == num)||(num >= num)^((num < num2)&&(num <= num2))){
	    	
	    }
	    

	}

}
