package app.entity;
import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Classe que representa a tabela CLASSEC
 * @generated
 */
@Entity
@Table(name = "\"CLASSEC\""
)
@XmlRootElement
public class ClasseC implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = -1776691315l;
  
  /**
   * @generated
   */
  @Id
    
  @Column(name = "id", insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  /**
   * @generated
   */
  @Column(name = "atributo1", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String atributo1;
  /**
   * @generated
   */
  @Column(name = "atributo2", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String atributo2;
  /**
   * @generated
   */
  @Temporal(TemporalType.DATE)
  @Column(name = "atributo3", nullable = true, unique = false, insertable=true, updatable=true)
  private java.util.Date atributo3;
  /**
   * @generated
   */
  @Temporal(TemporalType.DATE)
  @Column(name = "atributo4", nullable = true, unique = false, insertable=true, updatable=true)
  private java.util.Date atributo4;
  /**
   * @generated
   */
  @Temporal(TemporalType.DATE)
  @Column(name = "atributo5", nullable = true, unique = false, insertable=true, updatable=true)
  private java.util.Date atributo5;
  
  /**
   * Construtor
   * @generated
   */
  public ClasseC(){
  }

  
  /**
   * Obtém id
   * @param id id
   * return id
   * @generated
   */
  public java.lang.String getId(){
    return this.id;
  }
  
  /**
   * Define id
   * @param id id
   * @generated
   */
  public ClasseC setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém atributo1
   * @param atributo1 atributo1
   * return atributo1
   * @generated
   */
  public java.lang.String getAtributo1(){
    return this.atributo1;
  }
  
  /**
   * Define atributo1
   * @param atributo1 atributo1
   * @generated
   */
  public ClasseC setAtributo1(java.lang.String atributo1){
    this.atributo1 = atributo1;
    return this;
  }
  
  /**
   * Obtém atributo2
   * @param atributo2 atributo2
   * return atributo2
   * @generated
   */
  public java.lang.String getAtributo2(){
    return this.atributo2;
  }
  
  /**
   * Define atributo2
   * @param atributo2 atributo2
   * @generated
   */
  public ClasseC setAtributo2(java.lang.String atributo2){
    this.atributo2 = atributo2;
    return this;
  }
  
  /**
   * Obtém atributo3
   * @param atributo3 atributo3
   * return atributo3
   * @generated
   */
  public java.util.Date getAtributo3(){
    return this.atributo3;
  }
  
  /**
   * Define atributo3
   * @param atributo3 atributo3
   * @generated
   */
  public ClasseC setAtributo3(java.util.Date atributo3){
    this.atributo3 = atributo3;
    return this;
  }
  
  /**
   * Obtém atributo4
   * @param atributo4 atributo4
   * return atributo4
   * @generated
   */
  public java.util.Date getAtributo4(){
    return this.atributo4;
  }
  
  /**
   * Define atributo4
   * @param atributo4 atributo4
   * @generated
   */
  public ClasseC setAtributo4(java.util.Date atributo4){
    this.atributo4 = atributo4;
    return this;
  }
  
  /**
   * Obtém atributo5
   * @param atributo5 atributo5
   * return atributo5
   * @generated
   */
  public java.util.Date getAtributo5(){
    return this.atributo5;
  }
  
  /**
   * Define atributo5
   * @param atributo5 atributo5
   * @generated
   */
  public ClasseC setAtributo5(java.util.Date atributo5){
    this.atributo5 = atributo5;
    return this;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((id == null) ? 0 : id.hashCode());

        return result;
    }
  
  /**
   * @generated
   */ 
  @Override
    public boolean equals(Object obj) {
    
      if(this == obj)
        return true;
      
      if(obj == null)
        return false;
      
      if(!(obj instanceof ClasseC))
        return false;
      
      ClasseC other = (ClasseC)obj;
      
    if(this.id == null && other.id != null)
        return false;
      else if(!this.id.equals(other.id))
        return false;
  

      return true;
      
  }
}