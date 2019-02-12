package com.bellotapps.examples.hexagonal.spring_data.config;

import com.bellotapps.examples.hexagonal.repositories.UserRepository;
import org.springframework.stereotype.Repository;

/**
 * A mocked {@link com.bellotapps.examples.hexagonal.models.User} repository used to boot the application.
 * Remove when Spring Data dependencies are added.
 */
@Repository
// TODO: remove this class as Spring Data will create all the needed repositories.
public class MockedUserRepository implements UserRepository {
}
