package Part1;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 01/02/2016.
 */
public class Practice1_1 {

	static int result = 0;
	static int solution[];

	public static void main(String arg[]){
		System.out.println("13121602-宋建鑫:");
		solution = new int [8];
		backtrack(0);
		System.out.println(result);
	}

	static boolean isLegal(int depth){
		for(int i = 0; i <= depth; ++i)
			for(int j = i + 1; j <= depth; ++j){
				if(solution[i] == solution[j])
					return false;
				if(Math.abs(i - j) == Math.abs(solution[i] - solution[j]))
					return false;
			}
		return true;
	}

	static void backtrack(int depth){
		if(depth == 8){
			++result;
			return;
		}
		for(int i = 0; i < 8; ++i){
			solution[depth] = i;
			if(isLegal(depth))
				backtrack(depth + 1);
		}
	}
}
