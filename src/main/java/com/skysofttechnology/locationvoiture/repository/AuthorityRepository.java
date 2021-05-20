package com.skysofttechnology.locationvoiture.repository;

import com.skysofttechnology.locationvoiture.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
