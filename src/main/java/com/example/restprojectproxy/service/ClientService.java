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

    public void createNewClient(ClientDTO clientDTO) {
        clientsClient.createClient(clientDTO);
    }

    public List<ClientDTO> displayAllClients() {
        return clientsClient.showAllClients();
    }

    public ClientDTO getOneClientById(int id) {
        return clientsClient.getClientById(id);
    }

    public ClientDTO getOneClientByName(String name) {
        return clientsClient.getClientByName(name);
    }

    public void сhangeClientDataById(int id, ClientDTO clientDTO) {
        clientsClient.сhangeClientData(id, clientDTO);
    }

    public void deleteOneClientById(int id) {
        clientsClient.deleteClientById(id);
    }
}