// https://dmoj.ca/problem/ccc21s1

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner r = new Scanner(System.in);
	
		int n = r.nextInt();
		
		int[] height = new int[n + 1];
		int[] width = new int[n];
		
		for (int i = 0; i < n + 1; i++) {
			height[i] = r.nextInt();
		}		
		
		for (int i = 0; i < n; i++) {
			width[i] = r.nextInt();
		}
		
		double area = 0;
		
		for (int i = 0; i < n; i++) {
			
			area += (double)width[i] * (height[i] + height[i + 1]) / 2;
			
		}
		
		System.out.println(area);
		
		r.close();
	}
	
}
