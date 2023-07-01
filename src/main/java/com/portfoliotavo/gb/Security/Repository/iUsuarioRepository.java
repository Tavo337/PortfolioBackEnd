/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfoliotavo.gb.Security.Repository;

import com.portfoliotavo.gb.Security.Entity.Usuario;
import org.apache.el.stream.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iUsuarioRepository extends JpaRepository<Usuario, Integer> {
 Optional<Usuario> findByNombreUsuario(String nombreUsuario); 
 
 boolean existByNombreUsuario(String NombreUsuario);
 boolean existByEmail(String email);
}
