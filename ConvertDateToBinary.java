package leetcode_II;

public class ConvertDateToBinary {

	public static void main(String[] args) {
		String date = "2080-02-29";
		System.out.println(convertDateToBinary(date));

	}

	public static String convertDateToBinary(String date) {
		String[] d=date.split("-");
		String ans="";
		for(int i=0;i<d.length;i++) {
			int a=Integer.parseInt(d[i]);
			ans+=Integer.toBinaryString(a);
			if(i!=d.length-1) ans+="-";
		}
		return ans;
		
	}

}
