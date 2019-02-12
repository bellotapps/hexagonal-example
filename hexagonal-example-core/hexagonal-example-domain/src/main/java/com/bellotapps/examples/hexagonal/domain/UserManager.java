package com.bellotapps.examples.hexagonal.domain;

import com.bellotapps.examples.hexagonal.models.User;
import com.bellotapps.examples.hexagonal.repositories.UserRepository;
import com.bellotapps.examples.hexagonal.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Manager for {@link User}s.
 */
@Service
public class UserManager implements UserService {

    /**
     * Repository for {@link User}s.
     */
    private final UserRepository userRepository;

    /**
     * Constructor.
     *
     * @param userRepository Repository for {@link User}s.
     */
    @Autowired
    public UserManager(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
