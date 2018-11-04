package fr.cekogha.springblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.cekogha.springblog.entity.PostRepository;

@RestController
public class BlogController {

	@Autowired
	PostRepository postRepository;
	
	
	@GetMapping(value="/")
	public String index() {
		return "index";
	}
}
