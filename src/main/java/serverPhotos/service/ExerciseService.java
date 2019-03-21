package serverPhotos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import serverPhotos.entity.Exercise;
import serverPhotos.repository.ExerciseRepository;

import java.util.List;

@Service
public class ExerciseService {

    @Autowired
    ExerciseRepository exerciseRepository;

    public Exercise getExercise(Long id){
        return exerciseRepository.getOne(id);
    }

    public List<Exercise> getAll(){
        return exerciseRepository.findAll();
    }

    public Exercise saveExercise(Exercise exercise){
        return exerciseRepository.save(exercise);
    }

    public Exercise updateExercise(Long id, Exercise exercise){
        Exercise resultExercise = getExercise(id);
        if (resultExercise != null){
            resultExercise.setName(exercise.getName());
            resultExercise.setDescription(exercise.getDescription());
            resultExercise.setIcon(exercise.getIcon());
            resultExercise.setSeries(exercise.getSeries());
            resultExercise.setYoutubeLink(exercise.getYoutubeLink());

            return exerciseRepository.saveAndFlush(exercise);
        }
        return null;
    }

    public Exercise deleteExercise(Exercise exercise){
        exerciseRepository.delete(exercise);
        return exercise;
    }

    public void deleteExerciseById(Long id){
        exerciseRepository.deleteById(id);
    }
}
