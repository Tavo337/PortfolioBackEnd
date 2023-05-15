
package com.portfoliotavo.gb.repository;

import com.portfoliotavo.gb.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonarepository extends JpaRepository<Persona,Long> {
   
    
}
