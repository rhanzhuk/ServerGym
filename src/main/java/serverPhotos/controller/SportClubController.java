package serverPhotos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import serverPhotos.entity.SportClub;
import serverPhotos.service.SportClubService;

import javax.validation.Valid;
import java.util.List;

@RestController
public class SportClubController {

    @Autowired
    SportClubService sportClubService;

    @GetMapping("/sportClub/{id}")
    public SportClub getSportClub(@PathVariable(value = "id") Long id){
        return sportClubService.getSportClub(id);
    }

    @GetMapping("/sportClubs")
    public List<SportClub> getAllSportClubs(){
        return sportClubService.getAll();
    }

    @PostMapping("/sportClub")
    public SportClub saveSportClub(@Valid @RequestBody SportClub sportClub){
        return sportClubService.saveSportClub(sportClub);
    }

    @PutMapping("/sportClubs/{id}")
    public SportClub updateSportClub(@PathVariable(value = "id")Long id, @Valid @RequestBody SportClub sportClub){
        return sportClubService.updateSportClub(id, sportClub);
    }

    @DeleteMapping("/sportClub")
    public SportClub deleteSportClub(@Valid @RequestBody SportClub sportClub){
        return sportClubService.deleteSportClub(sportClub);
    }

    @DeleteMapping("/sportClub/{id}")
    public void deleteSportClubById(@PathVariable(value = "id") Long id){
        sportClubService.deleteSportClubById(id);
    }
}
