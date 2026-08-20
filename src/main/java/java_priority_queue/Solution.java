package java_priority_queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {

	public static void main(String[] args) {
		List<String> events = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < n; i++) {
			events.add(scan.nextLine());
		}
		//System.out.println(events);
		List<Student> students = getStudents(events);
		if (students.isEmpty()) {
			System.out.println("EMPTY");
		}
		else {
			for (Student student : students) {
				System.out.println(student.getName());
			}
		}
		scan.close();
	}

	static List<Student> getStudents(List<String> events) {
		Queue<Student> queue = new PriorityQueue<>((s1, s2) -> {
			if (Double.compare(s1.getCPGA(), s2.getCPGA()) == 0) {
				if (s1.getName().compareTo(s2.getName()) == 0) {
					return Integer.compare(s1.getID(), s2.getID());
				}
				return s1.getName().compareTo(s2.getName());
			}
			return Double.compare(s2.getCPGA(), s1.getCPGA());
		});
		for (String event : events) {
			String[] eventPart = event.split(" ");
			if ("ENTER".equalsIgnoreCase(eventPart[0])) {
				Student student = new Student(Integer.parseInt(eventPart[3]), eventPart[1], Double.parseDouble(eventPart[2]));
				queue.add(student);
				//System.out.println(">>ENTERED: " + queue);
			}
			else if ("SERVED".equalsIgnoreCase(eventPart[0])) {
				queue.poll();
				//System.out.println(">>SERVED: " + queue);
			}
		}
		return queue.stream().sorted().collect(Collectors.toList());
	}

}

class Student implements Comparable<Student> {

	private int ID;
	private String name;
	private double CPGA;

	public Student(int id, String name, double cpga) {
		this.ID = id;
		this.name = name;
		this.CPGA = cpga;
	}

	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public double getCPGA() {
		return CPGA;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return Double.compare(student.CPGA, CPGA) == 0 && Objects.equals(student.name, name) && ID == student.ID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID, name, CPGA);
	}

	@Override
	public String toString() {
		return "Student{" +
				"ID=" + ID +
				", name='" + name + '\'' +
				", CPGA=" + CPGA +
				'}';
	}

	@Override
	public int compareTo(Student student) {
		if (Double.compare(this.getCPGA(), student.getCPGA()) == 0) {
			if (this.name.compareTo(student.getName()) == 0) {
				return Integer.compare(this.getID(), student.getID());
			}
			else {
				return this.name.compareTo(student.getName());
			}
		}
		return Double.compare(student.getCPGA(), this.getCPGA());
	}

}
