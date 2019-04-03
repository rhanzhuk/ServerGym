package serverPhotos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import serverPhotos.entity.Exercise;
import serverPhotos.service.ExerciseService;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ExerciseController {

    @Autowired
    ExerciseService exerciseService;

    @GetMapping("/exercise/{id}")
    public Exercise getExercise(@PathVariable (value = "id") Long id){
        return exerciseService.getExercise(id);
    }

    @GetMapping("/exercises")
    public List<Exercise> getAllExercise(){
        return exerciseService.getAll();
    }

    @PostMapping("/exercise")
    public Exercise saveExercise(@Valid @RequestBody Exercise exercise){
        return exerciseService.saveExercise(exercise);
    }

    @PutMapping("/exercise")
    public Exercise updateExercise(@PathVariable (value = "id") Long id, @Valid @RequestBody Exercise exercise){
        return exerciseService.updateExercise(id,exercise);
    }

    @DeleteMapping("/exercise")
    public Exercise deleteExercise(@Valid @RequestBody Exercise exercise){
        return exerciseService.deleteExercise(exercise);
    }

    @DeleteMapping("/exercise/{id}")
    public void deleteExerciseById(@PathVariable(value = "id") Long id){
        exerciseService.deleteExerciseById(id);
    }
}
