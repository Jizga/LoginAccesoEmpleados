
package curso.generation.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// import curso.generation.demo.entidades.User;
import curso.generation.demo.repositorios.UsersCRUDRepository;

@RestController
public class DemoRestController {

	// ----- Mostrar los datos en un jsp (vista web) ----
	@Autowired
	private UsersCRUDRepository repository;

	@PostMapping("entrada")
	// public Iterable<User> getUsers(@RequestBody DatosLogin datos){
	public String getUsers(@RequestParam String user, @RequestParam String password, Model model, DatosLogin usuario) {
		// usuario = new User();
		usuario = new DatosLogin();
		String jspDestino = null;

		usuario.setUser(user);
		usuario.setPassword(password);

		if (usuario.getUser().equalsIgnoreCase("admin") && usuario.getPassword().equals("1234")) {
			jspDestino = "admi";

		} else if (usuario.getUser().equalsIgnoreCase("pepe") && usuario.getPassword().equals("1234")) {
			jspDestino = "entrada";

		} else {
			jspDestino = "error";

		}

		model.addAttribute("usuario", usuario);

		// return getRepository().getUser(datos.getUser(), datos.getPassword(),
		// datos.getRoles_id());
		// el rol?¿

		return jspDestino;
	}

	public UsersCRUDRepository getRepository() {
		return repository;
	}

	public void setRepository(UsersCRUDRepository repository) {
		this.repository = repository;
	}

}
