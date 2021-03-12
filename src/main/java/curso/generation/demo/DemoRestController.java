
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
	private UsersCRUDRepository repositoryUser;

	@PostMapping(value = "api/verLogin") // uri del formulario de login
	public String verLogin(@RequestParam String user, @RequestParam String password) {

		if (getRepositoryUser().getLogin(user, password) != null)

			return getRepositoryUser().getLogin(user, password).getRole().getRol();

		else
			return "No tienes un rol válido";
	}

	public UsersCRUDRepository getRepositoryUser() {
		return repositoryUser;
	}

	public void setRepositoryUser(UsersCRUDRepository repositoryUser) {
		this.repositoryUser = repositoryUser;
	}

}
