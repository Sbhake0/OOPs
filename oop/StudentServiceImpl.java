
package com.scp.java.oop;
import static com.scp.java.oop.StudAppConstants.*;

public class StudentServiceImpl extends StudentService {

	Student [] students = null;
	int index = 0;
	int tempIndex = 0;
	public StudentServiceImpl(int no) {
		if (no<=0) {
			System.out.println(INVALID_STUDENT_CAPACITY);
			System.exit(0);
		}else {
			students = new Student[no];
			System.out.println("Student Array is initalized with no : " +students.length);
		}
	}

	@Override
	public String addStudent(Student student) {
		String returnValue = INVALID_STUDENT_ACTIVITY;
		
		if(student==null) {
			returnValue= INVALID_STUDENT;
		}else {
			if(student.getStudId()<=0) {
				returnValue=INVALID_STUDENT_ID;
			}else if(student.getStudAge()<3 || student.getStudAge()>25) {
				returnValue= NOT_A_STUDENT;
			}else if(getStudent(student.getStudId())!=null ) {
				returnValue= DUPLICATE_STUDENT;
			}else if(index>=students.length) {
				returnValue= STUDENT_CAPACITY;
			}else {
				students[index++]=student;
				tempIndex++;
				returnValue= STUDENT_SUCCESS;
			}
		}
		return returnValue;
	}

	@Override
	public Student getStudent(int studId) {

		if(studId>0) {
			for(Student st : students) {
				
				if(st!=null && st.getStudId()==studId) {
					return st;
				}
			}
		}
		return null;
	}

	@Override
	public Student[] getStudents() {
		Student []tempStudents = new Student[tempIndex]; //10 ---   5 		34-
		int count = 0;
		for(int i=0;i<students.length;i++) {
			if(students[i]!=null) {
				tempStudents[count++]=students[i];
			}
	}
		return tempStudents;
	}

	@Override
	public Student updateStudent(Student student) { //3
		boolean isStudentFound = false;
					//3
		if(student!=null) { // user ne sahi paass kiya hai ya nh
			if(student.getStudId()>0) { // id sahi hai ya nh
				for(int i=0;i<students.length;i++) { // get single student from students array 
					Student lStud = students[i]; // 1 2
					if(lStud!=null && lStud.getStudId()==student.getStudId()) { // jo empty

						isStudentFound=true;

						
						if(student.getStudAge()<3 || student.getStudAge()>25) {
							System.out.println(NOT_A_STUDENT);
						}else {
							lStud.setAddress(student.getAddress());
							lStud.setStudAge(student.getStudAge());
							lStud.setStudCollege(student.getStudCollege());
							lStud.setStudFees(student.getStudFees());
							lStud.setStudName(student.getStudName());
							System.out.println("Student updated Successfully...!");
							return getStudent(student.getStudId());// updated stud will be in return
						}
					}
				
			}
				if(!isStudentFound) {
					System.out.println("Student with given id not found...so cannot update...!");
				}
		}else {
			System.out.println(INVALID_STUDENT_ID);
		}
		}else {
			System.out.println(INVALID_STUDENT);
		}
		return null;
	}

	@Override
	public String deleteStudent(int studId) {
		String returnVal = "Problem in delete...try after sometime";
		if(studId<=0)
			returnVal= INVALID_STUDENT_ID;
		else if (getStudent(studId)==null) {
			returnVal="Student with given Id not found..so cannot delete";
		}else {
			for(int i=0;i<students.length;i++) {  
				Student lStud = students[i]; 
					if(lStud!=null && lStud.getStudId()==studId) {
						students[i]=null;
						tempIndex--;
						returnVal= "Student deleted Successfully....!";
					}
			}
		}	
		return returnVal;
	}
}



/***

	
	ProductService ---
		ProductInventory
			add/get/getall/update/delete
			catPrice
			allInventment
			
			
		Product -- no productnull or any invalid field
				id >=101 and <=1000
				nm
				cat
				qty -- >0
				price
				
		Customer
				id -- >0
				nm
				age -- >=21
				[] -- products -- 
						tech product -- purchase
				account -- balance
				
		Vendor
			regNo
			account
			products[] -- 
			
			
			name-- cat --- qty --- cust balance --
											tr success
												cust bal -
												ven bal +
												invetory prod -
												cust list -- prod +
												
												
												
		

*/