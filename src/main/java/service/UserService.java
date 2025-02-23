
package service;


public interface UserService {
    boolean existsByAccount(String accountNumber);

    Object findById(Long id);
}
