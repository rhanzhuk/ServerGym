package serverPhotos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import serverPhotos.entity.Coach;
import serverPhotos.service.CoachService;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CoachController {

    @Autowired
    CoachService coachService;

    @GetMapping("/coach/{id}")
    public Coach getCoach(@PathVariable(value = "id") Long id){
        return coachService.getCoach(id);
    }

    @PostMapping("/coach")
    public Coach saveCoach(@Valid @RequestBody Coach coach){
        return coachService.saveCoach(coach);
    }

    @GetMapping("/coaches")
    public List<Coach> getAllCoaches(){
        return coachService.getAll();
    }

    @PutMapping("/coach")
    public Coach updateCoach(@PathVariable(value = "id")Long id, @Valid @RequestBody Coach coach){
        return coachService.updateCoach(id,coach);
    }

    @DeleteMapping("/coach")
    public Coach deleteCoach(@Valid @RequestBody Coach coach){
        return coachService.deleteCoach(coach);
    }

    @DeleteMapping("/coach/{id}")
    public void deleteCoachById(@PathVariable(value = "id") Long id){
        coachService.deleteCoachById(id);
    }

}
