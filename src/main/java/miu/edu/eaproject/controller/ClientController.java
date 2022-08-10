package miu.edu.eaproject.controller;

import miu.edu.eaproject.domain.Client;
import miu.edu.eaproject.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping(path = "/clients")
    public List<Client> getAllClients(){
        return clientService.getAllClients();
    }
    @GetMapping(path = "/clients/{id}")
    public Client getClient(@PathVariable Integer id){
        return clientService.getClientById(id);
    }
    @PostMapping(path = "/clients")
    public Client postClient(@RequestBody Client client){
        return clientService.addClient(client);
    }
    @PutMapping(path = "/clients/{id}")
    public Client updateClient(@PathVariable Integer id, @RequestBody Client client){
        return clientService.updateClient(id,client);
    }
    @DeleteMapping(path = "/client/{id}")
    public Integer deleteClient(@PathVariable Integer id){
        return clientService.deleteClient(id);
    }
}
