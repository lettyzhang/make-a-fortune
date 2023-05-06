package com.letty.ui;

import com.letty.object.Course;
import com.letty.processor.UpdateCourse;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class HomePage {
    UpdateCourse updateCourse = new UpdateCourse();
    public void generateHomePage() throws IOException {
        String path="../make-a-fortune/target/index.html";
        File index = new File(path);
        FileWriter fileWriter = new FileWriter(index);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("<!DOCTYPE html>\n<html>\n<head>\n<title>Courses</title>\n<body><h1>Programming courses</h1>\n");
        bufferedWriter.write("<table style=\"border_collapse: collapse;\">\n");
        List<Course> list = updateCourse.findAll();
        bufferedWriter.write("<th style=\"fond-weight:bold;border:1px solid #ddd;padding:7px 10px;\">");
        bufferedWriter.write("Id</th>");
        bufferedWriter.write("<th style=\"fond-weight:bold;border:1px solid #ddd;padding:7px 10px;\">");
        bufferedWriter.write("Title</th>");
        bufferedWriter.write("<th style=\"fond-weight:bold;border:1px solid #ddd;padding:7px 10px;\">");
        bufferedWriter.write("Description</th>");
        bufferedWriter.write("<th style=\"fond-weight:bold;border:1px solid #ddd;padding:7px 10px;\">");
        bufferedWriter.write("Updated date</th>");
        bufferedWriter.write("<th style=\"fond-weight:bold;border:1px solid #ddd;padding:7px 10px;\">");
        bufferedWriter.write("Submission date</th>");
        bufferedWriter.write("<th style=\"fond-weight:bold;border:1px solid #ddd;padding:7px 10px;\">");
        bufferedWriter.write("Learn status</th>");
        for (Course course : list) {
            bufferedWriter.write("<tr board = '1px'>\n");
            bufferedWriter.write("<td style=\"fond-weight:bold;border:1px solid #ddd;padding:7px 10px;\">");
            bufferedWriter.write(course.getId());
            bufferedWriter.write("</td>");
            bufferedWriter.write("<td style=\"fond-weight:bold;border:1px solid #ddd;padding:7px 10px;\">");
            bufferedWriter.write(course.getTitle());
            bufferedWriter.write("</td>");
            bufferedWriter.write("<td style=\"fond-weight:bold;border:1px solid #ddd;padding:7px 10px;\">");
            bufferedWriter.write(course.getDescription());
            bufferedWriter.write("</td>");
            bufferedWriter.write("<td style=\"fond-weight:bold;border:1px solid #ddd;padding:7px 10px;\">");
            bufferedWriter.write(course.getUpdatedDate());
            bufferedWriter.write("</td>");
            bufferedWriter.write("<td style=\"fond-weight:bold;border:1px solid #ddd;padding:7px 10px;\">");
            bufferedWriter.write(course.getSubmissionDate());
            bufferedWriter.write("</td>");
            bufferedWriter.write("<td style=\"fond-weight:bold;border:1px solid #ddd;padding:7px 10px;\">");
            bufferedWriter.write(course.getLearnStatus());
            bufferedWriter.write("</td>\n");
            bufferedWriter.write("</tr>\n");
        }
        bufferedWriter.write("</table>\n");
        bufferedWriter.write("</body>\n</html>");
        bufferedWriter.close();
    }
}
