package serverPhotos.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import serverPhotos.entity.SportClub;
import serverPhotos.repository.SportClubRepository;


@RestController
public class SportClubController {

    @Autowired
    SportClubRepository sportClubRepository;

    @GetMapping(path = "/sport")
    public @ResponseBody SportClub getSportClub(){
        String test = "test";
        System.out.println(sportClubRepository.findByName(test));
        System.out.println("TEST: " + test);
        return sportClubRepository.findByName("test");
    }
}
