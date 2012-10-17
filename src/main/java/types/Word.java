

/* First created by JCasGen Mon Oct 15 19:41:06 EDT 2012 */
package types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** A word contained in a sentence.
 * Updated by JCasGen Wed Oct 17 02:21:58 EDT 2012
 * XML source: /home/mog/development/se/hw1-amaiberg/resources/descriptors/typeSystemDescriptor.xml
 * @generated */
public class Word extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Word.class);
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
  protected Word() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Word(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Word(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Word(JCas jcas, int begin, int end) {
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
  //* Feature: content

  /** getter for content - gets 
   * @generated */
  public String getContent() {
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "types.Word");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Word_Type)jcasType).casFeatCode_content);}
    
  /** setter for content - sets  
   * @generated */
  public void setContent(String v) {
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "types.Word");
    jcasType.ll_cas.ll_setStringValue(addr, ((Word_Type)jcasType).casFeatCode_content, v);}    
   
    
  //*--------------*
  //* Feature: beginOffset

  /** getter for beginOffset - gets Defines the beginning non-whitespace offset from the beginning of the sentece.
   * @generated */
  public int getBeginOffset() {
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_beginOffset == null)
      jcasType.jcas.throwFeatMissing("beginOffset", "types.Word");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Word_Type)jcasType).casFeatCode_beginOffset);}
    
  /** setter for beginOffset - sets Defines the beginning non-whitespace offset from the beginning of the sentece. 
   * @generated */
  public void setBeginOffset(int v) {
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_beginOffset == null)
      jcasType.jcas.throwFeatMissing("beginOffset", "types.Word");
    jcasType.ll_cas.ll_setIntValue(addr, ((Word_Type)jcasType).casFeatCode_beginOffset, v);}    
   
    
  //*--------------*
  //* Feature: endOffset

  /** getter for endOffset - gets Defines the non-whitespace end offset of the word from the beginning of the sentence.
   * @generated */
  public int getEndOffset() {
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_endOffset == null)
      jcasType.jcas.throwFeatMissing("endOffset", "types.Word");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Word_Type)jcasType).casFeatCode_endOffset);}
    
  /** setter for endOffset - sets Defines the non-whitespace end offset of the word from the beginning of the sentence. 
   * @generated */
  public void setEndOffset(int v) {
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_endOffset == null)
      jcasType.jcas.throwFeatMissing("endOffset", "types.Word");
    jcasType.ll_cas.ll_setIntValue(addr, ((Word_Type)jcasType).casFeatCode_endOffset, v);}    
  }

    