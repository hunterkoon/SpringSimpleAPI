package FirstAPISpring.JavaAPI.controller;

import FirstAPISpring.JavaAPI.model.UserModel;
import FirstAPISpring.JavaAPI.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private IUserRepository repository;

    @GetMapping(path = "/api/user/{id}")
    public ResponseEntity getUser(@PathVariable("id") Integer id) {
        return repository.findById(id)
                .map(response -> ResponseEntity.ok().body(response))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/user/save")
    public UserModel salvar(@RequestBody UserModel user) {
        return repository.save(user);
    }

}
