package org.afdemp.leisurehotel4animals.dao;

import org.afdemp.leisurehotel4animals.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
