package dio.me.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.UserService;


@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    private Object userToCreate;

    public  UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity.BodyBuilder findById(@PathVariable Long id){
        var user = userService.findById(id);
        return  ResponseEntity.ok();

        //@PostMapping
//        public ResponseEntity<User> create(@RequestBody User user){
//            var userCreate = userService.create(userToCreate);
//            URI location = null;
//            return  ResponseEntity.created(location).body(userCreated);

    }
}
