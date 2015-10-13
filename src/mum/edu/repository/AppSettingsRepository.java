package mum.edu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mum.edu.domain.AppSettings;



@Repository
public interface AppSettingsRepository extends CrudRepository<AppSettings, Long> {
	
	public AppSettings getParamValueByParamKey(String paramKey);
	

}
