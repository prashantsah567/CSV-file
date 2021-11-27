package project4_readandwriteCSVfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvFileReader {
	
	private static double averageGpa=0;

	//Delimiter used in CSV file
    private static final String COMMA_DELIMITER = ",";
     
    //Student attributes index
    private static final int STUDENT_ID = 0;
    private static final int STUDENT_NAME = 1;
    private static final int STUDENT_CLASSF = 2;
    private static final int STUDENT_MAJOR = 3; 
    private static final int STUDENT_CREDIT = 4;
    private static final int STUDENT_GPA = 5;
    private static final int STUDENT_GRADE_POINT = 6;
    private static final int STUDENT_CREDIT_HOUR = 7;

     
    public static void readCsvFile(String fileName) {
 
        BufferedReader fileReader = null;
      
        try {
             
            //Create a new list of student to be filled by CSV file data 
            List<Student> students = new ArrayList();
             
            String line = "";
             
            //Create the file reader
            fileReader = new BufferedReader(new FileReader(fileName));
             
            //Read the CSV file header to skip it
            fileReader.readLine();
             
            //Read the file line by line starting from the second line
            while ((line = fileReader.readLine()) != null) {
                //Get all tokens available in line
                String[] tokens = line.split(COMMA_DELIMITER);
                if (tokens.length > 0) {
                    //Create a new student object and fill his  data
                    Student student = new Student(tokens[STUDENT_ID], tokens[STUDENT_NAME], tokens[STUDENT_CLASSF], tokens[STUDENT_MAJOR],
                    		Double.parseDouble(tokens[STUDENT_CREDIT]), Double.parseDouble(tokens[STUDENT_GPA]), Double.parseDouble(tokens[STUDENT_GRADE_POINT]),
                    		Double.parseDouble(tokens[STUDENT_CREDIT_HOUR]));
                    students.add(student);
                    
                    //calculating the average GPA of whole class
                    averageGpa += Double.parseDouble(tokens[STUDENT_GPA]);
                }
            }
             
            //Print the new student list
            for (Student student : students) {
                System.out.println(student.toString());
            }
            
            //print the average GPA
            System.out.print("\nThe average GPA of the whole class is: ");
            System.out.format("%.2f",(averageGpa/6));
        } 
        catch (Exception e) {
            System.out.println("Error in CsvFileReader !!!");
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Error while closing fileReader !!!");
                e.printStackTrace();
            }
        }
    }
}
