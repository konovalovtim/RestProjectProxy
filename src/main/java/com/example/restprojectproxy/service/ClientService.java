package com.example.restprojectproxy.service;

import com.example.restprojectproxy.client.ClientsClient;
import com.example.restprojectproxy.model.dto.ClientDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientsClient clientsClient;

    public void createClient(ClientDTO clientDTO) {
        clientsClient.createClient(clientDTO);
    }

    public List<ClientDTO> showAllClients() {
        return clientsClient.showAllClients();
    }

    public ClientDTO getClientById(int id) {
        return clientsClient.getClientById(id);
    }

    public ClientDTO getClientByName(String name) {
        return clientsClient.getClientByName(name);
    }

    public void сhangeClientData(int id, ClientDTO clientDTO) {
        clientsClient.сhangeClientData(id, clientDTO);
    }

    public void deleteClientById(int id) {
        clientsClient.deleteClientById(id);
    }
}