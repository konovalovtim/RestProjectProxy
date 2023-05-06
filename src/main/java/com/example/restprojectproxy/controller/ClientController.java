package com.example.restprojectproxy.controller;

import com.example.restprojectproxy.model.dto.ClientDTO;
import com.example.restprojectproxy.service.ClientService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "Clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @Operation(summary = "Сохранение пользователя", tags = {"Clients"})
    @PostMapping(value = "/clients")
    public ResponseEntity<?> createClient(@RequestBody ClientDTO clientDTO) {
        return clientService.post(clientDTO);
    }

    @Operation(summary = "Вывести всех клиентов", tags = {"Clients"})
    @GetMapping(value = "/clients")
    public ResponseEntity<List<ClientDTO>> showAllClients() {
        return clientService.get();
    }

    @Operation(summary = "Вывести клиента по id", tags = {"Clients"})
    @GetMapping(value = "/clients/{id}")
    public ResponseEntity<ClientDTO> getClientById(@PathVariable(name = "id") Integer id) {
        return clientService.getById(id);
    }

    @Operation(summary = "Вывести клиента по name", tags = {"Clients"})
    @GetMapping(value = "/clients/name/{name}")
    public ResponseEntity<ClientDTO> getClientByName(@PathVariable(name = "name") String name) {
        return clientService.findByName(name);
    }

    @Operation(summary = "Изменить данные клиентов", tags = {"Clients"})
    @PutMapping(value = "/clients/{id}")
    public ResponseEntity<?> сhangeClientData(@PathVariable(name = "id") Integer id, @RequestBody ClientDTO clientDTO) {
        return clientService.put(id, clientDTO);
    }

    @Operation(summary = "Удалить клиента по id", tags = {"Clients"})
    @DeleteMapping(value = "/clients/{id}")
    public ResponseEntity<?> deleteClientById(@PathVariable(name = "id") Integer id) {
        return clientService.delete(id);
    }
}