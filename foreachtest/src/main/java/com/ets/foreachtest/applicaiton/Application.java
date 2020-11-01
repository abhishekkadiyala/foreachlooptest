package com.ets.foreachtest.applicaiton;

import java.util.ArrayList;
import java.util.List;

import come.ets.foreachtest.model.TestCenter;
import come.ets.foreachtest.model.TestCenterAdmin;

public class Application {

	public static void main(String[] args) {
		
		List<TestCenterAdmin> tcAdmins  = new ArrayList<TestCenterAdmin>();
		
		
		
		
		TestCenter tc1 = new TestCenter(12345, "B", "Exton School");
		TestCenter tc2 = new TestCenter(34567, "S", "Princeton School");
		
		TestCenterAdmin tcadmin1 = new TestCenterAdmin(tc1, "0120");
		tcAdmins.add(tcadmin1);
		
		TestCenterAdmin tcadmin2 = new TestCenterAdmin(tc1, "0220");
		tcAdmins.add(tcadmin2);
		
		TestCenterAdmin tcadmin3 = new TestCenterAdmin(tc1, "0320");
		tcAdmins.add(tcadmin3);
		
		TestCenterAdmin tcadmin4 = new TestCenterAdmin(tc2, "0320");
		tcAdmins.add(tcadmin4);
		
		tcadmin4 = new TestCenterAdmin(tc1, "0920");
		tcAdmins.add(tcadmin4);
		
		
		System.out.println("count:" + tcAdmins.size());
		
		for(TestCenterAdmin tcAdmin:tcAdmins) {
			System.out.println(tcAdmin.toString());
		}
		
		
		
		
		
		
		
		
		
	}

}
