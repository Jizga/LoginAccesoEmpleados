package curso.generation.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {
// -------------------- Movimiento entre páginas JSP ---------------------------
	
	@GetMapping("/")
	public String index() {

		return "index";
	}

		
	@PostMapping("verLogin")
	public String getUsers(@RequestParam String user, @RequestParam String password, Model model, DatosLogin usuario) {
		
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


		return jspDestino;
	}
}
