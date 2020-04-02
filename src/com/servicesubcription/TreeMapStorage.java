package com.servicesubcription;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class TreeMapStorage {
	
	public static TreeMap<String, LinkedHashSet<String>> tmap = new TreeMap<String, LinkedHashSet<String>>();
	
	public boolean addDetails(String name,String sub) {
		
		boolean isInserted = false;
		LinkedHashSet<String> val = tmap.get(name);
		if(val == null) {
			val = new LinkedHashSet<String>();
			isInserted = val.add(sub);
			tmap.put(name, val);
		} else {
			isInserted = val.add(sub);
			tmap.put(name, val);
		}
		for(Map.Entry m : tmap.entrySet()) {
			System.out.println("Key: "+m.getKey()+" Value "+m.getValue());
		}
		return isInserted;
	}
	public LinkedHashSet<String> deleteDetails(String name) {
		  return tmap.remove(name);
	}
	public void editUserName(String oldName, String newName) {
		LinkedHashSet<String> list = tmap.remove(oldName);
		tmap.put(newName, list);
	}
	public boolean deleteSubscription(String userName, String subName) {
		LinkedHashSet<String> allsubs = tmap.get(userName);
		boolean deleted = allsubs.remove(subName);
		tmap.put(userName, allsubs);
		return deleted;
	}
	public boolean checkUser(String userName) {
		return tmap.containsKey(userName);
	}
	
	public TableModel getData() {
		DefaultTableModel model = new DefaultTableModel(new Object[] { "UserName", "Subscriptions" },
				0);
		for (Map.Entry<String, LinkedHashSet<String>> entry : tmap.entrySet()) {
			model.addRow(new Object[] { entry.getKey(), entry.getValue()});
		}

		return model;
	}
	public TableModel searchData(String userName) {
		DefaultTableModel model = new DefaultTableModel(new Object[] { "UserName", "Subscriptions" },
				0);
		for (Map.Entry<String, LinkedHashSet<String>> entry : tmap.entrySet()) {
			if(entry.getKey().equals(userName))
				model.addRow(new Object[] { entry.getKey(), entry.getValue()});
		}
		return model;
	}
	public TableModel resetTable() {
		DefaultTableModel model = new DefaultTableModel();
		model.setRowCount(0);
		return model;
	}
	
}