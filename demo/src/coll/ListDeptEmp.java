package coll;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeMap;
import java.util.TreeSet;

public class ListDeptEmp {

	public static void main(String[] args) throws Exception {
		var lines = Files.readAllLines(Path.of("c:\\classroom\\dept_emp.txt"));
		var depts = new TreeMap<String, TreeSet<String>>();

		for (String line : lines) {
			String parts[] = line.split(",");
			// Ignore line if it doesn't contain two parts 
			if(parts.length < 2)
				continue;
			
			String dept_name = parts[0];
			String emp_name = parts[1];
			
			if (depts.containsKey(dept_name))
				depts.get(dept_name).add(emp_name);
			else
			{
				var names = new TreeSet<String>();
				names.add(emp_name);
				depts.put(dept_name,names);
			}
		}

		for (String dept_name : depts.keySet())
		{
			System.out.println("****" + dept_name + "****");
		    for(String emp_name : depts.get(dept_name))
		    	System.out.println(emp_name);
    	
		}
	}

}
