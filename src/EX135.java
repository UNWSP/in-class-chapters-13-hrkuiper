import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.*;
import java.io.*;

import javax.swing.JOptionPane;

public class EX135 {
	public static void main(String[] args) {
		// creating variables 
		int ID;
		String firstName;
		String lastName;
		double balanceOwed;
		
		// user variables for int 
		String uID;
		String uBalanceOwed;
		
		// opening file 
		Path thingThatWontWork = Paths.get("c:\\Users/haydenkuiper\\helpMe");
		
		// now appending data to file
		OutPutStream outPut = new BufferedOutPutStream(Files.newOutPutStream(thingThatWontWork));
		BufferedWriter writer = new BufferedWriter(new OutPutStreamWriter(outPut));
		
		// asking user for input 
		uBalanceOwed = JOptionPane.showInputDialog("Please enter your ID Number");
		firstName = JOptionPane.showInputDialog("please enter your first name");
		lastName = JOptionPane.showInputDialog("please enter your last name");
		uBalanceOwed = JOptionPane.showInputDialog("please enter balance owed");
		
		writer.close();
	}

}
