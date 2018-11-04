package fr.cekogha.springblog;

import java.text.ParseException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBlogApplication {

	public static void main(String[] args) throws ParseException {
		
		SpringApplication.run(SpringBlogApplication.class, args);
		
//
//		PostRepository postRepository = ctx.getBean(PostRepository.class);
//		
//		postRepository.save(new Post("Title 1", "Body for Title 1...", new SimpleDateFormat("yyyy-MM-dd").parse("2018-11-04")));
//		
//		List<Post> posts = postRepository.findAll();
//
//		posts.forEach(
//				s -> System.out.println(
//						s.getId() + ", " + s.getTitle() + ", " + s.getBody() + ", " + s.getDateCreated()
//						));
	}
}
