package curso.generation.demo.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import curso.generation.demo.entidades.User;

public interface UsersCRUDRepository extends CrudRepository<User, Integer> {

	@Query("from User as u where u.user=:user and u.password=:password")
	//Solo puede dar un ÚNICO objeto con la misma clave y la misma contraseña
	public User getLogin(String user, String password);

	@Override
	default Optional<User> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default Iterable<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
