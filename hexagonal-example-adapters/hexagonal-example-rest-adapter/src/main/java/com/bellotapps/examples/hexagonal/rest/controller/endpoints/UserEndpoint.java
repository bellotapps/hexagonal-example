package com.bellotapps.examples.hexagonal.rest.controller.endpoints;

import com.bellotapps.examples.hexagonal.models.User;
import com.bellotapps.examples.hexagonal.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * API endpoint for {@link User} management.
 */
@Component
public class UserEndpoint {

    /**
     * The {@link UserService} that will be used to manage {@link User}s.
     */
    private final UserService userService;

    /**
     * Constructor.
     *
     * @param userService The {@link UserService} that will be used to manage {@link User}s.
     */
    @Autowired
    public UserEndpoint(final UserService userService) {
        this.userService = userService;
    }
}
