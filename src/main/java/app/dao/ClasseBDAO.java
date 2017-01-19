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
@Repository("ClasseBDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface ClasseBDAO extends JpaRepository<ClasseB, java.lang.String> {

  /**
   * Obtém a instância de ClasseB utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM ClasseB entity WHERE entity.id = :id")
  public ClasseB findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de ClasseB utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM ClasseB entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from ClasseB c")
  public Page<ClasseB> list ( Pageable pageable );
  





  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM ClasseB entity WHERE entity.atributo2 like concat('%',coalesce(:search,''),'%')")
  public Page<ClasseB> generalSearch (@Param(value="search") java.lang.String search, Pageable pageable );

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM ClasseB entity WHERE (:atributo2 is null OR entity.atributo2 like concat('%',:atributo2,'%'))")
  public Page<ClasseB> specificSearch (@Param(value="atributo2") java.lang.String atributo2, Pageable pageable);
  

}