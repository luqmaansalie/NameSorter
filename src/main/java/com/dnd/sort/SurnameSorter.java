/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dnd.sort;

import java.util.Collections;
import java.util.List;
import com.dnd.model.FullName;

/**
 *
 * @author LuqmaanS
 */
public class SurnameSorter implements Sorter {

	@Override
	public void sortNames(List<FullName> fullNames) throws Exception {
		Collections.sort(fullNames, (Object o1, Object o2) -> {
			FullName p1 = (FullName) o1;
			FullName p2 = (FullName) o2;
			int res = p1.getSurname().compareToIgnoreCase(p2.getSurname());
			if (res != 0) {
				return res;
			}
			return p1.getGivenNames().compareToIgnoreCase(p2.getGivenNames());
		});
	}

}