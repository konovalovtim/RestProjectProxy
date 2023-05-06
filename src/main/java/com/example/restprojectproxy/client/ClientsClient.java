package com.example.restprojectproxy.client;

import com.example.restprojectproxy.model.dto.ClientDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "clients", url = "localhost:8080")
public interface ClientsClient {

    @PostMapping(value = "/clients")
    ResponseEntity<?> createClient(@RequestBody ClientDTO clientDTO);

    @GetMapping(value = "/clients")
    ResponseEntity<List<ClientDTO>> showAllClients();

    @GetMapping(value = "/clients/{id}")
    ResponseEntity<ClientDTO> getClientById(@PathVariable(name = "id") Integer id);

    @GetMapping(value = "/clients/name/{name}")
    ResponseEntity<ClientDTO> getClientByName(@PathVariable(name = "name") String name);

    @PutMapping(value = "/clients/{id}")
    ResponseEntity<?> сhangeClientData(@PathVariable(name = "id") Integer id, @RequestBody ClientDTO clientDTO);

    @DeleteMapping(value = "/clients/{id}")
    ResponseEntity<?> deleteClientById(@PathVariable(name = "id") Integer id);
}
