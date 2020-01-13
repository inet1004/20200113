package co.micol.overloading;

public class Calcurator {
	public int sum(int n, int m) {
		return n + m;
	}
	
	public int sum(int n, int m, int c) {
		return n + m+c;
	}

	public float sum(float x, float y) {
		return x + y;
	}
	
	
	public int multi(int n, int m) {
		return n*m;
	}
	
	public float multi(float x, float y) {
		return x*y;
	}

	public float sum(double d, double e) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
//	@Override
//	public int sum(int n, int m) {
//		return n+m+10;
//	}
	
}
