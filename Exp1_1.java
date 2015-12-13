import java.util.*;

public class Exp1_1{
	static public void main(String args[]){
		System.out.println("13121602-宋建鑫-运行结果:");
		int N;
		int x;
		int i,k,lim;
		boolean prim = false;
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		int p[] = new int[N+1];
		p[1] = 2;
		System.out.println(p[1]);
		x = 1; lim = 1;
		for(i = 2; i <= N; i++){
			do{
				x += 2;
				if(lim * lim < x)
					lim += 1;
				k = 2;
				prim = true;
				while(prim && k < lim){
					prim = (x % p[k]) != 0;
					k +=1;
				}
			}while(!prim);
			p[i] = x;
			System.out.println(x);
		}
	}
}