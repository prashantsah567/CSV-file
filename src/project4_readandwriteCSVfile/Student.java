package project4_readandwriteCSVfile;


//student class for input of data for students
public class Student {
	     
	    private String stdId, stdName, stdClassf, major;
	    private double credit, gpa, gradePoint, creditHour;
	   
	    public Student(String stdId, String stdName, String stdClassf, String major,
	            double credit, double gpa, double gradePoint, double creditHour) {
	        super();
	        this.stdId = stdId;
	        this.stdName = stdName;
	        this.stdClassf = stdClassf;
	        this.major = major;
	        this.credit = credit;
	        this.gpa = gpa;
	        this.gradePoint = gradePoint;
	        this.creditHour = creditHour;
	    }
	    
	    //using getter and setter to set the value of variables declared
	    public String getstdId() {
	        return stdId;
	    }	   
	    public void setId(String stdId) {
	        this.stdId = stdId;
	    }
	   
	    public String getstdName() {
	        return stdName;
	    }
	    public void setstdName(String stdName) {
	        this.stdName = stdName;
	    }

	    public String getstdClassf() {
	        return stdClassf;
	    }
	    public void setstdClassf(String stdClassf) {
	        this.stdClassf = stdClassf;
	    }

	    public String getmajor() {
	        return major;
	    }
	    public void setmajor(String major) {
	        this.major = major;
	    }
	    
	    public double getcredit() {
	        return credit;
	    }
	    public void setcredit(double credit) {
	        this.credit = credit;
	    }
	    
	    public double getgpa() {
	    	return gpa;
	    }
	    public void setgpa(double gpa) {
	    	this.gpa = gpa;
	    }
	    
	    public double getgradePoint() {
	    	return gradePoint;
	    }
	    public void setgradePoint(double gradePoint) {
	    	this.gradePoint = gradePoint;
	    }
	    
	    public double getcreditHour() {
	    	return creditHour;
	    }
	    public void setcreditHour(double creditHour) {
	    	this.creditHour = creditHour;
	    }
	     
	    @Override
	    public String toString() {
	        return "Student [id=" + stdId + ", Name=" + stdName
	                + ", classification=" + stdClassf + ", major=" + major + ", credit="
	                + credit +", GPA="+ gpa +", Grade_Point="+ gradePoint +", Credit_Hour="+ creditHour + "]";
	    }
	
}
