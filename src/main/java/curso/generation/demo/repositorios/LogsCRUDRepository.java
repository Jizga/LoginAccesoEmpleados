package curso.generation.demo.repositorios;

import org.springframework.data.repository.CrudRepository;

import curso.generation.demo.entidades.Log;

public interface LogsCRUDRepository extends CrudRepository<Log, Integer> {

	// Crear una API Rest propia

		//@Query(value = "SELECT * from Logs where year=:anio and month=:mes", nativeQuery = true)
		
		// En el leguaje JPAQL el Log es el objeto 
		//@Query("from Log a where a.month=:mes a.year=:anio")
		//public Iterable<Log> getLogsByAnioMes(int anio, int mes);

}
