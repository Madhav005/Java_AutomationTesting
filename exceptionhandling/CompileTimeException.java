package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompileTimeException {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		
		String fileName = "C:\\test.txt";
		FileInputStream fis = new FileInputStream(fileName);

	}

}
