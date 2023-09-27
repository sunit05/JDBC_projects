package com.st.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.st.configuration.HelperClass;
import com.st.dto.StudentDto;

public class StudentDao {

	HelperClass helperClass = new HelperClass();
	Connection connection = null;
	int i = 0;

	// to delete the student data
	public boolean deleteStudent(int id) {
		connection = helperClass.getConnection();
		String sql = ("DELETE FROM student WHERE id=?");

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
	public StudentDto saveStudent(StudentDto student) {

		connection = helperClass.getConnection();
		String sql = "INSERT INTO student VALUES(?,?,?)";

		try {
			PreparedStatement prepareStatement = connection.prepareStatement(sql);

			// passed the value to delimeters/placeholders --> ?

			prepareStatement.setInt(1, student.getId());
			prepareStatement.setString(2, student.getName());
			prepareStatement.setString(3, student.getEmail());

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

		return student;

	}
}
