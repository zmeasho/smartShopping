package mum.edu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.Services.MyFinanceService;
import mum.edu.domain.MyFinance;
import mum.edu.repository.MyfinanceRepository;
@Service
public class MyFinanceServiceImp implements MyFinanceService{
 @Autowired
 MyfinanceRepository myFinanceRepo;
	@Override
	
	public List<MyFinance> getAll() {
		return (List<MyFinance>)myFinanceRepo.findAll();
		
	}
 
}
