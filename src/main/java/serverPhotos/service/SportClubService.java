package serverPhotos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import serverPhotos.entity.SportClub;
import serverPhotos.repository.SportClubRepository;

import java.util.List;

@Service
public class SportClubService {

    @Autowired
    SportClubRepository sportClubRepository;

    public SportClub getSportClub(Long id){
        return sportClubRepository.getOne(id);
    }

    public List<SportClub> getAll(){
        return sportClubRepository.findAll();
    }

    public SportClub saveSportClub(SportClub sportClub){
        return sportClubRepository.save(sportClub);
    }

    public SportClub updateSportClub(SportClub sportClub){
        return sportClubRepository.saveAndFlush(sportClub);
    }

    public SportClub deleteSportClub(SportClub sportClub){
        sportClubRepository.delete(sportClub);
        return sportClub;
    }

    public void deleteSportClubById(Long id){
        sportClubRepository.deleteById(id);
    }
}
