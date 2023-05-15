
package com.portfoliotavo.gb.Interface;

import com.portfoliotavo.gb.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //traer una lista personas
    public List<Persona> getPersona (); 
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar n objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
           
    
}
