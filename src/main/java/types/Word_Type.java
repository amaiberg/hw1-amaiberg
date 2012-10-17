
/* First created by JCasGen Mon Oct 15 19:41:06 EDT 2012 */
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

/** A word contained in a sentence.
 * Updated by JCasGen Wed Oct 17 02:21:58 EDT 2012
 * @generated */
public class Word_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Word_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Word_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Word(addr, Word_Type.this);
  			   Word_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Word(addr, Word_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Word.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("types.Word");
 
  /** @generated */
  final Feature casFeat_content;
  /** @generated */
  final int     casFeatCode_content;
  /** @generated */ 
  public String getContent(int addr) {
        if (featOkTst && casFeat_content == null)
      jcas.throwFeatMissing("content", "types.Word");
    return ll_cas.ll_getStringValue(addr, casFeatCode_content);
  }
  /** @generated */    
  public void setContent(int addr, String v) {
        if (featOkTst && casFeat_content == null)
      jcas.throwFeatMissing("content", "types.Word");
    ll_cas.ll_setStringValue(addr, casFeatCode_content, v);}
    
  
 
  /** @generated */
  final Feature casFeat_beginOffset;
  /** @generated */
  final int     casFeatCode_beginOffset;
  /** @generated */ 
  public int getBeginOffset(int addr) {
        if (featOkTst && casFeat_beginOffset == null)
      jcas.throwFeatMissing("beginOffset", "types.Word");
    return ll_cas.ll_getIntValue(addr, casFeatCode_beginOffset);
  }
  /** @generated */    
  public void setBeginOffset(int addr, int v) {
        if (featOkTst && casFeat_beginOffset == null)
      jcas.throwFeatMissing("beginOffset", "types.Word");
    ll_cas.ll_setIntValue(addr, casFeatCode_beginOffset, v);}
    
  
 
  /** @generated */
  final Feature casFeat_endOffset;
  /** @generated */
  final int     casFeatCode_endOffset;
  /** @generated */ 
  public int getEndOffset(int addr) {
        if (featOkTst && casFeat_endOffset == null)
      jcas.throwFeatMissing("endOffset", "types.Word");
    return ll_cas.ll_getIntValue(addr, casFeatCode_endOffset);
  }
  /** @generated */    
  public void setEndOffset(int addr, int v) {
        if (featOkTst && casFeat_endOffset == null)
      jcas.throwFeatMissing("endOffset", "types.Word");
    ll_cas.ll_setIntValue(addr, casFeatCode_endOffset, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Word_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_content = jcas.getRequiredFeatureDE(casType, "content", "uima.cas.String", featOkTst);
    casFeatCode_content  = (null == casFeat_content) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_content).getCode();

 
    casFeat_beginOffset = jcas.getRequiredFeatureDE(casType, "beginOffset", "uima.cas.Integer", featOkTst);
    casFeatCode_beginOffset  = (null == casFeat_beginOffset) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_beginOffset).getCode();

 
    casFeat_endOffset = jcas.getRequiredFeatureDE(casType, "endOffset", "uima.cas.Integer", featOkTst);
    casFeatCode_endOffset  = (null == casFeat_endOffset) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_endOffset).getCode();

  }
}



    