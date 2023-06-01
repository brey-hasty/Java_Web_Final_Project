package org.skillgrowth.java_web_final_project.Respository;

import org.skillgrowth.java_web_final_project.model.VideoGames;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoGameRespository extends JpaRepository<VideoGames, String> {

}
