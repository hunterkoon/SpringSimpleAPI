package FirstAPISpring.JavaAPI.repository;

import FirstAPISpring.JavaAPI.model.UserModel;
import org.springframework.data.repository.CrudRepository;

//cria uma interface de repositorio com metodos proprios

public interface IUserRepository  extends CrudRepository<UserModel , Integer> {
}
