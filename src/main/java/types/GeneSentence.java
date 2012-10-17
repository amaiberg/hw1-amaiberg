

/* First created by JCasGen Sun Oct 14 22:25:08 EDT 2012 */
package types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** A sentence containing a gene mention with an id.
 * Updated by JCasGen Wed Oct 17 02:21:57 EDT 2012
 * XML source: /home/mog/development/se/hw1-amaiberg/resources/descriptors/typeSystemDescriptor.xml
 * @generated */
public class GeneSentence extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(GeneSentence.class);
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
  protected GeneSentence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public GeneSentence(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public GeneSentence(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public GeneSentence(JCas jcas, int begin, int end) {
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
  //* Feature: sentence_id

  /** getter for sentence_id - gets 
   * @generated */
  public SentenceId getSentence_id() {
    if (GeneSentence_Type.featOkTst && ((GeneSentence_Type)jcasType).casFeat_sentence_id == null)
      jcasType.jcas.throwFeatMissing("sentence_id", "types.GeneSentence");
    return (SentenceId)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((GeneSentence_Type)jcasType).casFeatCode_sentence_id)));}
    
  /** setter for sentence_id - sets  
   * @generated */
  public void setSentence_id(SentenceId v) {
    if (GeneSentence_Type.featOkTst && ((GeneSentence_Type)jcasType).casFeat_sentence_id == null)
      jcasType.jcas.throwFeatMissing("sentence_id", "types.GeneSentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((GeneSentence_Type)jcasType).casFeatCode_sentence_id, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: sentence

  /** getter for sentence - gets A String containing the whole sentence.
   * @generated */
  public String getSentence() {
    if (GeneSentence_Type.featOkTst && ((GeneSentence_Type)jcasType).casFeat_sentence == null)
      jcasType.jcas.throwFeatMissing("sentence", "types.GeneSentence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeneSentence_Type)jcasType).casFeatCode_sentence);}
    
  /** setter for sentence - sets A String containing the whole sentence. 
   * @generated */
  public void setSentence(String v) {
    if (GeneSentence_Type.featOkTst && ((GeneSentence_Type)jcasType).casFeat_sentence == null)
      jcasType.jcas.throwFeatMissing("sentence", "types.GeneSentence");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeneSentence_Type)jcasType).casFeatCode_sentence, v);}    
  }

    