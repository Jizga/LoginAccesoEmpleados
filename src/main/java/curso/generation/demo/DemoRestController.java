
package curso.generation.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import curso.generation.demo.entidades.User;
import curso.generation.demo.repositorios.UsersCRUDRepository;

@RestController
public class DemoRestController {

// ---------------------------  Recibe JSON	---------------------------------------- 

	@Autowired
	private UsersCRUDRepository repository;

	@PostMapping(value = "api/accesosUsuarios") // Que uri?¿¿¿¿¿¿????
	public Iterable<User> getUser(@RequestParam String user, @RequestParam String password,
			@RequestParam int roles_id) {
		
		//El rol tambien???? (es un clave foranea)

		return getRepository().getUser(user, password, roles_id);
	}
	

	public UsersCRUDRepository getRepository() {
		return repository;
	}

	public void setRepository(UsersCRUDRepository repository) {
		this.repository = repository;
	}

}
