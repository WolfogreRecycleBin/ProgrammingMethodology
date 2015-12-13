public class Exp1_2{
	public static void main(String args[]){
		System.out.println("13121602-宋建鑫-运行结果:");
		int i,il,ih,min,a,b,k;
		int [] j = new int [13];
		int [] s = new int [13];
		int [] p = new int [13];
		i=1;ih=2;il=1;
		j[1]=1;p[1]=1;s[1]=1;
		j[2]=1;p[2]=8;s[2]=9;
		do{
			min = s[i];a=i;b=j[i];
			if(j[i]==i)
				il = il+1;
			else{
				if(j[i] ==1){
					ih=ih+1;p[ih]=ih*ih*ih;
					j[ih]=1;s[ih]=p[ih]+1;
				}
				j[i]=j[i]+1;s[i]=p[i]+p[j[i]];
			}
			i=il;k=i;
			while(k<ih){
				k = k+1;
				if(s[k] <s[i]) i=k;
			}
		}while(s[i]!=min);
		System.out.println("s = " + min + " = " + a + "^3 + " + b + "^3 = " + i + "^3 + " + j[i] + "^3");
	}
}
