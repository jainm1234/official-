import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Transmit test = new Transmit();

		String words = "test my words";
		String k = "1a25s8fe5dsg65ad";
		System.out.println(Arrays.toString(test.encrypt(words.getBytes(),
				k.getBytes())));

	}

}
