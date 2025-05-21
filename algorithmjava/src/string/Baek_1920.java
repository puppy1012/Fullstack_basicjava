package string;

import java.util.Arrays;
import java.util.Scanner;

public class Baek_1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1= Integer.parseInt(sc.nextLine());
        String[] Slist1=sc.nextLine().split(" ");
        int[] Ilist1= new int[num1];
        for(int i=0;i<Slist1.length;i++) {
        	Ilist1[i]=Integer.parseInt(Slist1[i]);
        }
        int num2= Integer.parseInt(sc.nextLine());
        String[] Slist2=sc.nextLine().split(" ");
        int[] Ilist2= new int[num2];
        for(int i=0;i<Slist2.length;i++) {
        	Ilist2[i]=Integer.parseInt(Slist2[i]);
        }
        Arrays.sort(Ilist1);
        StringBuilder builder= new StringBuilder();
        int[]result=binarysearch(Ilist1,Ilist2);
        for(int r:result) {
        	builder.append(r).append("\n");
        }
        System.out.println(builder.toString());
        
    }

    public static int[] binarysearch(int[] Ilist1, int[] Ilist2) {
    	int[] result= new int[Ilist2.length];
    	for(int i=0;i<Ilist2.length;i++) {
    		int key=Ilist2[i];
    		int start=0;
    		int end=Ilist1.length-1;
    		boolean found=false;
    		while(start<=end) {
    			int mid=(start+end)/2;
    			if(Ilist1[mid]==key) {
    				found=true;
    				break;
    			}else if(Ilist1[mid]<key) {
    				start=mid+1;
    			}else {
    				end=mid-1;
    			}
    		}
    		result[i]=found? 1:0;
    	}
		return result;
        
    }
}
