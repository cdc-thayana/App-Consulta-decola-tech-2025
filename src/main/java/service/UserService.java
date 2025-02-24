
package service;


import dio.me.Model.User;

public interface UserService {
    boolean existsByAccount(String accountNumber);

    User findById(Long id);

    Object create(Object userToCreate);

    User create(User userToCreate);
}
