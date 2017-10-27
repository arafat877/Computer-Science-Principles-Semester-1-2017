package arrays;

public class TwoDStats {

	static int[] onedv = new int [9];
	static int a = 0;
	static int b = 1;
	static int c = 2;
	static int d = 3;
	static int e = 4;
	static int f = 5;
	static int g = 6;
	static int h = 7;
	static int i = 8;

	static int[][] values = new int[3][3];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		onedv[0] = a;
		onedv[1] = b;
		onedv[2] = c;
		onedv[3] = d;
		onedv[4] = e;
		onedv[5] = f;
		onedv[6] = g;
		onedv[7] = h;
		onedv[8] = i;


		values[0][0] = a;
		values[1][1] = b;
		values[2][2] = c;
		values[1][0] = d;
		values[1][1] = e;
		values[1][2] = f;
		values[2][0] = g;
		values[2][1] = h;
		values[2][2] = i;

		//average all values in onedv

		int av = 0;

		/*
		av += onedv[0];
		av += onedv[1];
		av += onedv[2];
		av += onedv[3];
		av += onedv[4];
		av += onedv[5];
		av += onedv[6];
		av += onedv[7];
		av += onedv[8];
		 */

		for(i = 0; i < onedv.length; i++){
			av += onedv[i];
		}
		av /= 9;
		System.out.println(av);

		av = 0;
		for(int k = 0; k < values.length; k++){
			for(int m = 0; m < values.length; m++){
				av += values[k][m];
			}
		}

		av /= 9;
		System.out.println(av);

		int[][] newvalues = {{3,1,4},{5,9,2},{5,3,5}};
		int ab = computeAverage(newvalues);


		System.out.println(ab);
	}

	static int computeAverage(int[][] myArg){
		int ab = 0;
		for(int[] varray : myArg){
			for(int v : varray){
				ab += v;
			}
		}
		ab /= 9;
		return ab;
	}

}
