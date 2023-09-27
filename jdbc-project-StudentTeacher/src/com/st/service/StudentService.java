package com.st.service;

import com.st.dao.StudentDao;
import com.st.dto.StudentDto;

public class StudentService {

	StudentDao studentDao = new StudentDao();

	public StudentDto saveStudent(StudentDto studentDto) {
		return studentDao.saveStudent(studentDto);
	}

	public boolean deleteStudent(int id) {
		return studentDao.deleteStudent(id);
	}
}
