package com.StudentsManagement.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentsManagement.entity.Student;
import com.StudentsManagement.service.StudentService;


@Service
public class ServiceImpl implements StudentService{
	
	@Autowired
	com.StudentsManagement.repository.Studentrepository Studentrepository;
	
	@Override
	public List<Student> getAllStudents(){
		List<Student> list = Studentrepository.findAll();
		 return list;
	}

}
