package fr.cekogha.springblog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.cekogha.springblog.entities.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{

}
