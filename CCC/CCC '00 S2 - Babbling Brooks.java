// From: https://dmoj.ca/problem/ccc00s2

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner r = new Scanner(System.in);
	
		int n = r.nextInt();
		
		ArrayList<Double> rivers = new ArrayList<Double>();
		
		for (int i = 0; i < n; i++) {
			
			rivers.add(r.nextDouble());
		}

		
		int in;

		do {
			
			in = r.nextInt();
			if (in == 77) break;
			
			if (in == 99) {
				int index = r.nextInt();
				int leftFlow = r.nextInt();
				
				rivers.add(index - 1, rivers.get(index - 1) * leftFlow / 100);
				rivers.set(index, rivers.get(index) * (100 - leftFlow) / 100);

				
			} else if (in == 88) {
				int index = r.nextInt();				

				rivers.set(index - 1, rivers.get(index - 1) + rivers.get(index));
				rivers.remove(index);
				
			}
			
		} while (in != 77);
		
		for (int i = 0; i < rivers.size(); i++) {
			System.out.print((int)Math.round(rivers.get(i)) + " ");
		}

		
		
		r.close();
	}
	
}
