package mum.edu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.domain.Credentials;
import mum.edu.repository.CredentialsRepository;
import mum.edu.Services.CredentialService;


@Service
public class CredentialServiceImpl implements CredentialService {
	
	
	@Autowired 
	CredentialsRepository credentialRepository;
	
	public Credentials getCredentials(String username) {
		
		return credentialRepository.getCredentialByUsername(username);
	}

}
