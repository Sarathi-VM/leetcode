package leetCode;
import java.util.HashSet;
import java.util.Set;

public class kDistinctStringCopy {

	public static void main(String[] args) {
		String[] arr= {"ds","df"};
		int k=2;
		Set<String> distinct = new HashSet<>();  
        Set<String> seen = new HashSet<>();

        for (String str : arr) {
            if (!seen.add(str)) {
                distinct.remove(str);
            } else {
                distinct.add(str);
            }
        }

        for (String str : arr) {
            if (distinct.contains(str) && --k == 0) {
                System.out.println(str);
            }
        }

        System.out.println("");
    }

	}


