package br.com.igti.spring.mongo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.data.geo.Circle;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.GeoResults;
import org.springframework.data.geo.Metrics;
import org.springframework.data.geo.Point;

import br.com.igti.util.SpringUtil;

public class CaronaService {


	private CaronaRepository edao;
	
	public CaronaService(){
	
		ApplicationContext context =SpringUtil.getContext();
		edao =  context.getBean(CaronaRepository.class);
	}
	
	
	public GeoResults<Pessoa> getByLocation(double latitude, double longitude, double distancia){
		
		Point referenceLocation = new Point(latitude, longitude);
		Distance oneKilometer = new Distance(distancia, Metrics.KILOMETERS);

		GeoResults<Pessoa> result = edao.findByLocalizacaoNear(referenceLocation, oneKilometer);
		return result;
		
	}
	
	public List<Pessoa> getByLocationWithin(){
		
		Circle c = new Circle( -19.98, -43.946, 0.1);

		List<Pessoa> result = edao.findByLocalizacaoWithin(c);
		
		return result;
		
	}
	
	public void insert(Carona e){
		edao.save(e);
	}
	
	public List<Carona> getAll(){
		
		return edao.findAll();
	}
	

}