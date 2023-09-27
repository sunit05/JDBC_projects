package com.st.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.st.configuration.HelperClassTeacher;
import com.st.dto.TeacherDto;

public class TeacherDao {

	HelperClassTeacher helperClassTeacher = new HelperClassTeacher();
	Connection connection = null;
	int i = 0;

	// to delete the teacher data
	public boolean deleteTeacher(int id) {
		connection = helperClassTeacher.getConnection();
		String sql = ("DELETE FROM teacher WHERE id=?");

		try {
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setInt(1, id);
			i = prepareStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (i > 0) {
			return true;
		} else {
			return false;
		}

	}

	// to save student data
	public TeacherDto saveTeacher(TeacherDto teacher) {

		connection = helperClassTeacher.getConnection();
		String sql = "INSERT INTO teacher VALUES(?,?,?)";

		try {
			PreparedStatement prepareStatement = connection.prepareStatement(sql);

			// passed the value to delimeters/placeholders --> ?

			prepareStatement.setInt(1, teacher.getId());
			prepareStatement.setString(2, teacher.getName());
			prepareStatement.setString(3, teacher.getEmail());

			// execute
			prepareStatement.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return teacher;

	}
	
	
	
}
