package serverPhotos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import serverPhotos.entity.Client;
import serverPhotos.service.ClientService;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping(path = "/client/{id}")
    public @ResponseBody Client getClient(@PathVariable(value = "id")Long id){
        Client client = clientService.getClient(id);
        System.out.println("THIS IS CLIENT ENTITY: " + client + "!!!!!!!!!!!!!!!!!!!!!!!!!");
        return client;
    }


    @GetMapping(path = "/clients")
    public  List<Client> getAll(){
        //TODO add one
        List<Client> clients = clientService.getAll();
        System.out.println("LENGHT OF LIST CLIENTS: " + clients.size() + "!!!!!!!!!!!!!!!!!!");
        return clients;
    }


}
