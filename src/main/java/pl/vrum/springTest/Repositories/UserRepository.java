package pl.vrum.springTest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.vrum.springTest.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
