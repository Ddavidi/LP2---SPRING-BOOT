/*
 * DAVID NUNES RIBEIRO
 * INF3 - 2020
 */

package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.ClientModel;
import com.api.parkingcontrol.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ClientService {

    final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Transactional
    public ClientModel save(ClientModel clientModel) {
        return clientRepository.save(clientModel);
    }
}
