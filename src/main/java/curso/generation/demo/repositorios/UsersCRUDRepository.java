package curso.generation.demo.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import curso.generation.demo.entidades.User;

public interface UsersCRUDRepository extends CrudRepository<User, Integer> {

	@Query("from User as u where u.user=:user and u.password=:password and u.role=:role_id")
	public Iterable<User> getUser(String user, String password, int role_id);

}
