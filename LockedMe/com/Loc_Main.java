package LockedMe.com;

import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class Loc_Main {

		public static void main (String[] args) throws IOException {
			Scanner s = new Scanner(System.in);
			Loc_Options opt = new Loc_Options();
			
				System.out.println("--- ***** Welcome ***** ---" );
				System.out.println("--- ***** Application: LockedMe.com ***** ---" );
				System.out.println("--- ***** Developer: Martin Oduro Nyarko ***** ---" );
				System.out.println("--- ***** Email: kn_nyarko@yahoo.com ***** ---" );
				System.out.println("--- ***** Github Account: Nana-KJ ***** ---" );
			
			while (true) {
				
				System.out.println(" \nPlease choose from the menu:");
				System.out.println("1. Show files (asc order).");
				System.out.println("2. Add/Delete/Search a file.");
				System.out.println("3. Close the app.\n");
				System.out.println("Your choice:");

			int choice = s.nextInt();
			switch(choice){

			case 1:
			opt.showFiles();
			        
			break;
			
			case 2:
				System.out.println("Please choose an option:");
				System.out.println("\t 1) Add a file");
				System.out.println("\t 2) Delete a file");
				System.out.println("\t 3) Search a file ");
				System.out.println("\t 4) Return to menu");
				System.out.println("Your choice:");
				
			int option = s.nextInt();
			if(option==1)
			opt.addFile();
			
			if(option==2)
			opt.deleteFile();
			
			if(option==3)
			opt.searchFile();
			
			if(option==4)
				System.out.println("Returning to main menu..");

			break;
			    
			case 3:
				System.out.println("Exiting Program...");
				System.exit(0);
				
			break;
			    
			default :
				System.out.println("This is an invalid Menu Input! Please Select from the Options");
			             
			break;

			    }
			}
		}
	}
