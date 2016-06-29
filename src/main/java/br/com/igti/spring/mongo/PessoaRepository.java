package br.com.igti.spring.mongo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository  extends MongoRepository<Pessoa, String> {

	@Query("{'$id' : ?0}")
	List<Pessoa> findByid(Integer Id);
}
