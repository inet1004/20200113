package co.micol.generic;

import java.util.List;

public abstract class Dao {

	public abstract <T> List<T> allSelect();  //E는 클래스만 받고, T는 모든 타입을 받겠다. K,V key 값 value 값 hash map형일때
//	public abstract List<?> allSelect(); // ?은 나중에 형변환 타입을 알기 어렵다.
	public abstract <T> T select(T t);  // 메소드임, <T>의 t type정의 
	
//	public abstract <E> List<E> allSelect(); 
//	public abstract <E> E select(E e);  // 메소드임, <T>의 t type정의 
	
	
	
	
}
