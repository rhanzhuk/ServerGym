package serverPhotos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;
import serverPhotos.entity.Client;
import serverPhotos.repository.ClientRepository;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public Client getClient(Long id){
       return clientRepository.getOne(id);
    }


    public List<Client> getAll(){
        return clientRepository.findAll();
    }

}
