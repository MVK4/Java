package com.coreJava.Excercises;

public class SampleBreakProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub///
		boolean x = true;
		
		bl1:{
			bl2:{
				bl3:{
					System.out.println("Block3");
					if(x) break bl2;
					}
				System.out.println("Block2");
				}
			System.out.println("Block1");
		}
		System.out.println("Out of all blocks");
	}

}
