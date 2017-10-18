package src;

public class TestLogicalSentence{


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LogicSentence ChiefsUndefeated = new SimpleLogicalSentence();

		SimpleLogicalSentence TexansAreGood = new SimpleLogicalSentence();
		
		Conjunction tandc = new Conjunction();

		TexansAreGood.propConstant = "p";
		
		TexansAreGood.explanation = "Because I said so";
		
		tandc.left = ChiefsUndefeated;
		
		tandc.right = TexansAreGood;
		

		System.out.println(ChiefsUndefeated);
		System.out.println(TexansAreGood);
		System.out.println(tandc);


	}

}
