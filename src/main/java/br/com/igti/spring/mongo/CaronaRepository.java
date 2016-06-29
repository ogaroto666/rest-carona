package br.com.igti.spring.mongo;

import java.util.List;

import org.springframework.data.geo.Circle;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.GeoResults;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaronaRepository  extends MongoRepository<Carona, String> {
	
	List<Carona> findBycaronista(Integer id);
	GeoResults<Pessoa> findByLocalizacaoNear(Point referenceLocation, Distance oneKilometer);
	List<Pessoa> findByLocalizacaoWithin(Circle c);
}
