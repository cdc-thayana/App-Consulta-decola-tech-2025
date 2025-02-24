package service.impl;

//import repository.UserRepository;
import Repository.UserRepository;
import dio.me.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserService;

@Service
public abstract class UserServiceImpl implements UserService {


    private final UserRepository userRepository;


    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean existsByAccount(String accountNumber) {
        return userRepository.existsByAccountNumber(accountNumber);
    }

    @Override
    public User findById(Long id) { // Alterado para retornar User em vez de Object
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User create(User userToCreate) { // Corrigido erro de sintaxe na assinatura do método
        boolean accountExists = userRepository.existsByAccountNumber(userToCreate.getAccountNumber());

        if (accountExists) {
            throw new IllegalArgumentException("This account number already exists.");
        }

        return userRepository.save(userToCreate);
    }
}
