package dao;

import java.sql.*;

import model.Student;
import db.DBConnection; 

public class StudentDAO {

    public void addStudent(Student s) {

        try {

            Connection conn =
                DBConnection.getConnection();

            String sql =
                "INSERT INTO student(name,age) VALUES(?,?)";

            PreparedStatement ps =
                conn.prepareStatement(sql);

            ps.setString(1, s.getName());
            ps.setInt(2, s.getAge());

            ps.executeUpdate();

            System.out.println("Insert Success");

            conn.close();

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
	
	public void showStudent() {

		try {

			Connection conn =
				DBConnection.getConnection();

			String sql =
				"SELECT * FROM student";

			Statement st =
				conn.createStatement();

			ResultSet rs =
				st.executeQuery(sql);

			while(rs.next()) {

				System.out.println(
					rs.getInt("id")
					+ " "
					+ rs.getString("name")
					+ " "
					+ rs.getInt("age")
				);
			}

			conn.close();

		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void updateStudent(int id,int age) {

		try {

			Connection conn =
				DBConnection.getConnection();

			String sql =
				"UPDATE student SET age=? WHERE id=?";

			PreparedStatement ps =
				conn.prepareStatement(sql);

			ps.setInt(1, age);
			ps.setInt(2, id);

			ps.executeUpdate();

			System.out.println("Update Success");

			conn.close();

		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void deleteStudent(int id) {

        try {

            Connection conn =
                DBConnection.getConnection();

            String sql =
                "DELETE FROM student WHERE id=?";

            PreparedStatement ps =
                conn.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Delete Success");

            conn.close();

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
} 