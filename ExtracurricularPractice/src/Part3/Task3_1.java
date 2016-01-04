package Part3;

import java.util.Random;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 01/02/2016.
 */
public class Task3_1 {
	public static void main(String args[]){
		System.out.println("13121602-宋建鑫:");
		int array[] = new int [10];
		init(array);
		int maxLength = 0;
		int length = 0;
		int value = -1;
		for (int i = 0; i < array.length; i++){
			if(value != array[i]){
				value = array[i];
				length = 1;
			}
			else{
				++length;
			}
			if(maxLength < length)
				maxLength = length;
		}
		System.out.println(maxLength);
	}

	static void init(int array[]){
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(2);
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
