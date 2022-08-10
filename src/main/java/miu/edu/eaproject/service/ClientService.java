package miu.edu.eaproject.service;

import miu.edu.eaproject.domain.Client;
import miu.edu.eaproject.persistence.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> getAllApplications(){
        return clientRepository.findAll();
    }
}
