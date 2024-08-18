package leetCode;


public class captalizeTheTitle {

	public static void main(String[] args) {
		String title = "capiTalIze He titLe and TO";
		capitalizeTitle(title);
		

	}
	public static void capitalizeTitle(String title) {
		String s2 = "";
		String[] a = title.toLowerCase().split(" ");
		for (int i = 0; i < a.length; i++) {
			String x = a[i];
			if (x.length() > 2) {
				s2 += x.toUpperCase().charAt(0);
				s2 += x.substring(1);
				if(i!=a.length-1)
					s2+=" ";
			}
			else {
				s2+=x.toLowerCase();
				if(i!=a.length-1)
					s2+=" ";
				
			}
		}
		System.out.println(s2);
	}

}
