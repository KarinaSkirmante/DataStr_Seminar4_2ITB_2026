package service;

import datastr.MyBST;

public class MainService {

	public static void main(String[] args) {
		MyBST<Integer> bstForIntegers = new MyBST<Integer>();

		try {
			bstForIntegers.add(10);//P: 10
			bstForIntegers.add(6);//P: 10 (LC:6)
			bstForIntegers.add(23);//P: 10 (LC:6, RC:23)
			bstForIntegers.add(8);//P: 10 (LC:6, RC:23); P:6 (RC:8)
			bstForIntegers.add(7);//P: 10 (LC:6, RC:23); P:6 (RC:8); P: (LC:7)
			bstForIntegers.print();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
