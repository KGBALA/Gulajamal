package Day1_DataTypes;

public class MyLoop {
	public static void main(String[] args) {
		int i=43;
		String name="bond";
		System.out.println(i+name);
		String s =i+"";
		String str=String.valueOf(i);
		String ss="235";
		int ii = Integer.valueOf(ss);
		System.out.println(ii);
		//for loop
		for(int k=0; k<10; k++) {
			System.out.println("num:"+k);//this k is only used inside this block scope
		}
		//System.out.println();
		for(int k=10;k<0; k--)
	}

}
