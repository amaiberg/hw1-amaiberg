

/* First created by JCasGen Mon Oct 15 02:36:06 EDT 2012 */
package types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


import org.apache.uima.jcas.cas.StringArray;


/** 
 * Updated by JCasGen Mon Oct 15 22:21:39 EDT 2012
 * XML source: /home/mog/development/se/hw1-amaiberg/resources/GeneSentenceAnnotatorDescriptor.xml
 * @generated */
public class SentenceContent extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SentenceContent.class);
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
  protected SentenceContent() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public SentenceContent(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public SentenceContent(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public SentenceContent(JCas jcas, int begin, int end) {
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
  //* Feature: words

  /** getter for words - gets An array of words contained inside the sentence.
   * @generated */
  public StringArray getWords() {
    if (SentenceContent_Type.featOkTst && ((SentenceContent_Type)jcasType).casFeat_words == null)
      jcasType.jcas.throwFeatMissing("words", "types.SentenceContent");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SentenceContent_Type)jcasType).casFeatCode_words)));}
    
  /** setter for words - sets An array of words contained inside the sentence. 
   * @generated */
  public void setWords(StringArray v) {
    if (SentenceContent_Type.featOkTst && ((SentenceContent_Type)jcasType).casFeat_words == null)
      jcasType.jcas.throwFeatMissing("words", "types.SentenceContent");
    jcasType.ll_cas.ll_setRefValue(addr, ((SentenceContent_Type)jcasType).casFeatCode_words, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for words - gets an indexed value - An array of words contained inside the sentence.
   * @generated */
  public String getWords(int i) {
    if (SentenceContent_Type.featOkTst && ((SentenceContent_Type)jcasType).casFeat_words == null)
      jcasType.jcas.throwFeatMissing("words", "types.SentenceContent");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((SentenceContent_Type)jcasType).casFeatCode_words), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((SentenceContent_Type)jcasType).casFeatCode_words), i);}

  /** indexed setter for words - sets an indexed value - An array of words contained inside the sentence.
   * @generated */
  public void setWords(int i, String v) { 
    if (SentenceContent_Type.featOkTst && ((SentenceContent_Type)jcasType).casFeat_words == null)
      jcasType.jcas.throwFeatMissing("words", "types.SentenceContent");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((SentenceContent_Type)jcasType).casFeatCode_words), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((SentenceContent_Type)jcasType).casFeatCode_words), i, v);}
  }

    