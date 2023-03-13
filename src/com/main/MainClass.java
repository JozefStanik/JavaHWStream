package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {
		Stream<Integer> s1 = Stream.iterate(1, A->A+1);
		System.out.println(s1.limit(1000).filter(A->(A%3==0)).filter(A->A%5==0).filter(A->A%7!=0).mapToDouble(A->A).average());
		
		Stream<Integer> s2 = Stream.iterate(1, A->A+1);
		s2.filter(A->A%2==0).filter(A->A%8!=0).limit(100).forEach(A->System.out.println(A));
		
		List<Book> b = new ArrayList<>();
		b.add(new Book("Prva", 120));
		b.add(new Book("Druhe vydanie", 50));
		b.add(new Book("Tretie vydanie", 34));
		
		b.stream().filter(A->A.getPrice()<100).map(A->A.getName()).sorted().forEach(A->System.out.println(A));
	}

}
