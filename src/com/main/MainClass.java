package com.main;

import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {
		Stream<Integer> s1 = Stream.iterate(1, A->A+1);
		System.out.println(s1.limit(1000).filter(A->(A%3==0)).filter(A->A%5==0).filter(A->A%7!=0).mapToDouble(A->A).average());
	}

}
