package Lab2.prob2A;

public class Student {
private String name;
private GradeReport gradeReport;

	Student(){
		this.gradeReport = new GradeReport(this);
	}

}
