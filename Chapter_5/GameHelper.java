package chapter_5;
import java.util.*;

public class GameHelper {
	public int getUserInput(String prompt) {
		System.out.println(prompt + ": ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

}
