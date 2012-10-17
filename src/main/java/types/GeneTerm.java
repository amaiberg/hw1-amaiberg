

/* First created by JCasGen Wed Oct 17 02:21:57 EDT 2012 */
package types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** A gene term candidate.
 * Updated by JCasGen Wed Oct 17 02:21:58 EDT 2012
 * XML source: /home/mog/development/se/hw1-amaiberg/resources/descriptors/typeSystemDescriptor.xml
 * @generated */
public class GeneTerm extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(GeneTerm.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected GeneTerm() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public GeneTerm(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public GeneTerm(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public GeneTerm(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: term

  /** getter for term - gets The content of the gene term candidate.
   * @generated */
  public String getTerm() {
    if (GeneTerm_Type.featOkTst && ((GeneTerm_Type)jcasType).casFeat_term == null)
      jcasType.jcas.throwFeatMissing("term", "types.GeneTerm");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeneTerm_Type)jcasType).casFeatCode_term);}
    
  /** setter for term - sets The content of the gene term candidate. 
   * @generated */
  public void setTerm(String v) {
    if (GeneTerm_Type.featOkTst && ((GeneTerm_Type)jcasType).casFeat_term == null)
      jcasType.jcas.throwFeatMissing("term", "types.GeneTerm");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeneTerm_Type)jcasType).casFeatCode_term, v);}    
  }

    