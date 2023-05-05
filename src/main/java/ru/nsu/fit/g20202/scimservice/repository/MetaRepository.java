package ru.nsu.fit.g20202.scimservice.repository;

import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nsu.fit.g20202.scimservice.entity.Meta;

@Repository
public interface MetaRepository extends JpaRepository<Meta, Integer>
{
}
