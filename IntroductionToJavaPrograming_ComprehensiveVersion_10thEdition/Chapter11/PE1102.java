import java.util.*;

class PE1102 {
	public static void main(String[] args) {
		Person personNoArg = new Person();
		System.out.println(personNoArg.toString());

		Person personWithArg = new Person("Mike", "China", "123456789", "abc@email.com");
		System.out.println(personWithArg.toString());

		Student studentNoArg = new Student();
		studentNoArg.setName("studentNoArg");
		studentNoArg.setAddress("studentNoArg address");
		studentNoArg.setPhoneno("studentNoArg pno");
		studentNoArg.setEmail("studentNoArg@email.com");
		System.out.println(studentNoArg.toString());

		Employee employeeNoArg = new Employee();
		employeeNoArg.setName("employeeNoArg name");
		employeeNoArg.setAddress("employeeNoArg address");
		employeeNoArg.setPhoneno("employeeNoArg pno");
		employeeNoArg.setEmail("employeeNoArg@eamil.com");
		employeeNoArg.setOffice("OFFICE111");
		employeeNoArg.setSalary(9999);
		employeeNoArg.setDatehired(new MyDate(1996, 1, 1));
		System.out.println(employeeNoArg.toString());

		Employee employeeWithArg = new Employee("OFFICE011", 10000, new MyDate());
		employeeWithArg.setName("employeeWithArg name");
		employeeWithArg.setAddress("employeeWithArg address");
		employeeWithArg.setPhoneno("employeeWithArg pno");
		employeeWithArg.setEmail("employeeWithArg@eamil.com");
		employeeWithArg.setOffice("OFFICE999");
		employeeWithArg.setSalary(66666);
		employeeWithArg.setDatehired(new MyDate(2015, 1, 1));
		System.out.println(employeeWithArg.toString());

		Faculty facultyNoArg = new Faculty();
		facultyNoArg.setName("facultyNoArg name");
		facultyNoArg.setAddress("facultyNoArg address");
		facultyNoArg.setPhoneno("facultyNoArg pno");
		facultyNoArg.setEmail("facultyNoArg@eamil.com");
		facultyNoArg.setOffice("OFFICE222");
		facultyNoArg.setSalary(1000);
		facultyNoArg.setDatehired(new MyDate(1999, 1, 1));
		facultyNoArg.setOfficehours("8:00 - 21:00");
		facultyNoArg.setRank("C");
		System.out.println(facultyNoArg.toString());

		Faculty facultyWithArg = new Faculty("9:00 - 15:00", "S");
		facultyWithArg.setName("facultyWithArg name");
		facultyWithArg.setAddress("facultyWithArg address");
		facultyWithArg.setPhoneno("facultyWithArg pno");
		facultyWithArg.setEmail("facultyWithArg@eamil.com");
		facultyWithArg.setOffice("OFFICE999");
		facultyWithArg.setSalary(100000);
		facultyWithArg.setDatehired(new MyDate(2014, 11, 1));
		System.out.println(facultyWithArg.toString());

		Staff staffNoArg = new Staff();
		staffNoArg.setName("staffNoArg name");
		staffNoArg.setAddress("staffNoArg address");
		staffNoArg.setPhoneno("staffNoArg pno");
		staffNoArg.setEmail("staffNoArg@eamil.com");
		staffNoArg.setOffice("OFFICE444");
		staffNoArg.setSalary(3000);
		staffNoArg.setDatehired(new MyDate(2099, 1, 1));
		System.out.println(staffNoArg.toString());

		Staff staffWithArg = new Staff("Manager");
		staffWithArg.setName("staffWithArg name");
		staffWithArg.setAddress("staffWithArg address");
		staffWithArg.setPhoneno("staffWithArg pno");
		staffWithArg.setEmail("staffWithArg@eamil.com");
		staffWithArg.setOffice("OFFICE333");
		staffWithArg.setSalary(30000);
		staffWithArg.setDatehired(new MyDate(2009, 12, 1));
		System.out.println(staffWithArg.toString());
	}
}

class Person {
	private String name;
	private String address;
	private String phoneno;
	private String email;

	Person() {
		name = "personName";
		address = "personAddress";
		phoneno = "personPhoneno";
		email = "personEmail";
	}
	Person(String newName) {
		name = newName;
	}
	Person(String newName, String newAddress, String newPhoneno, String newEmail) {
		name = newName;
		address = newAddress;
		phoneno = newPhoneno;
		email = newEmail;
	}

