package fr.cekogha.springblog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cekogha.springblog.entities.Post;
import fr.cekogha.springblog.repositories.PostRepository;

@Service
public class PostService {

	@Autowired
	PostRepository postRepository;

	public List<Post> getAllPosts()
	{
		return postRepository.findAll();
	}
	
	public void insert(Post post)
	{
		postRepository.save(post);
	}
	
}
