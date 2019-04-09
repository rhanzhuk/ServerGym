package serverPhotos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import serverPhotos.entity.Training;
import serverPhotos.service.TrainingService;

import javax.validation.Valid;
import java.util.List;

@RestController
public class TrainingController {

    @Autowired
    TrainingService trainingService;

    @GetMapping("/training/{id}")
    public Training getTraining(@PathVariable(value = "id") Long id){
        return trainingService.getTraining(id);
    }

    @GetMapping("/trainings")
    public List<Training> getAllTrining(){
        return trainingService.getAll();
    }

    @PostMapping("/training")
    public Training saveTraining(@Valid @RequestBody Training training){
        return trainingService.saveTraining(training);
    }

    @PutMapping("/training/{id}")
    public Training updateTraining(@PathVariable(value = "id") Long id, @Valid @RequestBody Training training){
        return trainingService.updateTraining(id, training);
    }

    @DeleteMapping("/training")
    public Training deleteTraining(@Valid @RequestBody Training training){
        return trainingService.deleteTraining(training);
    }

    @DeleteMapping("/training/{id}")
    public void deleteTrainingById(@PathVariable(value = "id") Long id){
        trainingService.deletTrainingById(id);
    }
}
