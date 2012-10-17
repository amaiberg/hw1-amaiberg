package model;

import java.util.Arrays;
import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import types.GeneSentence;
import types.SentenceId;
import types.Word;

/**
 * 
 * GeneSentenceAnnotator is a simple analysis engine that takes 
 * a sentence from collection reader and outputs the SentenceId,
 * constituent Words, and non-whitespace character offsets from 
 * the beginning of the sentence.
 * 
 * @author Avner Maiberg
 *
 */

public class GeneSentenceAnnotator extends JCasAnnotator_ImplBase {

	@Override
	public void initialize(UimaContext mContext) {

	}
	
	/**
	 * Reads in sentences from the collection reader and separately stores
	 * the sentenceId, the sentence content, and the words into types that
	 * are output into the CAS. 
	 * 
	 */

	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		String sentence = aJCas.getDocumentText();
		GeneSentence gs = new GeneSentence(aJCas);
		gs.setBegin(0);
		gs.setEnd(sentence.length());
		
		String[] words = sentence.split(" ");
		String id = words[0];
		SentenceId sid = new SentenceId(aJCas);
		sid.setId(id);
		sid.addToIndexes();
		gs.setSentence_id(sid);
	
		
		String[] content_arr = Arrays.copyOfRange(words, 1, words.length);
		String content ="";
		int begin =0;
		for (String s : content_arr) {
			Word w = new Word(aJCas);
			w.setContent(s);
			w.setBeginOffset(begin);
			w.setEnd(begin + s.length());
			w.addToIndexes();
			begin+= s.length();
			
			content += s + " ";
		}
		
		gs.setSentence(content);
		gs.addToIndexes();
	}



}
