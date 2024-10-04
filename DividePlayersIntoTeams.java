package leetcode_II;

import java.util.Arrays;

public class DividePlayersIntoTeams {

	public static void main(String[] args) {
		int[] skill = {2,3,4,2,5,5};
		System.out.println(dividePlayers(skill));

	}

	public static long dividePlayers(int[] skill) {
		Arrays.sort(skill);
		System.out.println(Arrays.toString(skill));
		long sum=0;
		for(int i=0;i<skill.length;i++) {
			sum+=skill[i];
		}
		
		int val=(int)sum/(skill.length/2);
		long ans=0;
		int j=skill.length-1;
		for(int i=0;i<skill.length/2;i++) {
			if(skill[i]+skill[j]==val) {
				int x=skill[i]*skill[j--];
				ans+=x;
			}
			else {
				return -1;
			}
		}
		return ans;
	}

}
