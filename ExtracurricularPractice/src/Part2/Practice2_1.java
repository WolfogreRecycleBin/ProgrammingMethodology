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
		System.out.println("随机生成x = " + x);
		System.out.println("随机生成y = " + y);
		int z;
		if(x > y)
			z = x;
		else
			z = y;
		System.out.println("较大数为z = " + z);
	}
}
