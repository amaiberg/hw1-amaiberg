package types;


/* First created by JCasGen Sun Oct 14 22:23:42 EDT 2012 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Sun Oct 14 22:23:42 EDT 2012
 * XML source: /home/mog/development/se/hw1-amaiberg/resources/GeneSentenceAnnotatorDescriptor.xml
 * @generated */
public class senetence_id extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(senetence_id.class);
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
  protected senetence_id() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public senetence_id(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public senetence_id(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public senetence_id(JCas jcas, int begin, int end) {
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
     
}

    