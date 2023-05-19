package ru.nsu.fit.g20202.scimservice.repository;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.nsu.fit.g20202.scimservice.entity.Group;

public interface GroupRepository extends JpaRepository<Group, Integer>
{
    boolean existsByDisplayName(@NotBlank String displayName);
}
