package com.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class TestBean1 {
	private int data1;
	private DataBean1 data2;
	
	
	@Autowired
	private DataBean1 data3;
	
	@Autowired
	@Qualifier("obj4")
	private DataBean2 data4;
	
	@Autowired
	@Qualifier("obj5")
	private DataBean2 data5;
	
	@Autowired(required = false)
	@Qualifier("obj6")
	private DataBean2 data6;

	public int getData1() {
		return data1;
	}

	public void setData1(int data1) {
		this.data1 = data1;
	}

	public DataBean1 getData2() {
		return data2;
	}

	public void setData2(DataBean1 data2) {
		this.data2 = data2;
	}

	public DataBean1 getData3() {
		return data3;
	}

	public void setData3(DataBean1 data3) {
		this.data3 = data3;
	}

	public DataBean2 getData4() {
		return data4;
	}

	public void setData4(DataBean2 data4) {
		this.data4 = data4;
	}

	public DataBean2 getData5() {
		return data5;
	}

	public void setData5(DataBean2 data5) {
		this.data5 = data5;
	}

	public DataBean2 getData6() {
		return data6;
	}

	public void setData6(DataBean2 data6) {
		this.data6 = data6;
	}





	

}
