package com.elearning.coursemanagement.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="course")
public class Course {
	
	// Faculty Seq - 2020 , 1
	// Admin-seq - 1010  -1
	// Course-seq - 3030 -1
	// Student Seq - 4040 -1
	
// courese id , coursename, fees, startdate,enddate, duration
	
	@SequenceGenerator(name = "elCourseSeq",initialValue = 3030, allocationSize = 1, sequenceName = "EL_COURSE_SEQ")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "elCourseSeq")
	private int  courseid;
	@Column
	private String courseName;
	@Column
	private double fees;
	@Column
	private Date startDate;
	@Column
	private Date endDate;
	@Column
	private int duration;

	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", courseName=" + courseName + ", fees=" + fees + ", startDate="
				+ startDate + ", endDate=" + endDate + ", duration=" + duration + "]";
	}
	
	
	// getter and setters
	
	
	// toStroing
}
