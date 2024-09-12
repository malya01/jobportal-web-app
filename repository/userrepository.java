package Jobportal.jobportal.repository;

import Jobportal.jobportal.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userrepository extends JpaRepository<user,Integer> {

}
