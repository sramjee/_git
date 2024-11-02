package scratchpad;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			int i = 5/2;
			System.out.println(i);
		}
		catch(ArrayIndexOutOfBoundsException | IllegalArgumentException ex) {
			System.out.println(ex);
		}
		catch(RuntimeException re) {
			System.out.println(re);
		}
	}
}
