package mum.edu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.Services.AppSettingsService;
import mum.edu.domain.AppSettings;
import mum.edu.repository.AppSettingsRepository;

@Service
public class AppSettingsServiceImpl implements AppSettingsService {

	@Autowired
	AppSettingsRepository appSettingsRepository;

	public AppSettings appSettings(String paramKey) {
		
		return appSettingsRepository.getParamValueByParamKey(paramKey);
	}
	
	


	

}
