
package curso.generation.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import curso.generation.demo.entidades.User;
import curso.generation.demo.repositorios.UsersCRUDRepository;

@RestController
public class DemoRestController {

	// --------- Recibir un JSON desde el PostMan ------------------

	@Autowired
	private UsersCRUDRepository repository;

	@PostMapping("entrada")
	// public Iterable<User> getUsers(@RequestBody DatosLogin datos){
	public String getUsers(@RequestParam String user, @RequestParam String password, Model model) {
		User usario = new User();
		usario.setUser(user);
		usario.setPassword(password);
		
		model.addAttribute(usario);

		// return getRepository().getUser(datos.getUser(), datos.getPassword(),
		// datos.getRoles_id());
		// el rol?¿

		return "entrada";
	}

	public UsersCRUDRepository getRepository() {
		return repository;
	}

	public void setRepository(UsersCRUDRepository repository) {
		this.repository = repository;
	}

}
