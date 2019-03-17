package serverPhotos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import serverPhotos.entity.Client;
import serverPhotos.service.ClientService;

import javax.validation.Valid;

@RestController
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping(path = "/client/{id}")
    public Client getClient(@PathVariable(value = "id")Long id) {
        return clientService.getClient(id);
    }

    @PostMapping("/client")
    public Client save (@Valid @RequestBody Client client){
        return clientService.seveClient(client);
    }

    @PutMapping("/client/{id}")
    public Client updateClient(@PathVariable(value = "id") Long id, @Valid @RequestBody Client client){
        return clientService.updateClient(id, client);
    }

    @DeleteMapping("/client")
    public Client deleteClient(@Valid @RequestBody Client client){
        return clientService.deleteClient(client);
    }

    @DeleteMapping("/client/{id}")
    public void deleteClientById(@PathVariable(value = "id") Long id){
        clientService.deleteClientFromId(id);
    }

}
