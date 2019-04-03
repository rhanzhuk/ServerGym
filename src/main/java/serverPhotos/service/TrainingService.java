package serverPhotos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import serverPhotos.entity.Training;
import serverPhotos.repository.TrainingRepository;

import java.util.List;

@Service
public class TrainingService {

    @Autowired
    TrainingRepository trainingRepository;

    public Training getTraining(Long id){
        return trainingRepository.getOne(id);
    }

    public List<Training> getAll(){
        return trainingRepository.findAll();
    }

    public Training saveTraining(Training training){
        return trainingRepository.save(training);
    }

    public Training updateTraining(Long id, Training training){
        Training resultTraining = getTraining(id);
        if(resultTraining != null){
            resultTraining.setName(training.getName());
            resultTraining.setClient(training.getClient());
            resultTraining.setCoach(training.getCoach());
            resultTraining.setSeriesList(training.getSeriesList());
            resultTraining.setTrainingDate(training.getTrainingDate());

            return trainingRepository.saveAndFlush(resultTraining);
        }

        return null;
    }

    public Training deleteTraining(Training training){
        trainingRepository.delete(training);
        return training;
    }

    public void deletTrainingById(Long id){
        trainingRepository.deleteById(id);
    }
}


/*
 * 1 Получение одного по ид
 * 2 Получение всех
 * 3 Сохранить
 * 4 Изменить
 * 5 Удалить сущность
 * 6 Удалить по ид
 * */