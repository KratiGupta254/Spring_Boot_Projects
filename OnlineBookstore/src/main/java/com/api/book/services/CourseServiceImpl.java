package com.api.book.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.api.book.entity.Course;


@Service
public class CourseServiceImpl implements CourseService {
	
	List<Course> list;
	
	public CourseServiceImpl() {
		
		list=new ArrayList<>();
		list.add(new Course(1, "AWS", "this is AWS Course"));
		list.add(new Course(2, "Devops", "this is Devops Course"));
		
	}

	@Override
	public List<Course> getCourses() {
		return list;
	}

}
