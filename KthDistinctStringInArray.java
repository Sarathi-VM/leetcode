package leetCode;

public class KthDistinctStringInArray {

	public static void main(String[] args) {
		String[] a= {"d","b","c","b","c","a"};
		int k=2;
		boolean[] b=new boolean[a.length];
		int min=Integer.MAX_VALUE;
		int count=1;
		int ansCount=0;
		String ans="";
		for(int i=0;i<a.length;i++) {
			count=1;
			
			if(b[i]==false) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						count++;
						b[j]=true;
					}
				}
				if(count<=min && ansCount<k) {
						min=count;
						ans=a[i];
						ansCount++;
				}
				if(k>ansCount) {
					ans="";
				}
			}	
		}
		System.out.println(ans);

	}

}