	public void setName(String newName) {
		name = newName;
	}
	public void setAddress(String newAddress) {
		address = newAddress;
	}
	public void setPhoneno(String newPhoneno) {
		phoneno = newPhoneno;
	}
	public void setEmail(String newEmail) {
		email = newEmail;
	}

	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public String getEmail() {
		return email;
	}

	public String toString() {
		String output = ("This person's name is : " + name + "\n" +
						 "Address: " + address + "\n" +
						 "Phone number: " + phoneno + "\n" +
						 "Email: " + email + "\n");

		return output;
	}
}

class Student extends Person {
	private final static String classStatus = "Freshman";

	public String getClassStatus() {
		return classStatus;
	}

	public String toString() {
		return super.toString() + "Class status: " + classStatus + "\n";
	}
}

class Employee extends Person {
	private String office;
	private int salary;
	private MyDate datehired;

	Employee() {
		office = "OFFICE001";
		salary = 5000;
		datehired = new MyDate();
	}
	Employee(String newOffice, int newSalary, MyDate newDatehired) {
		office = newOffice;
		salary = newSalary;
		datehired = newDatehired;
	}

	public void setOffice(String newOffice) {
		office = newOffice;
	}
	public void setSalary(int newSalary) {
		salary = newSalary;
	}
	public void setDatehired(MyDate newDatehired) {
		datehired = newDatehired;
	}

	public String getOffice() {
		return office;
	}
	public int getSalary() {
		return salary;
	}
	public MyDate getDatehired() {
		return datehired;
	}

	public String toString() {
		return super.toString() + "Office: " + office + "\n" +
				"Salary: " + salary + "\n" + "Datehired: " + datehired.toString() + "\n";
	}
}

class Faculty extends Employee{
	private String officehours;
	private String rank;

	Faculty() {
		officehours = "8:00 - 18:00";
		rank = "A";
	}
	Faculty(String newOfficehours, String newRank) {
		officehours = newOfficehours;
		rank = newRank;
	}

	public void setOfficehours(String newOfficehours) {
		officehours = newOfficehours;
	}
	public void setRank(String newRank) {
		rank = newRank;
	}

	public String getOfficehours() {
		return officehours;
	}
	public String getRank() {
		return rank;
	}

	public String toString() {
		return super.toString() + "Office hours: " + officehours + "\n" +
				"Rank: " + rank + "\n";
	}
}

class Staff extends Employee {
	private String title;

	Staff() {
		title = "staff";
	}
	Staff(String newTitle) {
		title = newTitle;
	}

	public void setTitle(String newTitle) {
		title = newTitle;
	}

	public String getTitle() {
		return title;
	}

	public String toString() {
		return super.toString() + "Title: " + title + "\n";
	}
}

class MyDate {
	private int year;
	private int month;
	private int day;

	MyDate() {
		GregorianCalendar now = new GregorianCalendar();
		year = now.get(GregorianCalendar.YEAR);
		month = now.get(GregorianCalendar.MONTH);
		day = now.get(GregorianCalendar.DAY_OF_MONTH);
	}
	MyDate(long elapsedTime) {
		GregorianCalendar now = new GregorianCalendar();
		now.setTimeInMillis(elapsedTime);
		year = now.get(GregorianCalendar.YEAR);
		month = now.get(GregorianCalendar.MONTH);
		day = now.get(GregorianCalendar.DAY_OF_MONTH);
	}
	MyDate(int nYear, int nMonth, int nDay) {
		year = nYear;
		month = nMonth;
		day = nDay;
	}
	
	public int getYear() {
		return this.year;
	}
	public int getMonth() {
		return this.month;
	}
	public int getDay() {
		return this.day;
	}

	public String toString() {
		String strMonth = "";
		switch(this.month - 1) {
			case 0: 	strMonth = "January"; 	break;
			case 1: 	strMonth = "Febrary"; 	break;
			case 2: 	strMonth = "March"; 	break;
			case 3: 	strMonth = "April"; 	break;
			case 4: 	strMonth = "May"; 		break;
			case 5: 	strMonth = "June"; 		break;
			case 6: 	strMonth = "July"; 		break;
			case 7: 	strMonth = "August"; 	break;
			case 8: 	strMonth = "September"; break;
			case 9: 	strMonth = "October"; 	break;
			case 10: 	strMonth = "November"; 	break;
			case 11: 	strMonth = "December"; 	break;
		}
		return (strMonth + " " + this.getDay() + " " + this.getYear());
	}
}