/**
 * 
 */
package es.smartcoding.ocp_questions.seccion06;

/**
 * @author jmendez
 *
 */
public class Main12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 0;
		assert (n < 0); // (1)
		assert n < 0; // (2)
		assert (n < 0) : "Negativo"; // (3)
		assert n < 0 : "Negativo"; // (4)
//		assert (n < 0)  "Negativo"; // (5)
//		assert n < 0  "Negativo"; // (6)
	}

}
