package com.xuhh.spring01.c_inject.f_collection;

import java.util.*;

/**
 * @Author: xuhh
 * @Description:
 * @Date: Created in 21:55 2018/10/21
 * @Modified By:
 */
public class CollDate {
	//常用集合类型
	private String [] arrDate;
	private List<String> listDate;
	private Set<String> setDate;
	private Map<String,String>  mapDate;
	private Properties propsDate;

	@Override
	public String toString() {
		return "CollDate{" +
				"\narrDate=" + Arrays.toString(arrDate) +
				", \nlistDate=" + listDate +
				", \nsetDate=" + setDate +
				", \nmapDate=" + mapDate +
				", \npropsDate=" + propsDate +
				'}';
	}

	public String[] getArrDate() {
		return arrDate;
	}

	public void setArrDate(String[] arrDate) {
		this.arrDate = arrDate;
	}

	public List<String> getListDate() {
		return listDate;
	}

	public void setListDate(List<String> listDate) {
		this.listDate = listDate;
	}

	public Set<String> getSetDate() {
		return setDate;
	}

	public void setSetDate(Set<String> setDate) {
		this.setDate = setDate;
	}

	public Map<String, String> getMapDate() {
		return mapDate;
	}

	public void setMapDate(Map<String, String> mapDate) {
		this.mapDate = mapDate;
	}

	public Properties getPropsDate() {
		return propsDate;
	}

	public void setPropsDate(Properties propsDate) {
		this.propsDate = propsDate;
	}

}
