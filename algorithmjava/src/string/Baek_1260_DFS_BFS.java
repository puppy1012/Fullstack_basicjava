package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 1. �Էµ����͸� �о ��������� ���� �� ����
 */
public class Baek_1260_DFS_BFS {
	private static int n;//��尹��
	private static int m;//������������
	private static boolean[] visitedNode;//�湮�ߴ� ��� ������ ����ϴ� �迭
	private static int[][]matrix;//���� ������ ���� ������ ����ִ� �������
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
			matrix[start][end]=1;//����׷���
			
			matrix[end][start]=1;//�������϶��� �̰͵� �߰�
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
	//���ÿ���
	//2160 dfs
	public static void dfs(int node) {
		visitedNode[node]=true;//�湮��ϳ����
		System.out.println("node :"+node);
		//��� ����� ��ȣ�� �� Ž���ؾ��ϹǷ�
		for(int i=1;i<=n;i++) {
			//����Ǿ��ִ� ���������� �ְ� �湮������ ������ �湮�ϵ��� ó��
			if(matrix[node][i]==1 && !visitedNode[i]) {
				dfs(i);
			}
		}
	}
	public static void bfs(int node) {
		
	}
}
