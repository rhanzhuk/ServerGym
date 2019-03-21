package serverPhotos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import serverPhotos.entity.Coach;
import serverPhotos.repository.CoachRepository;
import java.util.List;

@Service
public class CoachService {

    @Autowired
    CoachRepository coachRepository;

    public Coach getCoach(Long id){
        return coachRepository.getOne(id);
    }

    public List<Coach> getAll(){
        return coachRepository.findAll();
    }

    public Coach saveCoach(Coach coach){
        return coachRepository.save(coach);
    }

    public Coach updateCoach(Long id, Coach coach){

        Coach resultCoach = getCoach(id);

        if (resultCoach != null){
            resultCoach.setLogin(coach.getLogin());
            resultCoach.setPassword(coach.getPassword());
            resultCoach.setName(coach.getName());
            resultCoach.setClients(coach.getClients());
            resultCoach.setSportClub(coach.getSportClub());
            resultCoach.setTrainingList(coach.getTrainingList());

            return coachRepository.saveAndFlush(resultCoach);
        }
        return null;
    }

    public Coach deleteCoach(Coach coach){
        coachRepository.delete(coach);
        return coach;
    }

    public void deleteCoachById(Long id){
        coachRepository.deleteById(id);
    }
}
