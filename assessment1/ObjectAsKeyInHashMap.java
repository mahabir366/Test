package com.girmiti.assessment3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Account {
	
	private int keyId;
	private String username;
	private String AccNo;
	private String ifciCode;
	private String branch;
	private String Date;
	
	public Account(int keyId, String username, String accNo, String ifciCode, String branch, String date) {
		this.keyId = keyId;
		this.username = username;
		this.AccNo = accNo;
		this.ifciCode = ifciCode;
		this.branch = branch;
		this.Date = date;
	}

	public int getKeyId() {
		return keyId;
	}

	public String getUsername() {
		return username;
	}

	public String getAccNo() {
		return AccNo;
	}

	public String getIfciCode() {
		return ifciCode;
	}

	public String getBranch() {
		return branch;
	}

	public String getDate() {
		return Date;
	}

	@Override
	public String toString() {
		return "Account [username=" + username + ", AccNo=" + AccNo + ", ifciCode=" + ifciCode + ", branch=" + branch
				+ ", Date=" + Date + "]";
	}
		
}
	
public class ObjectAsKeyInHashMap {
	public static void main(String[] args) {

		// Take user
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter keyId :");
		int keyId = sc.nextInt();
		
		System.out.println("Enter username :");
		String username = sc.next();
		
		System.out.println("Enter AccNo :");
		String AccNo = sc.next();
		
		System.out.println("Enter ifciCode :");
		String ifciCode = sc.next();
		
		System.out.println("Enter branch :");
		String branch = sc.next();
		
		System.out.println("Enter time :");
		String time = sc.next();

		//create HashMap
		Map<Integer, Account> map = new HashMap<Integer, Account>();
		Account Acc1 = new Account(keyId, username, AccNo, ifciCode,branch,time);
		Account Acc2 = new Account(keyId, username, AccNo, ifciCode,branch,time);
		Account Acc3 = new Account(keyId, username, AccNo, ifciCode,branch,time);
		Account Acc4 = new Account(keyId, username, AccNo, ifciCode,branch,time);
		
		// adding values to map
		map.put(Acc1.getKeyId(), Acc1);
		map.put(Acc2.getKeyId(), Acc2);
		map.put(Acc3.getKeyId(), Acc3);
		map.put(Acc4.getKeyId(), Acc4);
		
		// retrieving values from map
		Set<Integer> keySet = map.keySet();
		for (int i : keySet) {
			System.out.println(map.get(i));
		}
		
		// searching key on map
		System.out.println("Check key its contain :"+map.containsKey(Acc1.getKeyId()));
		// searching value on map
		System.out.println("Check value its contain :"+map.containsValue(Acc1));
	}

}
