package listSort;

import java.util.ArrayList;
import java.util.List;

public class TestSort {

	public static void main(String args[]) {
		TestSort t = new TestSort();
		t.sortList(t.getList());

	}

	public void sortList(List list) {
		List<Person> listv = getList();
		Person p = null;
		for (int i = 0; i < listv.size(); i++) {

			for (int j = i + 1; j < listv.size(); j++) {
				if (listv.get(i).getAge() > listv.get(j).getAge()) {
					p = listv.get(i);
					listv.set(i, listv.get(j));
					listv.set(j, p);
				}
			}
		}

		for (Person p1 : listv) {
			System.out.println(p1.getAge());
		}

	}

	public List<Person> getList() {
		List<Person> personList = new ArrayList<>(100);
		Person p1 = new Person();
		p1.setAge(5);
		p1.setNo("1");
		personList.add(p1);
		p1 = new Person();
		p1.setAge(4);
		p1.setNo("3");
		personList.add(p1);
		p1 = new Person();
		p1.setAge(2);
		p1.setNo("5");
		personList.add(p1);
		p1 = new Person();
		p1.setAge(6);
		p1.setNo("2");
		personList.add(p1);
		p1 = new Person();
		p1.setAge(3);
		p1.setNo("6");
		personList.add(p1);
		p1 = new Person();
		p1.setAge(1);
		p1.setNo("4");
		personList.add(p1);
		return personList;
	}
}

class Person {
	int age;
	String name;
	String no;
	String height;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

}
