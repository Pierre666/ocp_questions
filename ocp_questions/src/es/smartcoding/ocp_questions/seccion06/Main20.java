/**
 * 
 */
package es.smartcoding.ocp_questions.seccion06;


/**
 * @author jmendez
 *
 */
public class Main20 {

	static class Cazuela implements AutoCloseable {
		public void close() {
			throw new RuntimeException("A");
		}
	}

	public static void main(String[] args) {
		try (Cazuela cazuela1 = new Cazuela(); Cazuela cazuela2 = new Cazuela();) {
			System.out.println("Main");
		} catch (Exception e) {
			System.out.printf("%s %d%n", e.getMessage(), e.getSuppressed().length);
			for (Throwable t : e.getSuppressed()) {
				System.out.println(t);
			}
		}
	}

}
