import java.util.*;
public class P 19 
{
	public static void main(String[] args)
 {
		int NoOfRowAndColumn=5;
		int a[][]={{1,0,1,1,0},{1,0,0,1,1},{1,1,0,1,1},{1,1,1,1,1},{0,1,1,1,1}
};		
		int count=0;
		int max=NoOfRowAndColumn;

		for(int i=0;i<5;i++)
{
			count=0;
			for( int j=0;j<5;j++)
{
			if(a[i][j]==1){
				count++;

			}

			}

			if(count<max)
{
				max=count;
			}
		}
		for(int i=0;i<max;i++)
{
			for(int j=0;j<max;j++)
{
				System.out.print("1");
			}
			System.out.println();
		}
}
}