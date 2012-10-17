
/* First created by JCasGen Sun Oct 14 22:25:09 EDT 2012 */
package types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** A sentence containing a gene mention with an id.
 * Updated by JCasGen Wed Oct 17 02:21:57 EDT 2012
 * @generated */
public class GeneSentence_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (GeneSentence_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = GeneSentence_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new GeneSentence(addr, GeneSentence_Type.this);
  			   GeneSentence_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new GeneSentence(addr, GeneSentence_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = GeneSentence.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("types.GeneSentence");
 
  /** @generated */
  final Feature casFeat_sentence_id;
  /** @generated */
  final int     casFeatCode_sentence_id;
  /** @generated */ 
  public int getSentence_id(int addr) {
        if (featOkTst && casFeat_sentence_id == null)
      jcas.throwFeatMissing("sentence_id", "types.GeneSentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_sentence_id);
  }
  /** @generated */    
  public void setSentence_id(int addr, int v) {
        if (featOkTst && casFeat_sentence_id == null)
      jcas.throwFeatMissing("sentence_id", "types.GeneSentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_sentence_id, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sentence;
  /** @generated */
  final int     casFeatCode_sentence;
  /** @generated */ 
  public String getSentence(int addr) {
        if (featOkTst && casFeat_sentence == null)
      jcas.throwFeatMissing("sentence", "types.GeneSentence");
    return ll_cas.ll_getStringValue(addr, casFeatCode_sentence);
  }
  /** @generated */    
  public void setSentence(int addr, String v) {
        if (featOkTst && casFeat_sentence == null)
      jcas.throwFeatMissing("sentence", "types.GeneSentence");
    ll_cas.ll_setStringValue(addr, casFeatCode_sentence, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public GeneSentence_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_sentence_id = jcas.getRequiredFeatureDE(casType, "sentence_id", "types.SentenceId", featOkTst);
    casFeatCode_sentence_id  = (null == casFeat_sentence_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sentence_id).getCode();

 
    casFeat_sentence = jcas.getRequiredFeatureDE(casType, "sentence", "uima.cas.String", featOkTst);
    casFeatCode_sentence  = (null == casFeat_sentence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sentence).getCode();

  }
}



    