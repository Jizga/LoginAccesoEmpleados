
package curso.generation.demo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;
import curso.generation.demo.repositorios.UsersCRUDRepository;

@RestController
public class DemoRestController {

// ---------------------------  Recibe JSON	---------------------------------------- 
	
	
	@Autowired
	private UsersCRUDRepository repository;
	
	

	public UsersCRUDRepository getRepository() {
		return repository;
	}

	public void setRepository(UsersCRUDRepository repository) {
		this.repository = repository;
	}

}
