
public class Assignment1 {

	//Problem 1
	public int ret(){
		return 17;
	}

	//Problem 2
	static public boolean logic(boolean a, boolean b, boolean c){
		boolean land = a && b &&c;
		System.out.println(land);
		return land;
	}

	//Problem 3
	static public String triangle (int number){
		String star = "*";
		for(int i = 0; i <= number; i ++){
			for(int k= 0; k < i; k++){
				System.out.print(star);
			}
			System.out.println("");
		}
		return star;
	}

	//Problem 4
	static public int coins(int n){
		int fivecent = 5;
		int twocent = 2;
		int value = 0;
		if(n % fivecent == 0){
			value = n / fivecent;
			System.out.println(value + " five cent[s]");
		}
		if(n % twocent == 0){
			value = n / twocent;
			System.out.println(value + " two cent[s]");
		}
		if((n % twocent > 0) && (n % fivecent > 0)){
			int fiveremainder = n % fivecent;
			int tworemainder = n % twocent;
			int fivevalue = n / fivecent;
			int twovalue = fiveremainder / twocent;
			System.out.println(fivevalue + " five cent[s] and " + twovalue + " two cent[s]");
			if (fiveremainder % twocent > 0){
				System.out.println("Not possible!");
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logic(false, true, true);
		coins(11);
		triangle(5);
		
	}

}
