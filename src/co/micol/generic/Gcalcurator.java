package co.micol.generic;

public class Gcalcurator {
	

//	public <T extends Number> double sum(T t1,T t2){  //T는 Number type만 올수 있고 리턴은  double임
//		double v1=t1.doubleValue();
//		double v2=t2.doubleValue();
//		
//		return v1+v2; // 원하는 리턴 (double등) 타입 정의 해 줌
//	}
	
	//extends 는 type 제한하기 위해
	public <T extends Number> int sum(T t1,T t2){  //T는 Number type만 올수 있고 리턴은  int임
		int v1=t1.intValue();
		int v2=t2.intValue();
		
		return v1+v2; // 원하는 리턴 (double등) 타입 정의 해 줌
	}

}
