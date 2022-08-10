package miu.edu.eaproject.service;

import miu.edu.eaproject.domain.Client;
import miu.edu.eaproject.exceptions.NotFoundException;
import miu.edu.eaproject.persistence.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> getAllClients(){
        return clientRepository.findAll();
    }
    public Client getClientById(Integer id){
        Optional<Client> optionalClient = clientRepository.findById(id);
        if(optionalClient.isPresent()){
            return optionalClient.get();
        }
        else{
            throw new NotFoundException("Client with the passed id not Found!!");
        }
    }
    public Client addClient(Client client){
        clientRepository.save(client);
        return client;
    }
    public Client updateClient(Integer id, Client client){
        Optional<Client> optionalStudent =  clientRepository.findById(id);
        if(optionalStudent.isPresent()){
            Client st = optionalStudent.get();
            st.setMission(client.getMission());
            st.setReason(client.getReason());
            st.setWebsite(client.getWebsite());
            clientRepository.save(st);
            return st;
        }
        else{
            throw new NotFoundException("Client with the passed id Not Found");
        }
    }
    public Integer deleteClient(Integer id){
        Optional<Client> optionalClient = clientRepository.findById(id);
        if(optionalClient.isPresent()){
            clientRepository.deleteById(id);
            return id;
        }
        else{
            throw new NotFoundException("Client with the passed id not Found!!");
        }
    }
}
