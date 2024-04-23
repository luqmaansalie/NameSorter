/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.dnd.namesorter;

import com.dnd.sort.Sorter;
import com.dnd.sort.SurnameSorter;
import com.dnd.model.FullName;
import com.dnd.view.FileResultWriter;
import com.dnd.view.PrintResultWriter;
import com.dnd.view.ResultWriter;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LuqmaanS
 */
public class NameSorter {

	private List<FullName> fullNames;
	//private final String FILENAME = "unsorted-names-list.txt";

	public NameSorter() {
		fullNames = new ArrayList<>();
	}

	public List<FullName> getFullNames() {
		return fullNames;
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		try {
			// TODO code application logic here
			if (args.length == 0) {
				System.out.println("No input file specified");
				return;
			}

			NameSorter ns = new NameSorter();
			ns.readFile(args[0]);
			Sorter sorter = new SurnameSorter();
			sorter.sortNames(ns.getFullNames());
			ResultWriter rw = new FileResultWriter();
			rw.writeResult(ns.getFullNames());
			rw = new PrintResultWriter();
			rw.writeResult(ns.getFullNames());
			//System.out.println(ns.getFullNames().toString());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void readFile(String fileName) throws Exception {
		Path path = Paths.get(fileName);
		if (!path.toFile().exists()) {
			throw new Exception("File not found");
		}

		BufferedReader br = Files.newBufferedReader(path);
		String s;
		while ((s = br.readLine()) != null) {
			fullNames.add(new FullName(s.split(" ")));
		}

		br.close();
	}

}
