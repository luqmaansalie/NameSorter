/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dnd.view;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import com.dnd.model.FullName;

/**
 *
 * @author LuqmaanS
 */
public class FileResultWriter implements ResultWriter {

	private final String FILENAME = "sorted-names-list.txt";

	@Override
	public void writeResult(List<FullName> fullNames) {
		BufferedWriter br;
		try {
			br = new BufferedWriter(new FileWriter(FILENAME));
			for (FullName f : fullNames) {
				br.write(f.toString() + System.lineSeparator());
			}
			br.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}