package service;

import datastr.MyArrayList;
import model.Student;

public class MainService {

	public static void main(String[] args) {
		MyArrayList<Character> symbols = new MyArrayList<Character>(2);
		symbols.add('a');
		symbols.add('b');
		symbols.add('c');
		try {
			symbols.print();
			symbols.add('Z', 1);
			symbols.print();
			symbols.remove(2);
			symbols.print();
			System.out.println(symbols.get(1));
			System.out.println(symbols.search('Z'));
			System.out.println(symbols.getNextOne('a'));
			symbols.sort();
			symbols.print();
			symbols.begone();
			symbols.add('W');
			symbols.print();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		MyArrayList<Student> allStudents = new MyArrayList<Student>();
		allStudents.add(new Student("Mikus", "Abele"));
		allStudents.add(new Student("Aleksis", "Padans"));
		allStudents.add(new Student("Janis", "Jansons"));
		try {
			allStudents.add(new Student("Ouch", "Ouchie"), 0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

