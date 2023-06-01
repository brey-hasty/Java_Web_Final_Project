package org.skillgrowth.java_web_final_project.service;

import org.skillgrowth.java_web_final_project.Respository.VideoGameRespository;
import org.skillgrowth.java_web_final_project.model.VideoGames;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoGamesService {

    private final VideoGameRespository videoGameRespository;

    public VideoGamesService(VideoGameRespository respository){
        videoGameRespository = respository;
    }

    public List<VideoGames> findAll(){
        return videoGameRespository.findAll();
    }

    public void save(VideoGames videogames){
        videoGameRespository.save(videogames);
    }

    public void put(VideoGames videogames){
        int id = videogames.getId();
        VideoGames foundVideGames = videoGameRespository.getReferenceById(String.valueOf(id));
        foundVideGames.setCost(videogames.getCost());
        foundVideGames.setName(videogames.getName());
        videoGameRespository.save(foundVideGames);
    }

    public void delete(int id){
        videoGameRespository.deleteById(String.valueOf(id));
    }
}
