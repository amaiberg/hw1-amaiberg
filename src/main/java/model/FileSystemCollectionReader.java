package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.collection.CollectionException;
import org.apache.uima.collection.CollectionReader_ImplBase;
import org.apache.uima.examples.SourceDocumentInformation;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.DocumentAnnotation;
import org.apache.uima.resource.ResourceConfigurationException;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.util.FileUtils;
import org.apache.uima.util.Progress;
import org.apache.uima.util.ProgressImpl;

import types.GeneSentence;

/**
 * A collection reader based off the UIMA examples FileSystemCollectionReader.
 * This collection readers differs from the UIMA one in that instead of passing
 * the entire file in the cas, it does so sentence-by-sentence, where each
 * sentence is defined by <code>mCurrrentIndex</code>.
 * 
 * <ul>
 * <li><code>InputDirectory</code> - path to directory containing files</li>
 * 
 * @author Avner Maiberg (based on UIMA examples)
 */
public class FileSystemCollectionReader extends CollectionReader_ImplBase {
	/**
	 * Name of configuration parameter that must be set to the path of a
	 * directory containing input files.
	 */
	public static final String PARAM_INPUTDIR = "InputDirectory";

	/**
	 * Name of configuration parameter that contains the character encoding used
	 * by the input files. If not specified, the default system encoding will be
	 * used.
	 */
	public static final String PARAM_ENCODING = "Encoding";

	/**
	 * Name of optional configuration parameter that contains the language of
	 * the documents in the input directory. If specified this information will
	 * be added to the CAS.
	 */
	public static final String PARAM_LANGUAGE = "Language";

	/**
	 * Name of optional configuration parameter that indicates including the
	 * subdirectories (recursively) of the current input directory.
	 */


	private String mEncoding;

	private String mLanguage;

	private int mCurrentIndex;

	private int numSentences;

	private String[] sentences;

	/**
	 * @see org.apache.uima.collection.CollectionReader_ImplBase#initialize()
	 */
	public void initialize() throws ResourceInitializationException {

		// open input file
		mCurrentIndex = 0;
		String model = (String) getConfigParameterValue(PARAM_INPUTDIR);
		FileInputStream frs = (FileInputStream)getClass().getResourceAsStream(model);
		
		String text = "";
		Scanner s = new Scanner(frs);
		while(s.hasNext()){
			text += s.nextLine();
		}
	
		//split on newline
		sentences = text.split("\n");

		numSentences = sentences.length;

	}

	/**
	 * @see org.apache.uima.collection.CollectionReader#hasNext()
	 */
	public boolean hasNext() {
		return mCurrentIndex < numSentences;
	}

	/**
	 * @see org.apache.uima.collection.CollectionReader#getNext(org.apache.uima.cas.CAS)
	 */
	public void getNext(CAS aCAS) throws IOException, CollectionException {
		JCas jcas;
		try {
			jcas = aCAS.getJCas();
		} catch (CASException e) {
			throw new CollectionException(e);
		}

		jcas.setDocumentText(sentences[mCurrentIndex]);

		mCurrentIndex++;
		// set language if it was explicitly specified as a configuration
		// parameter
		if (mLanguage != null) {
			((DocumentAnnotation) jcas.getDocumentAnnotationFs())
					.setLanguage(mLanguage);
		}

	}

	@Override
	public Progress[] getProgress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		
	}




}
