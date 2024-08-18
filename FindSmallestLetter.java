package leetCode;

public class FindSmallestLetter {

	public static void main(String[] args) {
		char[] letters={'c','f','j'};
		char target='c';
		int start=0;
        int end=letters.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target<letters[mid]) {
            	end=mid-1;
            }
            else {
            start=mid+1;
            }
        }
        System.out.println(letters[start % letters.length]);

	}
	
	
	

}
