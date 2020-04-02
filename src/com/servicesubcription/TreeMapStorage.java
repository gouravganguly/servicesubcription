package com.servicesubcription;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.Properties;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class TreeMapStorage {
	
	public static TreeMap<String, LinkedHashSet<String>> tmap = new TreeMap<String, LinkedHashSet<String>>();;
	Properties properties = new Properties();
	
	public TreeMapStorage()  {
		getFileData();
	}
	public boolean addDetails(String name,String sub){
		
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
		putFileData();
//		for(Map.Entry m : tmap.entrySet()) {
//			
//			System.out.println("Key: "+m.getKey()+" Value "+m.getValue());
//		}
		return isInserted;
	}
	@SuppressWarnings("unchecked")
	public void getFileData() {
		
		try {
	         FileInputStream fileIn = new FileInputStream("employee.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         tmap = (TreeMap<String, LinkedHashSet<String>>) in.readObject();
	         in.close();
	         fileIn.close();
	      } catch (IOException i) {
	         i.printStackTrace();
	         return;
	      } catch (ClassNotFoundException c) {
	         System.out.println("Employee class not found");
	         c.printStackTrace();
	         return;
	      }
	}
	public void putFileData() {
		try {
	         FileOutputStream fileOut = new FileOutputStream("employee.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(tmap);
	         out.close();
	         fileOut.close();
	      } catch (IOException i) {
	         i.printStackTrace();
	      }
	}
	
	public LinkedHashSet<String> deleteDetails(String name) {  
		LinkedHashSet<String> data = tmap.remove(name);
		putFileData();
		return data;
		  
	}
	public void editUserName(String oldName, String newName) {
		LinkedHashSet<String> list = tmap.remove(oldName);
		tmap.put(newName, list);
		putFileData();
	}
	public boolean deleteSubscription(String userName, String subName) {
		LinkedHashSet<String> allsubs = tmap.get(userName);
		boolean deleted = allsubs.remove(subName);
		tmap.put(userName, allsubs);
		putFileData();
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