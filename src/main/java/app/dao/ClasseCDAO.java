package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 
/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("ClasseCDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface ClasseCDAO extends JpaRepository<ClasseC, java.lang.String> {

  /**
   * Obtém a instância de ClasseC utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM ClasseC entity WHERE entity.id = :id")
  public ClasseC findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de ClasseC utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM ClasseC entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from ClasseC c")
  public Page<ClasseC> list ( Pageable pageable );
  





  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM ClasseC entity WHERE entity.atributo1 like concat('%',coalesce(:search,''),'%')")
  public Page<ClasseC> generalSearch (@Param(value="search") java.lang.String search, Pageable pageable );

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM ClasseC entity WHERE (:atributo1 is null OR entity.atributo1 like concat('%',:atributo1,'%'))")
  public Page<ClasseC> specificSearch (@Param(value="atributo1") java.lang.String atributo1, Pageable pageable);
  

}