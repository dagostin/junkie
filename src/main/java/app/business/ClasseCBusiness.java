package app.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.*;
import app.dao.*;
import app.entity.*;
/**
 * Classe que representa a camada de negócios de ClasseCBusiness
 * 
 * @generated
 **/
@Service("ClasseCBusiness")
public class ClasseCBusiness {


    /**
     * Instância da classe ClasseCDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ClasseCDAO")
    protected ClasseCDAO repository;

    // CRUD

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    public ClasseC post(final ClasseC entity) throws Exception {
      // begin-user-code  
      // end-user-code  
        repository.save(entity);
      // begin-user-code  
      // end-user-code  
      return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    public ClasseC get(java.lang.String id) throws Exception {
      // begin-user-code  
      // end-user-code        
       ClasseC result = repository.findOne(id);
      // begin-user-code  
      // end-user-code        
      return result;
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    public ClasseC put(final ClasseC entity) throws Exception {
      // begin-user-code  
      // end-user-code
        repository.saveAndFlush(entity);
      // begin-user-code  
      // end-user-code        
      return entity;
    }

    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    public void delete( java.lang.String id) throws Exception {
      // begin-user-code  
      // end-user-code        
      repository.delete(id);
      // begin-user-code  
      // end-user-code        
    }

    // CRUD
    
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public Page<ClasseC> list ( Pageable pageable ){
    // begin-user-code  
    // end-user-code        
    Page<ClasseC> result = repository.list (  pageable );
    // begin-user-code  
    // end-user-code        
    return result;
  }
    


  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  public Page<ClasseC> generalSearch(java.lang.String search, Pageable pageable) {
    return repository.generalSearch(search, pageable);
  }
  
  /**
   * Searchable fields - Specific search
   * @generated
   */
  public Page<ClasseC> specificSearch(java.lang.String atributo1, Pageable pageable) {
    return repository.specificSearch(atributo1, pageable);
  }

}