/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package readers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.collection.CollectionException;
import org.apache.uima.collection.CollectionReader_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.DocumentAnnotation;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.util.FileUtils;
import org.apache.uima.util.Progress;
import org.apache.uima.util.ProgressImpl;

/**
 * Based on the UIMA examples FileSystemCollectionReader,
 * SentenceCollectionReader reads from the input file sentence-by-sentence and
 * outputs sentences into the CAS.
 * 
 * <ul>
 * <li><code>InputFile</code> - path to file containing sentences.</li>
 * 
 * 
 */
public class SentenceCollectionReader extends CollectionReader_ImplBase {
	/**
	 * Name of configuration parameter that must be set to the path of a file
	 * containing input sentences.
	 */
	public static final String PARAM_INPUTFILE = "InputFile";

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
	public static final String PARAM_SUBDIR = "BrowseSubdirectories";

	private String mEncoding;

	private String mLanguage;

	private int mCurrentIndex, numSentences;
	private String text[];

	/**
	 * @see org.apache.uima.collection.CollectionReader_ImplBase#initialize()
	 */
	@Override
	public void initialize() throws ResourceInitializationException {
		File file = new File(
				((String) getConfigParameterValue(PARAM_INPUTFILE)).trim());
		mEncoding = (String) getConfigParameterValue(PARAM_ENCODING);
		mLanguage = (String) getConfigParameterValue(PARAM_LANGUAGE);
		// get list of files in the specified directory, and subdirectories if
		// the
		// parameter PARAM_SUBDIR is set to True
		try {
			text = FileUtils.file2String(file, mEncoding).split("\n");
			numSentences = text.length;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @see org.apache.uima.collection.CollectionReader#hasNext()
	 */
	@Override
	public boolean hasNext() {
		return mCurrentIndex < numSentences;
	}

	/**
	 * Reads the next sentence from the input file, and outputs into the CAS.
	 * 
	 * @see org.apache.uima.collection.CollectionReader#getNext(org.apache.uima.cas.CAS)
	 */
	@Override
	public void getNext(CAS aCAS) throws IOException, CollectionException {
		JCas jcas;
		try {
			jcas = aCAS.getJCas();
		} catch (CASException e) {
			throw new CollectionException(e);
		}

		// put document in CAS
		jcas.setDocumentText(text[mCurrentIndex]);
		mCurrentIndex++;
		// set language if it was explicitly specified as a configuration
		// parameter
		if (mLanguage != null) {
			((DocumentAnnotation) jcas.getDocumentAnnotationFs())
					.setLanguage(mLanguage);
		}

	}

	/**
	 * @see org.apache.uima.collection.base_cpm.BaseCollectionReader#close()
	 */
	@Override
	public void close() throws IOException {
	}

	/**
	 * @see org.apache.uima.collection.base_cpm.BaseCollectionReader#getProgress()
	 */
	@Override
	public Progress[] getProgress() {
		return new Progress[] { new ProgressImpl(mCurrentIndex,0,
				Progress.ENTITIES) };
	}

}
