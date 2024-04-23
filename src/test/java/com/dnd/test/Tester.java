/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dnd.test;

import java.util.ArrayList;
import com.dnd.sort.Sorter;
import com.dnd.sort.SurnameSorter;
import com.dnd.model.FullName;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author LuqmaanS
 */
public class Tester {

	public static void main(String[] args) {
		try {
			Tester t = new Tester();
			t.testFullNameArrayConstructor();
			t.testSort();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Test
	public void testFullNameArrayConstructor() throws Exception {
		String[] names = new String[]{"Janet", "Parsons"};
		FullName fn = new FullName(names);
		FullName fullName = new FullName("Parsons", "Janet");
		Assertions.assertEquals(fullName.toString(), fn.toString());
		
		names = new String[]{"Hunter", "Uriah", "Mathew", "Clarke"};
		fn = new FullName(names);
		fullName = new FullName("Clarke", "Hunter Uriah Mathew");
		Assertions.assertEquals(fullName.toString(), fn.toString());
	}

	@Test
	public void testSort() throws Exception {
		Sorter sorter = new SurnameSorter();
		List<FullName> sortedList = new ArrayList<>();
		sortedList.add(new FullName("Alvarez", "Marin"));
		sortedList.add(new FullName("Archer", "Adonis Julius"));
		sortedList.add(new FullName("Bentley", "Beau Tristan"));
		sortedList.add(new FullName("Clarke", "Hunter Uriah Mathew"));
		sortedList.add(new FullName("Gardner", "Leo"));
		sortedList.add(new FullName("Lewis", "Vaugh"));
		sortedList.add(new FullName("Lindsey", "London"));
		sortedList.add(new FullName("Lopez", "Mikayla"));
		sortedList.add(new FullName("Parsons", "Janet"));
		sortedList.add(new FullName("Ritter", "Frankie Conner"));
		sortedList.add(new FullName("Yoder", "Shelby Nathan"));

		List<FullName> fullNames = new ArrayList<>();
		fullNames.add(new FullName("Parsons", "Janet"));
		fullNames.add(new FullName("Lewis", "Vaugh"));
		fullNames.add(new FullName("Archer", "Adonis Julius"));
		fullNames.add(new FullName("Yoder", "Shelby Nathan"));
		fullNames.add(new FullName("Alvarez", "Marin"));
		fullNames.add(new FullName("Lindsey", "London"));
		fullNames.add(new FullName("Bentley", "Beau Tristan"));
		fullNames.add(new FullName("Gardner", "Leo"));
		fullNames.add(new FullName("Clarke", "Hunter Uriah Mathew"));
		fullNames.add(new FullName("Lopez", "Mikayla"));
		fullNames.add(new FullName("Ritter", "Frankie Conner"));

		sorter.sortNames(fullNames);
		Assertions.assertEquals(sortedList.toString(), fullNames.toString());
	}
}
