package org.department;

import org.college.College;

public class Department extends College{
  protected static String[] getDepartments() {
      String[] s = {"ECE", "EEE", "MECH", "MBA", "MCA"};
	  return s;
  }
}
