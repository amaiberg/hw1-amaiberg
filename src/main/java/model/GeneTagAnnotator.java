package model;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.Set;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import types.GeneSentence;
import types.GeneTag;
import com.aliasi.chunk.Chunk;
import com.aliasi.chunk.Chunker;
import com.aliasi.chunk.Chunking;
import com.aliasi.util.AbstractExternalizable;

/**
 * 
 * GeneTagAnnotator takes sentences as input, and uses LingPipe to run the
 * genetag.HmmChunker on them to extract gene-related chunks. It then ouputs
 * these chunks into the cas.
 * 
 * @author Avner Maiberg
 * 
 */

public class GeneTagAnnotator extends JCasAnnotator_ImplBase {

	private final String chunkerFilePath = "ne-en-bio-genetag.HmmChunker";

	/** Reads the in GeneSentences and then runs the HmmChunker to retrieve relevant gene mentions.
	 * It then stores those mentions inside the GeneTag type which is stored into the cas.
 */
	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		File f = null;
		try {
			f = new File(getClass().getClassLoader().getResource(chunkerFilePath).toURI().toString());
		} catch (URISyntaxException e1) {
				e1.printStackTrace();
		}
		try {
			Chunker chunker = (Chunker) AbstractExternalizable.readObject(f);
			Iterator sentenceIter = aJCas.getAnnotationIndex(GeneSentence.type)
					.iterator();
			GeneSentence gs = (GeneSentence) sentenceIter.next();
			String sentence = gs.getSentence();
			Chunking chunking = chunker.chunk(sentence);
			Set<Chunk> chunkSet = chunking.chunkSet();
			for (Chunk c : chunkSet)
				if (c != null) {
					GeneTag gt = new GeneTag(aJCas);
					String tag = sentence.substring(c.start(), c.end());
					gt.setTag(tag);
					gt.addToIndexes();
					// System.out.println("tag: " + tag);

				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
