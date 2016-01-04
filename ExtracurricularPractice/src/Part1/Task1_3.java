package Part1;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 01/02/2016.
 */
public class Task1_3 {
	public static void main(String args[]){
		System.out.println("13121602-宋建鑫:");
		final int PRICE = 19;
		int twoYuanCount = 0;
		int fiveYuanCount = 0;
		while(twoYuanCount * 2 - fiveYuanCount * 5 != PRICE){
			if(twoYuanCount * 2 - fiveYuanCount * 5 < PRICE)
				++twoYuanCount;
			else
				++fiveYuanCount;
		}
		System.out.println("顾客付" + twoYuanCount + "张2元钞票");
		System.out.println("售货员找" + fiveYuanCount + "张5元钞票");
	}
}
