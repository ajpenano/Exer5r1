package com.exist.app;

import com.exist.service.TableService;
import com.exist.service.TableServiceImpl;
import com.exist.util.ScannerUtil;

public class App {
	
	TableService tableService = new TableServiceImpl();
	
	void start(String[] args) {
		
		tableService.runTableService(args);
		
		while(true) {
			String option = ScannerUtil.scanNextLine("\nEnter the small letter representing the action you like:"
											  + "\nSearch(s), Edit(d), Print(p), Reset(r), Sort(o), Add Row(w), Exit(x)"
											  + "\nYour choice: ");
			
			switch (option) {
			
			case "s":
				tableService.search();
				break;
				
			case "d":
				tableService.edit();	
				break;
				
			case "p":
				tableService.printTable();
				break;
				
			case "r":				
				tableService.confirmReset();
				break;
			
			case "o":
				tableService.sortTableAscending();
				break;
				
			case "w":
				tableService.addRow();
				break;
				
			case "x":
				System.out.println("Exiting the program...");
				ScannerUtil.scanClose();
				System.exit(0);
				break;
				
			default:
				System.out.println("This is not a valid menu option. Please choose again.");
				break;
				
			}
			
		}
		
	}
	
}
