package guvii;

import java.util.Arrays;
import java.util.Scanner;

public class HunterPro29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] arr = new int[num];
		for(int i = 0;i < num; i++) {
			arr[i] = in.nextInt();
		}
		int n =in.nextInt();
		Arrays.sort(arr);
		int sum = 0;
		for(int i = arr.length - n; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
}
