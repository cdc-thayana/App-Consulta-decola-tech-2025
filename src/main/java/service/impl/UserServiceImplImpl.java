package service.impl;

import Repository.UserRepository;

public abstract class UserServiceImplImpl extends UserServiceImpl {
    public UserServiceImplImpl(UserRepository userRepository) {
        super(userRepository);
    }
}
