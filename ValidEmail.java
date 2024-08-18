package leetCode;

import java.util.HashSet;

public class ValidEmail {

	public static void main(String[] args) {
		String[] email = { "test.emailalex@leetcode.com", "test.e.mailbob.cathy@leetcode.com",
				"testemail+david@lee.tcode.com" };
		HashSet<String> vm = new HashSet<String>();
		String mail = "";
		for (int i = 0; i < email.length; i++) {
			String e = email[i];
			int at = e.indexOf('@');
			String ln = e.substring(0, at);
			if (ln.contains(".") || ln.contains("+")) {
				ln = ln.replace(".", "");
				
				if (ln.contains("+")) {
					String r = ln.substring(ln.indexOf("+"));
					ln = ln.replace(r, "");
				}
				
				mail = ln + e.substring(e.indexOf("@"));
				vm.add(mail);
			} else {
				mail = ln + e.substring(e.indexOf("@"));
				vm.add(mail);
			}
		}
		System.out.println(vm.size());

	}

}
