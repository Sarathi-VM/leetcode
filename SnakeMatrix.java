package leetCode;

import java.util.ArrayList;

import java.util.List;

public class SnakeMatrix {

	public static void main(String[] args) {
		List<String> commands=new ArrayList<String>();
		commands.add("RIGHT");
		commands.add("DOWN");
		finalPositionOfSnake(2, commands);
	}

	public static void finalPositionOfSnake(int n, List<String> commands) {
		int k=0;
		int[][] a=new int[n][n];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				a[i][j]=k++;
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int elm=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(commands.get(j)=="RIGHT") {
					elm=a[i][j+1];
					System.out.println(elm);
				}
				else if(commands.get(j)=="DOWN") {
					elm=a[i+1][j];
					System.out.println(elm);
				}
				else if(commands.get(j)=="UP") {
					elm=a[i-1][j];
					System.out.println(elm);
				}
			}
		}
		System.out.println(elm);
		

	}

}
