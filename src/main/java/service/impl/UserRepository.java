package service.impl;

import dio.me.Model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class UserRepository {

    private final Map<Long, User> userDatabase = new HashMap<>();
    private long idCounter = 1;

    public boolean existsByAccountNumber(String accountNumber) {
        return userDatabase.values().stream()
                .anyMatch(user -> user.getAccountNumber().equals                                                (accountNumber));
    }

    public Optional<User> findById(Long id) {
        return Optional.ofNullable(userDatabase.get(id));
    }

    public User save(User user) {
        if (user.getId() == null) {
            user.setId(idCounter++);
        }
        userDatabase.put(user.getId(), user);
        return user;
    }
}
