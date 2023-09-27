package com.st.service;

import com.st.dao.TeacherDao;
import com.st.dto.TeacherDto;

public class TeacherService {

	TeacherDao teacherDao = new TeacherDao();

	public TeacherDto saveTeacher(TeacherDto teacherDto) {
		return teacherDao.saveTeacher(teacherDto);
	}

	public boolean deleteTeacher(int id) {
		return teacherDao.deleteTeacher(id);
	}
}
