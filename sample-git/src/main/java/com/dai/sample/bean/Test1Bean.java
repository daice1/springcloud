package com.dai.sample.bean;

public class Test1Bean {

	public String name;
	
	public String age;
	
	public String sex;

	@Override
	public String toString() {
		return "Test1Bean [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String TestName() {
		
		return "testName";
	}
	
	
}
