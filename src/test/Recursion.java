package test;

public class Recursion {
	public static void main(String args[]) throws Exception


{
hanio(4,1,2,3);
}


	public static void hanio(int n,int t1,int t2,int t3) throws Exception{
		if(n==1){
			System.out.println("从"+t1+"移到"+t3);
		}else {
			hanio(n-1,t1,t3,t2);
			System.out.println("从"+t1+"移到"+t2);
			hanio(n-1,t2,t1,t3);
		}
	}
}

