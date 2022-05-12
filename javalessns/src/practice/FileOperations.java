package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileOperations {
	public static void main (String[] args) throws IOException  {
//		createNewFile();
//		renameFile();
//		appendDataToFile();
//		modifiedData();
//		readFile();
		//deleteFile();
		copyFile();
		//moveFile();
	}
	public static void createNewFile() throws IOException {
		File file=new File("D:\\Temp\\Create.txt");
		boolean create=file.createNewFile();
		if(create)
			System.out.println("File created");
		else
			System.out.println(" File exits");
	}
	public static void renameFile() {
		try
		{
		File fileName= new File("D:\\Temp\\Create.txt");
		File reName=new File("D:\\Temp\\Created.txt");
		if(fileName.renameTo(reName)) 
			System.out.println("file renamed");
		}
		catch(Exception err) {
			System.out.println("File not found");
	}}
	public static void appendDataToFile()
    {
		File file=new File("D:\\Temp\\Test.txt");
      Scanner scanner = new Scanner(System.in);
      System.out.println("\nEnter the data : ");  
      String text = scanner.nextLine();

        try {
            FileWriter filewrite = new FileWriter("D:\\Temp\\Test.txt", true);
            filewrite.append(text);
            filewrite.close();
            System.out.println("Data inserted(append) Successfully!!");
        }
        catch(IOException e) {
            System.out.println("Error occured!!");
        }finally{
        	scanner.close();
        }
        
    }
	
	public static void modifiedData() throws IOException
	    {
	         FileOutputStream file = new FileOutputStream("D:\\Temp\\Test.txt");
	         Scanner scanner = new Scanner(System.in);
	         String modify = scanner.nextLine();
	         byte[] b = modify.getBytes();
	         file.write(b);
	         file.close();
	         scanner.close();
	         System.out.println("Modification Complete");
	         
	         FileInputStream files = new FileInputStream("D:\\Temp\\Test.txt");
	         int i;
	         while((i=files.read())!=-1)
	         {
	         System.out.print((char)i);
	         }
	         files.close(); 
	    }
		
	
	public static void readFile() {
		try
		{
		File file=new File("D:\\Temp\\Test.txt");
		BufferedReader read=new BufferedReader(new FileReader(file));
		String reader;
		while((reader=read.readLine())!=null)
			System.out.println(reader);
		}catch(Exception err) {
			System.out.println("File not found");
		}
	}
	
	public static void deleteFile() {
		try
		{
		File file=new File("D:\\Temp\\Create.txt");
		boolean delete=file.delete();
		if(delete)
			System.out.println("Successfully deleted");
		}catch(Exception err) {
			System.out.println("File not found");
	}}
	
	public static void copyFile() throws IOException {
        
        try 
        {
            InputStream input=new FileInputStream("d:\\Temp\\Test.txt");
            OutputStream output=new FileOutputStream("d:\\Temp\\copy.txt ");
            int content=input.read();
            while(content != -1)
            {
                output.write(content);
                content=input.read();
            }
            output.flush();
        }
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
	public static void moveFile() throws IOException {
		try
		{
		Path movefile=Files.move(Paths.get("D:\\Temp\\Create.txt"),Paths.get("D:\\Temp\\Beast\\Create.txt"));
			if(movefile!=null)
				System.out.println("file moved successfully");
		}
		catch(Exception err){
			System.out.println("File not Found");
		}
	}
}
