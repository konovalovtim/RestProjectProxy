package com.example.restprojectproxy.controller;

import com.example.restprojectproxy.model.dto.ClientDTO;
import com.example.restprojectproxy.service.ClientService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@Tag(name = "Clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @Operation(summary = "Сохранение пользователя", tags = {"Clients"})
    @PostMapping(value = "/clients")
    public void createClient(@RequestBody ClientDTO clientDTO) {
        clientService.createClient(clientDTO);
        log.info("client: " + clientDTO.toString() + " add");
    }

    @Operation(summary = "Вывести всех клиентов", tags = {"Clients"})
    @GetMapping(value = "/clients")
    public List<ClientDTO> showAllClients() {
        log.info("display all clients");
        return clientService.showAllClients();
    }

    @Operation(summary = "Вывести клиента по id", tags = {"Clients"})
    @GetMapping(value = "/clients/{id}")
    public ClientDTO getClientById(@PathVariable(name = "id") Integer id) {
        log.info("return from db client: " + clientService.getClientById(id).toString());
        return clientService.getClientById(id);
    }

    @Operation(summary = "Вывести клиента по name", tags = {"Clients"})
    @GetMapping(value = "/clients/name/{name}")
    public ClientDTO getClientByName(@PathVariable(name = "name") String name) {
        log.info("return from db client: " + clientService.getClientByName(name).toString());
        return clientService.getClientByName(name);
    }

    @Operation(summary = "Изменить данные клиентов", tags = {"Clients"})
    @PutMapping(value = "/clients/{id}")
    public void сhangeClientData(@PathVariable(name = "id") Integer id, @RequestBody ClientDTO clientDTO) {
        clientService.сhangeClientData(id, clientDTO);
        log.info("client data by id: " + id + " changed to: " + clientDTO.toString());
    }

    @Operation(summary = "Удалить клиента по id", tags = {"Clients"})
    @DeleteMapping(value = "/clients/{id}")
    public void deleteClientById(@PathVariable(name = "id") Integer id) {
        clientService.deleteClientById(id);
        log.info("remove client by id: " + id);
    }
}