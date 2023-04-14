package ru.nsu.fit.g20202.scimservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nsu.fit.g20202.scimservice.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>
{
}
