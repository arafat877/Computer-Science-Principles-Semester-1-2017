
public class Logicalsentence {

	boolean simple;
	String pcon;
	String operator;
	Logicalsentence lefthand;
	Logicalsentence righthand;
	static boolean Valid (boolean [] tc){
		for (boolean e:tc){
			if (!e){
				return false;
			}
		}
		return true;
	}
	static boolean unSatisfiable (boolean [] tc){
		for (boolean e:tc){
			if (e){
				return false;
			}
		}
		return true;
	}
	static boolean contingent (boolean [] tc){
		return !Valid(tc)&&!unSatisfiable(tc);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logicalsentence raining = new Logicalsentence();
		raining.simple = true;
		raining.pcon = "p";
		raining.operator = "i";
		raining.simple = false;
		Logicalsentence liquidfalling = new Logicalsentence();
		boolean[] mytc = {true, false};
		boolean isV = Valid(mytc);
		System.out.println(isV);
		boolean uns = unSatisfiable(mytc);
		System.out.println(uns);
		boolean satnotvalid = contingent(mytc);
		System.out.println(satnotvalid);
	}

}
