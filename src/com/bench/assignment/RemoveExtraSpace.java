package com.bench.assignment;

public class RemoveExtraSpace {

	public static void main(String[] args) {
//		Taking string value
		String str = new String("This   is    a   practice     question");
		System.out.println("String--> "+str);
		System.out.print("String after removing the space--> ");
//		Removing extra space
		System.out.print(str.replaceAll("\\s+"," ").trim());
	}

}
