package service;

import datastr.MyArrayList;

public class MainService {

	public static void main(String[] args) {
		MyArrayList symbols = new MyArrayList(2);
		symbols.add('a');
		symbols.add('b');
		symbols.add('c');
		try {
			symbols.print();
			symbols.add('Z',1);
			symbols.print();
			symbols.remove(2);
			symbols.print();
			System.out.println(symbols.get(1));
			System.out.println(symbols.search('c'));
			System.out.println(symbols.getNextOne('a'));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
