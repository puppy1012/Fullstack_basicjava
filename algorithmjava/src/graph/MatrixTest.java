package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixTest {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		//����� ������ ������ ǥ�õ� ������ �б�
		String[] line =br.readLine().split(" ");
		int nodeCount=Integer.parseInt(line[0]);
		int edgeCount=Integer.parseInt(line[1]);
		//��尡 1���� �����ϹǷ� ���� ���������� ���� 2���� �迭�� 1���� �� ������ش�.
		//�׷����� 2������ 3������� ���踦 �˰�ʹ�.(��������);
		//=>�������迭[2][3]
		int[][] matrixArr=new int[nodeCount+1][nodeCount+1];
		for(int i=1;i<=edgeCount;i++) {
			String[] edgeline=br.readLine().split(" ");
			int node1=Integer.parseInt(edgeline[0]);
			int node2=Integer.parseInt(edgeline[1]);
			matrixArr[node1][node2]=1;//����׷���
			//�������϶���
//			matrixArr[node2][node1]=1;
		}
		show(matrixArr);
		
	}
	public static void show(int[][] matrix) {
		for(int i=1;i<matrix.length;i++) {
			for(int j=1;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
