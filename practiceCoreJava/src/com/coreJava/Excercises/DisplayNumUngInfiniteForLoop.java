package com.coreJava.Excercises;
//Displays numbers using infinite loop
public class DisplayNumUngInfiniteForLoop {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int x = 1;////////
		for( ; ; ) {
			System.out.println(x);
			x++;
			if(x>10) break;
		}
	}

}
