/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dnd.view;

import java.util.List;
import com.dnd.model.FullName;

/**
 *
 * @author LuqmaanS
 */
public class PrintResultWriter implements ResultWriter {

	@Override
	public void writeResult(List<FullName> fullNames) {
		for (FullName f : fullNames) {
			System.out.println(f.toString());
		}
	}

}