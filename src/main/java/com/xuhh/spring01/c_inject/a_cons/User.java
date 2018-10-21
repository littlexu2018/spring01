package com.xuhh.spring01.c_inject.a_cons;

/**
 * @Author: xuhh
 * @Description:
 * @Date: Created in 20:16 2018/10/21
 * @Modified By:
 */
public class User {

	private Integer uid;
	private String name;
	private Integer age;

	public User(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	public User(Integer uid, String name) {
		this.uid = uid;
		this.name = name;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User{" +
				"uid=" + uid +
				", name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
