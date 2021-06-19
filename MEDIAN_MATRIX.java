package practice;
import java.lang.Math;
import java.util.Arrays;
public class test{
	static int mat[][]= {{1,3,5},{2,6,9},{3,6,9}};
	static int median(int[][] mat,int r,int c) {
		int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		for(int[] row:mat) {                     //finding max and min values
			if(row[0]<min) min=row[0];
			if(row[c-1]>max) max=row[c-1];
		}
		
		int desired=(r*c+1)/2;   //the number of elements lesser than or equal to median
		while(min<max) {
			int mid =min + (max-min)/2;
			int place=0,get=0;
			for(int i=0;i<r;i++) {
				get = Arrays.binarySearch(mat[i],mid);
				if(get<0)
					get=Math.abs(get)-1;
				else
					while(get<c && mat[i][get]==mid)
						get++;
				place+=get;
			}
			if(place<desired)
				min=mid+1;
			else
				max=mid;
		}
		return min;
	}
	
	public static void main(String args[]) {
		System.out.println(median(mat,3,3));
	}
}
