package cis232.classlab;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Structure> structures = new ArrayList<>();
		
		structures.add(new House(2,4,1000));
		structures.add(new House(5,2,1500));
		structures.add(new Barn(5, 1000));
		structures.add(new Barn(8, 2000));
		
		for(int i = 0 ; i < structures.size(); i ++){
			System.out.printf("%s with %.1f square feet%n", structures.get(i).toString(), structures.get(i).getSquareFeet());
		}
	}

}
