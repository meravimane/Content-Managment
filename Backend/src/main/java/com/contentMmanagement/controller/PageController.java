package com.contentMmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.contentMmanagement.model.Page;
import com.contentMmanagement.repository.PageRepository;

@RestController
public class PageController {
	@Autowired
	private PageRepository repo;
	
	@PostMapping("/addPage")
	public String savePage(@RequestBody Page page) {
		repo.save(page);
		return "page added successfully";
	}
	
	@GetMapping("/getAllPages")
	public List<Page> getPages(){
		return repo.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deletePage(@PathVariable String id) {
		repo.deleteById(id);
		return "delete successfully";
	}
}
