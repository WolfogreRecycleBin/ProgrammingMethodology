package Part2;

import java.util.Random;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 01/02/2016.
 */
public class Practice2_1 {
	public static void main(String args[]){
		System.out.println("13121602-宋建鑫:");
		Random random = new Random();
		int x = random.nextInt();
		int y = random.nextInt();
		int z;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		if(x > y)
			z = x;
		else
			z = y;
		System.out.println("z = " + z);
	}
}
