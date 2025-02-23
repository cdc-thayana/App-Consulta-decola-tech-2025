
package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserService;


@Service
public class UserServiceImpl implements UserService {

    private final service.impl.UserRepository userRepository;

    @Autowired
    public UserServiceImpl(service.impl.UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean existsByAccount(String accountNumber) {
        return userRepository.existsByAccountNumber(accountNumber);
    }

    @Override
    public Object findById(Long id) {
        return null;
    }
}
