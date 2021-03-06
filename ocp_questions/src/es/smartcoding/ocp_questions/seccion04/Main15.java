/**
 * 
 */
package es.smartcoding.ocp_questions.seccion04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author jmendez
 *
 */
public class Main15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1, 2, 3);
		List<Integer> l2 = Arrays.asList(4, 5);
		List<Integer> l3 = Arrays.asList(); // (1)
		Stream.of(l1, l2, l3).flatMap(x -> x.stream()).forEach(System.out::print);
	}

}
