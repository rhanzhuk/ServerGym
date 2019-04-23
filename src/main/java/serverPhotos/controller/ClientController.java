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
        return clientService.getClient(id);
    }


    @GetMapping(path = "/clients",headers = "application/json")
    public  List<Client> getAll(){
        return clientService.getAll();
    }


}
