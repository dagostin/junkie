package app.rest;

import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.*;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.*;
import java.util.*;
import app.entity.*;
import app.business.*;

/**
 * Controller para expor serviços REST de ClasseB
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/ClasseB")
public class ClasseBREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("ClasseBBusiness")
  private ClasseBBusiness classeBBusiness;


  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public ClasseB post(@Validated @RequestBody final ClasseB entity) throws Exception {
    return classeBBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public ClasseB put(@Validated @RequestBody final ClasseB entity) throws Exception {
    return classeBBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
  public ClasseB put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final ClasseB entity) throws Exception {
    return classeBBusiness.put(entity);
  }

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
  public void delete(@PathVariable("id") java.lang.String id) throws Exception {
    classeBBusiness.delete(id);
  }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  HttpEntity<PagedResources<ClasseB>> listParams (Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(classeBBusiness.list(pageable   )), HttpStatus.OK);    
  }



  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/generalSearch")
  public HttpEntity<PagedResources<ClasseB>> generalSearch(java.lang.String search, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(classeBBusiness.generalSearch(search, pageable)), HttpStatus.OK);
  }
  
  /**
   * Searchable fields - Specific search
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/specificSearch")
  public HttpEntity<PagedResources<ClasseB>> specificSearch(java.lang.String atributo2, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(classeBBusiness.specificSearch(atributo2, pageable)), HttpStatus.OK);
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{id}")
  public ClasseB get(@PathVariable("id") java.lang.String id) throws Exception {
    return classeBBusiness.get(id);
  }
}