package fr.cekogha.springblog.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cekogha.springblog.entities.Post;
import fr.cekogha.springblog.services.PostService;

@RestController
public class BlogController {

	@Autowired
	private PostService postService;
	
	
	@GetMapping(value="/")
	public String index() {
		return "index";
	}
	
	@GetMapping(value="/posts")
	public List<Post> posts() {
		return postService.getAllPosts();
	}

	@PostMapping(value="/post")
	public void publishPost(@RequestBody Post post) {
		if(post.getDateCreated() == null)
			post.setDateCreated(new Date());
		
		postService.insert(post);
	}
}
