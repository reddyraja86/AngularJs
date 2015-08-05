package com.features.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
 *The new java.util.stream package has been added to JDK which allows us to perform filter/map/reduce-like operations with the collections in Java 8.
 *The Stream API would allow us to declare either sequential or parallel operations over the stream of data: 
 * http://zeroturnaround.com/rebellabs/java-8-explained-applying-lambdas-to-java-collections/
 * */


public class Stream_Main {

	public static void main(String args[]){
		
		List<Employee> empList =  loadData();
		
		Stream<Employee> stream =   empList.stream().filter( e -> e.getAge()>23);
		
		 System.out.println(stream.count());
	}
	
	
	private static List<Employee> loadData()
	{
		List<Employee> empList = new ArrayList<Employee>();
		Employee e1 = new Employee();
		e1.setAge(20);
		e1.setName("e20");
		Employee e2 = new Employee();
		e2.setAge(21);
		e2.setName("e21");
		Employee e3 = new Employee();
		e3.setAge(20);
		e3.setName("e22");
		Employee e4 = new Employee();
		e4.setAge(25);
		e4.setName("e25");
		Employee e5 = new Employee();
		e5.setAge(30);
		e5.setName("e30");
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		
		
		return empList;
	}
	
}
