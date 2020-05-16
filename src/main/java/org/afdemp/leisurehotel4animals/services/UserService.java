package org.afdemp.leisurehotel4animals.services;

import org.afdemp.leisurehotel4animals.controllers.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.afdemp.leisurehotel4animals.entities.User;


public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
