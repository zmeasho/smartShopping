package mum.edu.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import mum.edu.domain.MyFinance;
@Service
public interface MyFinanceService {
	public List<MyFinance> getAll();
	

}
