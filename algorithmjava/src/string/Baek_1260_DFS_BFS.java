package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 1. 입력데이터를 읽어서 인접행렬을 만든 후 셋팅
 */
public class Baek_1260_DFS_BFS {
	private static int n;//노드갯수
	private static int m;//엣지정보갯수
	private static boolean[] visitedNode;//방문했던 노드 정보를 기록하는 배열
	private static int[][]matrix;//노드와 엣지에 대한 정보를 담고있는 인접행렬
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String[] line=br.readLine().split(" ");
		n=Integer.parseInt(line[0]);
		m=Integer.parseInt(line[1]);
		visitedNode= new boolean[n+1];
		matrix=new int[n+1][n+1];
		for(int i=1;i<=m;i++) {
			String[] edgeline=br.readLine().split(" ");
			int start=Integer.parseInt(edgeline[0]);
			int end=Integer.parseInt(edgeline[1]);
			matrix[start][end]=1;//방향그래프
			
			matrix[end][start]=1;//무방향일때는 이것도 추가
		}
		show(matrix);
		dfs(1);
	}
	public static void show(int[][] matrix) {
		for(int i=1;i<matrix.length;i++) {
			for(int j=1;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	//스택연산
	//2160 dfs
	public static void dfs(int node) {
		visitedNode[node]=true;//방문기록남기기
		System.out.println("node :"+node);
		//모든 노드의 번호를 다 탐색해야하므로
		for(int i=1;i<=n;i++) {
			//연결되어있는 엣지정보가 있고 방문한적이 없으면 방문하도록 처리
			if(matrix[node][i]==1 && !visitedNode[i]) {
				dfs(i);
			}
		}
	}
	public static void bfs(int node) {
		
	}
}
