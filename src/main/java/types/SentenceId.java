

/* First created by JCasGen Mon Oct 15 02:36:06 EDT 2012 */
package types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Oct 17 02:21:58 EDT 2012
 * XML source: /home/mog/development/se/hw1-amaiberg/resources/descriptors/typeSystemDescriptor.xml
 * @generated */
public class SentenceId extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SentenceId.class);
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
  protected SentenceId() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public SentenceId(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public SentenceId(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public SentenceId(JCas jcas, int begin, int end) {
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
  //* Feature: id

  /** getter for id - gets The name identifying the sentence.
   * @generated */
  public String getId() {
    if (SentenceId_Type.featOkTst && ((SentenceId_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "types.SentenceId");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SentenceId_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets The name identifying the sentence. 
   * @generated */
  public void setId(String v) {
    if (SentenceId_Type.featOkTst && ((SentenceId_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "types.SentenceId");
    jcasType.ll_cas.ll_setStringValue(addr, ((SentenceId_Type)jcasType).casFeatCode_id, v);}    
  }

    