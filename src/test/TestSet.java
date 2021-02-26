package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> arrayList = new HashSet<Integer>();
		arrayList.add(123);
		System.out.println(arrayList.add(1232));
		String aString = "123,123,123";
		String a[] = aString.split(",");
		System.out.println();
	}

}
