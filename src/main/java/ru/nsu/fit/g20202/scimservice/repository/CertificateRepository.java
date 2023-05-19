package ru.nsu.fit.g20202.scimservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.nsu.fit.g20202.scimservice.entity.Certificate;

public interface CertificateRepository extends JpaRepository<Certificate, Integer>
{
}
