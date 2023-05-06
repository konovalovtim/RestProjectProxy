package com.example.restprojectproxy.service;

import com.example.restprojectproxy.client.ClientsClient;
import com.example.restprojectproxy.model.dto.ClientDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientsClient clientsClient;

    public ResponseEntity<?> post(ClientDTO clientDTO) {
        return clientsClient.createClient(clientDTO);
    }

    public ResponseEntity<List<ClientDTO>> get() {
        return clientsClient.showAllClients();
    }

    public ResponseEntity<ClientDTO> getById(int id) {
        return clientsClient.getClientById(id);
    }

    public ResponseEntity<ClientDTO> findByName(String name) {
        return clientsClient.getClientByName(name);
    }

    public ResponseEntity<?> put(int id, ClientDTO clientDTO) {
        return clientsClient.сhangeClientData(id, clientDTO);
    }

    public ResponseEntity<?> delete(int id) {
        return clientsClient.deleteClientById(id);
    }
}