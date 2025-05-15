package vn.tayjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.tayjava.dto.request.UserRequestDTO;

public interface StudentRepository extends JpaRepository<UserRequestDTO,Long> {
}
