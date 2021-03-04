package exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Exercise5_4 {
	public Exercise5_4() {
		run();
	}
	
	
	private void run() {
		int a[] = {1,7,6,5,3};
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}


	public static void main(String[] args) {
		new Exercise5_4();
	}
}
