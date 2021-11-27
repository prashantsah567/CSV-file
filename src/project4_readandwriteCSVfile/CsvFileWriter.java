package project4_readandwriteCSVfile;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvFileWriter {

		//Delimiter used in CSV file
	 	private static final String COMMA_DELIMITER = ",";
	 	private static final String NEW_LINE_SEPARATOR = "\n";
	     
	    //CSV file header
	    private static final String FILE_HEADER = "id,Name,classification,major,credit,gpa,grade_point,credit_hour";
	 
	    public static void writeCsvFile(String fileName) {
	         
	        //Create new students objects
	        Student student1 = new Student("SOC0001", "Prash", "sophomore", "CS", 50, 3.94, 80, 22 );
	        Student student2 = new Student("SOC0002", "Bikru", "Junior", "AC", 23, 2.5, 60, 24);
	        Student student3 = new Student("SOC0003", "Matt", "Senior", "MATH", 100, 3.5, 120, 35);
	        Student student4 = new Student("SOC0004", "Rajan", "freshman", "CS", 10, 4.0, 40, 10);
	        Student student5 = new Student("SOC0005", "Leo", "junior", "CS", 22, 3.8, 50, 11);
	        Student student6 = new Student("SOC0006", "Basant", "senior", "CS", 120, 3.0, 150, 50);
	         
	        //Create a new list of student objects
	        List<Student> students = new ArrayList();
	        students.add(student1);
	        students.add(student2);
	        students.add(student3);
	        students.add(student4);
	        students.add(student5);
	        students.add(student6);
	         
	        FileWriter fileWriter = null;
	                 
	        try {
	            fileWriter = new FileWriter(fileName);
	 
	            //Write the CSV file header
	            fileWriter.append(FILE_HEADER.toString());
	             
	            //Add a new line separator after the header
	            fileWriter.append(NEW_LINE_SEPARATOR);
	             
	            //Write a new student object list to the CSV file
	            for (Student student: students) {
	                fileWriter.append(student.getstdId());
	                fileWriter.append(COMMA_DELIMITER);
	                fileWriter.append(student.getstdName());
	                fileWriter.append(COMMA_DELIMITER);
	                fileWriter.append(student.getstdClassf());
	                fileWriter.append(COMMA_DELIMITER);
	                fileWriter.append(student.getmajor());
	                fileWriter.append(COMMA_DELIMITER);
	                fileWriter.append(String.valueOf(student.getcredit()));
	                fileWriter.append(COMMA_DELIMITER);
	                fileWriter.append(String.valueOf(student.getgpa()));
	                fileWriter.append(COMMA_DELIMITER);
	                fileWriter.append(String.valueOf(student.getgradePoint()));
	                fileWriter.append(COMMA_DELIMITER);
	                fileWriter.append(String.valueOf(student.getcreditHour()));
	                fileWriter.append(NEW_LINE_SEPARATOR);
	            }
	           
	             
	            System.out.println("CSV file was created successfully !!!");
	             
	        } catch (Exception e) {
	            System.out.println("Error in CsvFileWriter !!!");
	            e.printStackTrace();
	        } finally {
	             
	            try {
	                fileWriter.flush();
	                fileWriter.close();
	            } catch (IOException e) {
	                System.out.println("Error while flushing/closing fileWriter !!!");
	                e.printStackTrace();
	            }
	             
	        }
	    }
}
