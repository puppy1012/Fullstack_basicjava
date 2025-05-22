package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2606 {
	private static int n;
	private static int m;
	private static int[][] matrix;
	private static boolean[] visitedNode;//방문했던 노드 정보를 기록하는 배열
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//		int computer=Integer.parseInt(br.readLine());
		n=Integer.parseInt(br.readLine());
		m=Integer.parseInt(br.readLine());
		matrix=new int[n+1][n+1];
		visitedNode=new boolean[n+1];
		for(int i=1;i<=m;i++) {
			String[] list=br.readLine().split(" ");
			int start= Integer.parseInt(list[0]);
			int end=Integer.parseInt(list[1]);
			matrix[start][end]=1;
			matrix[end][start]=1;
		}
		System.out.println(dfs(1));
		
	}
	public static int dfs(int node) {
		visitedNode[node]=true;
		int count=0;
		for(int i=1;i<=n;i++) {
			if(matrix[node][i]==1 &&!visitedNode[i]) {
				count+= 1+dfs(i);
			}
		}
		return count;
		
	}
	
}
