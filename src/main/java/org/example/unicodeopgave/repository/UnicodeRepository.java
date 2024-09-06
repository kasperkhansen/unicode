package org.example.unicodeopgave.repository;


import org.example.unicodeopgave.model.Unicode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnicodeRepository extends JpaRepository<Unicode, Long> {
}
