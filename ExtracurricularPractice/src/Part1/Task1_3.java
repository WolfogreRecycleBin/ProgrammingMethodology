package Part1;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 01/02/2016.
 */
public class Task1_3 {
	public static void main(String args[]){
		System.out.println("13121602-宋建鑫:");
		for(int i = 4; i <= 100; i += 2){
			for(int j = 2; j < i; ++j){
				if(isPrime(j) && isPrime(i - j)){
					System.out.println(i + " = " + j + " + " + (i - j));
					break;
				}
			}
		}
	}
	static boolean isPrime(int n){
		if(n < 2)
			return false;
		for(int i = 2; i < n / 2; ++i){
			if(n % i == 0)
				return false;
		}
		return true;
	}
}
