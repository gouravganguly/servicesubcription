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
	
	public void addDetails(String name,String sub) {
		
		LinkedHashSet<String> val = tmap.get(name);
		if(val == null) {
			LinkedHashSet<String> first = new LinkedHashSet<String>();
			first.add(sub);
			tmap.put(name, first);
		} else {
			val.add(sub);
			tmap.put(name, val);
		}
		for(Map.Entry m : tmap.entrySet()) {
			System.out.println("Key: "+m.getKey()+" Value "+m.getValue());
		}	
	}
	public void deleteDetails(String name) {
		tmap.remove(name);
	}
	public TableModel getData() {
		DefaultTableModel model = new DefaultTableModel(new Object[] { "UserName", "Subscriptions" },
				0);
		for (Map.Entry<String, LinkedHashSet<String>> entry : tmap.entrySet()) {
			model.addRow(new Object[] { entry.getKey(), entry.getValue()});
		}

		return model;
	}
	
}