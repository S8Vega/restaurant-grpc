package com.thechaoscompany.server;

import com.thechaoscompany.server.entities.SchoolEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<SchoolEntity, Long> {
}