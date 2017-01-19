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
 * Classe que representa a camada de negócios de ClasseABusiness
 * 
 * @generated
 **/
@Service("ClasseABusiness")
public class ClasseABusiness {


    /**
     * Instância da classe ClasseADAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ClasseADAO")
    protected ClasseADAO repository;

    // CRUD

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    public ClasseA post(final ClasseA entity) throws Exception {
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
    public ClasseA get(java.lang.String id) throws Exception {
      // begin-user-code  
      // end-user-code        
       ClasseA result = repository.findOne(id);
      // begin-user-code  
      // end-user-code        
      return result;
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    public ClasseA put(final ClasseA entity) throws Exception {
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
  public Page<ClasseA> list ( Pageable pageable ){
    // begin-user-code  
    // end-user-code        
    Page<ClasseA> result = repository.list (  pageable );
    // begin-user-code  
    // end-user-code        
    return result;
  }
    


  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  public Page<ClasseA> generalSearch(java.lang.String search, Pageable pageable) {
    return repository.generalSearch(search, pageable);
  }
  
  /**
   * Searchable fields - Specific search
   * @generated
   */
  public Page<ClasseA> specificSearch(java.lang.String atributo1, Pageable pageable) {
    return repository.specificSearch(atributo1, pageable);
  }

}