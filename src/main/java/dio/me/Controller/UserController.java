package dio.me.Controller;

import dio.me.Model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import service.UserService;
import java.net.URI;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User user = userService.findById(id);  // Explicitamente declara user como User

        if (user == null) {
            return ResponseEntity.notFound().build();  // Retorna 404 se não encontrar o usuário
        }

        return ResponseEntity.ok(user);  // Retorna 200 OK com o usuário encontrado
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user) {
        User userCreated = userService.create(user);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userCreated.getId())  // Supondo que User tenha um método getId()
                .toUri();
        return ResponseEntity.created(location).body(userCreated);  // Retorna 201 Created com o URI do novo usuário
    }
}
