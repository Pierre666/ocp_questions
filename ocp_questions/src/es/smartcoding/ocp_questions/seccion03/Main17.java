/**
 * 
 */
package es.smartcoding.ocp_questions.seccion03;

/**
 * @author jmendez
 *
 */
public class Main17<T> {
	private T t;

	public Main17(T t) {
		this.t = t;
	}

	public String toString() {
		return t.toString();
	}

	public static void main(String[] args) {
		System.out.print(new Main17<String>("Hola"));
		System.out.print(new Main17<Number>(1.3)); // (1)
	}

}
