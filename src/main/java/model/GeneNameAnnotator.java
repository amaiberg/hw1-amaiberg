package model;

import java.util.Iterator;
import java.util.Map;
import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
import types.GeneTerm;
import types.SentenceId;
import types.Word;

/**
 * GeneNameAnnotator takes a sentence containing gene mentions 
 * and runs the PosTagNamedEntityRecognizer to find relevant 
 * gene terms. Unfortunately, since performance was better with
 * the GeneTagAnnotator alone, this analysis engine is currently
 * superfluous. However, it may prove to be more useful if other 
 * components were added to the pipeline in the future. It is still
 * included as part of the pipeline to demonstrate functionality.
 * 
 * @author Avner Maiberg
 *
 */

public class GeneNameAnnotator extends JCasAnnotator_ImplBase {

	private PosTagNamedEntityRecognizer neRecognizer;

	@Override
	public void initialize(UimaContext mContext) {
		try {
			neRecognizer = new PosTagNamedEntityRecognizer();
		} catch (ResourceInitializationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	/**
	 * Reads in GeneSentences and runs StanfordCoreNLP pipeline on them.
	 * It then outputs the results in the from of GeneNames into the cas.
	 * 
	 */

	@Override
	public void process(JCas aJcas) throws AnalysisEngineProcessException {

		String docText = aJcas.getDocumentText();
		int i = 0;

		Iterator wordIterator = aJcas.getAnnotationIndex(Word.type).iterator(
				false);

		Iterator sentenceIds = aJcas.getAnnotationIndex(SentenceId.type)
				.iterator(false);
		SentenceId sid = (SentenceId) sentenceIds.next();
		sid.addToIndexes();
		while (wordIterator.hasNext()) {
			Word w = (Word) wordIterator.next();
			String word = w.getContent();
			Map<Integer, Integer> geneSpans = neRecognizer.getGeneSpans(word);
			GeneTerm gt = new GeneTerm(aJcas);
			if (!geneSpans.isEmpty()) {
				gt.setTerm(word);
				gt.addToIndexes();
			}
		}

	}
}
