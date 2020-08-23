package com.ys.huawei.exam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();

		Map<String, Integer> map = new HashMap<String, Integer>();

		String[] str1Arr = str1.split(";");
		for (int i = 0; i < str1Arr.length; i++) {
			String[] gra = str1Arr[i].split(",");
			map.put(gra[0], Integer.valueOf(gra[1]));
		}

		List<Student> list = new ArrayList<Student>();

		String[] str2Arr = str2.split(";");
		for (int i = 0; i < str2Arr.length; i++) {
			String[] gra = str2Arr[i].split(",");
			if (map.containsKey(gra[0])) {
				Student student = new Student();
				student.setGrade(map.get(gra[0]) + Integer.valueOf(gra[1]));
				student.setStuNo(gra[0]);
				student.setTream(gra[0].substring(0, 5));
				list.add(student);
			}
		}

		if (list.size() > 0) {
			Map<String, List<Student>> mapList = list.stream().sorted(new Comparator<Student>() {

				@Override
				public int compare(Student o1, Student o2) {
					return o1.getTream().compareTo(o2.getTream());
				}

			}).collect(Collectors.groupingBy(Student::getTream));

			Set<Entry<String, List<Student>>> set = mapList.entrySet();
			for (Entry<String, List<Student>> entry : set) {
				System.out.println(entry.getKey());
				List<Student> stus = entry.getValue();
				stus = stus.stream().sorted(new Comparator<Student>() {

					@Override
					public int compare(Student o1, Student o2) {
						return o2.getGrade() - o1.getGrade();
					}
				}).sorted(new Comparator<Student>() {

					@Override
					public int compare(Student o1, Student o2) {
						return o1.getStuNo().compareTo(o2.getStuNo());
					}
				}).collect(Collectors.toList());
				StringBuffer sb = new StringBuffer();
				for (Student stu : stus) {
					sb.append(";").append(stu.getStuNo());
				}
				System.out.println(sb.toString().substring(1));
			}

		} else {
			System.out.println("NULL");
		}
	}

}

class Student implements Comparator<Student> {
	private String tream;
	private String stuNo;
	private int grade;

	public String getTream() {
		return tream;
	}

	public void setTream(String tream) {
		this.tream = tream;
	}

	public String getStuNo() {
		return stuNo;
	}

	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getStuNo().compareTo(o2.getStuNo());
	}

}