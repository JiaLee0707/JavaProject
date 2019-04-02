import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		int start = 3;
		int end = 4;
		Random random = new Random();
		int randomNumber = random.nextInt(end+1-start)+start; //start~end ·£´ı¼ıÀÚ »ÌÀÚ
		
		System.out.println(randomNumber);
		
	}

}
