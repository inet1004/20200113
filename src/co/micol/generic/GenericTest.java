package co.micol.generic;

public class GenericTest<T> {
	private  T t;
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t=t;
	}
}
