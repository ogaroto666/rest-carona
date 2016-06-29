package br.com.igti.spring.mongo;

import java.util.List;

import org.springframework.context.ApplicationContext;

import br.com.igti.util.SpringUtil;

public class PessoaService {

	private PessoaRepository db;
	
	public PessoaService(){
	
		ApplicationContext context =SpringUtil.getContext();
		db =  context.getBean(PessoaRepository.class);
		
	}
	
	public void insert(Pessoa p){
		db.save(p);
	}
	
	public List<Pessoa> getAll(){
		
		return db.findAll();
	}
	
}
