package com.bellotapps.examples.hexagonal.repositories;

import com.bellotapps.examples.hexagonal.models.User;

/**
 * A port out of the application that allows {@link User} persistence.
 */
// TODO: remove comment when JPA is added into the project.
public interface UserRepository /* extends ExtendedJpaRepository<User, Long> */ {
}
