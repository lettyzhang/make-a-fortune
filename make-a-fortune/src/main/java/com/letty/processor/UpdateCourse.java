package com.letty.processor;

import com.letty.object.Course;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UpdateCourse {
    ConnectDatabase connectDatabase = new ConnectDatabase();
    public List<Course> findAll(){
        List<Course> list = null;
        try {
            String sql = "select * from course";
            ResultSet resultSet = connectDatabase.connectMysql(sql);
            Course course = null;
            list = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");
                String updatedDate = resultSet.getString("updated_date");
                String submissionDate = resultSet.getString("submission_date");
                String learnStatus = resultSet.getString("learn_status");
                course = new Course();
                course.setId(id);
                course.setTitle(title);
                course.setDescription(description);
                course.setUpdatedDate(updatedDate);
                course.setSubmissionDate(submissionDate);
                course.setLearnStatus(learnStatus);
                list.add(course);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
