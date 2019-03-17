package serverPhotos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import serverPhotos.entity.Client;
import serverPhotos.repository.ClientRepository;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public Client getClient (Long id){
        return clientRepository.getOne(id);
    }

    public List<Client> clients(){
        return clientRepository.findAll();
    }

    public Client seveClient(Client client){
        return clientRepository.save(client);
    }

    public Client updateClient(Long id, Client clientDetails){

        Client client = getClient(id);

        if(client != null){
            client.setName(clientDetails.getName());
            client.setAge(clientDetails.getAge());
            client.setLevel(clientDetails.getLevel());
            client.setCoach(clientDetails.getCoach());
            client.setEmail(clientDetails.getEmail());
            client.setLogin(clientDetails.getLogin());
            client.setPassword(clientDetails.getPassword());
            client.setTrainingList(clientDetails.getTrainingList());
        }else {
            System.out.println("Not found");
        }

        return clientRepository.saveAndFlush(client);
    }


    public Client deleteClient(Client client){
        clientRepository.delete(client);
        return client;
    }

    public void deleteClientFromId(Long id){
        clientRepository.deleteById(id);
    }

}
