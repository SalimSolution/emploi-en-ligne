package com.emploi.repositories;

import com.emploi.entities.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EntrepriseRepository extends JpaRepository<Entreprise, String> {

    @Query("select e from Entreprise e where e.email=:email")
    public Entreprise getEntrepriseByEmail(@Param("email") String email);
}
