package Arrays;

public class DataTypes_Arrays {

	public static void main(String[] args) {
		System.out.println("--------double-------------------");
		double[] d = {1.23,2.56,4.56};
		
		for(int i=0;i<d.length;i++) {
			System.out.println(d[i]);
		}
		System.out.println("--------char-------------------");
		char[] c = {'s','t','a','r'};
		
		for(int j=0;j<c.length;j++) {
			System.out.println(c[j]);
		}
		System.out.println("----------String-----------------");
		String[] s = {"Shiva","Rama","Krishna"};
		
		for(int k=0;k<s.length;k++) {
			System.out.println(s[k]);
		}
		System.out.println("---------boolean------------------");
		boolean[] b = {true,false,true,false};
		
		for(int l=0;l<b.length;l++) {
			System.out.println(b[l]);
		}
		System.out.println("----------integer-----------------");
		int[] t = {5,9,3};
		
		for(int m=0;m<t.length;m++){
			System.out.println(t[m]);
		}
	}

}
