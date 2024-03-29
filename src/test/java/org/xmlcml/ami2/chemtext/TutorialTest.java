package org.xmlcml.ami2.chemtext;


public class TutorialTest {

//	@Test
//	public void testSpecies() throws Exception {
//		FileUtils.copyDirectory(new File(Fixtures.TEST_AMI_DIR, "tutorial/plos10"), new File("target/species10"));
//		String args = "-q target/species10 -i scholarly.html --sp.species --context 35 50 --sp.type binomial genus genussp";
//		SpeciesPlugin speciesPlugin = new SpeciesPlugin(args);
//		speciesPlugin.runAndOutput();
//		Fixtures.compareExpectedAndResults(new File(Fixtures.TEST_AMI_DIR, "tutorial/plos10/e0115544"), 
//				new File("target/species10/e0115544"), "species/binomial", Fixtures.RESULTS_XML);
//	}
//	
//	@Test
//	@Ignore // not working
//	public void testSpeciesLookup() throws Exception {
//		FileUtils.copyDirectory(new File("src/test/resources/org/xmlcml/ami2/tutorial/plos10"), new File("target/specieslook10"));
//		String args = "-q target/specieslook10 -i scholarly.html --sp.species --context 35 50 --sp.type binomial genus genussp --lookup wikipedia genbank";
//		SpeciesPlugin speciesPlugin = new SpeciesPlugin(args);
//		speciesPlugin.runAndOutput();
//		
//	}
//	
//	@Test
//	// FIXME
//	public void testRegex() throws Exception {
//		FileUtils.copyDirectory(new File("src/test/resources/org/xmlcml/ami2/tutorial/plos10"), new File("target/regex10"));
//		String args = "-q target/regex10/ -i scholarly.html --context 35 50 --r.regex regex/consort0.xml";
//		RegexPlugin regexPlugin = new RegexPlugin(args);
//		regexPlugin.runAndOutput();
//		/** omit as slightly different outout.
//		Fixtures.compareExpectedAndResults(new File(Fixtures.TEST_AMI_DIR, "tutorial/plos10/e0115544"), 
//				new File("target/regex10/e0115544"), "regex/consort0", Fixtures.RESULTS_XML);
//				*/
//	}
//	
//	@Test
//	public void testIdentifier() throws Exception {
//		FileUtils.copyDirectory(new File("src/test/resources/org/xmlcml/ami2/tutorial/plos10"), new File("target/ident10"));
//		String args = "-q target/ident10/ -i scholarly.html --context 35 50 --id.identifier --id.regex regex/identifiers.xml --id.type bio.ena";
//		IdentifierPlugin identifierPlugin = new IdentifierPlugin(args);
//		identifierPlugin.runAndOutput();
//		Fixtures.compareExpectedAndResults(new File(Fixtures.TEST_AMI_DIR, "tutorial/plos10/e0115544"), 
//				new File("target/ident10/e0115544"), "identifier/bio.ena", Fixtures.RESULTS_XML);
//		
//	}
//	
//	@Test
//	public void testIdentifierClin() throws Exception {
//		FileUtils.copyDirectory(new File("src/test/resources/org/xmlcml/ami2/tutorial/plos10"), new File("target/clin10"));
//		String args = "-q target/clin10/ -i scholarly.html --context 35 50 --id.identifier --id.regex regex/identifiers.xml --id.type clin.nct clin.isrctn";
//		IdentifierPlugin identifierPlugin = new IdentifierPlugin(args);
//		identifierPlugin.runAndOutput();
//		Fixtures.compareExpectedAndResults(new File(Fixtures.TEST_AMI_DIR, "tutorial/plos10/e0115544"), 
//				new File("target/clin10/e0115544"), "identifier/clin.nct", Fixtures.RESULTS_XML);
//	}
//		
//	@Test
//	// FIXME
//
//	public void testBagOfWords() throws Exception {
//		FileUtils.copyDirectory(new File("src/test/resources/org/xmlcml/ami2/tutorial/plos10"), new File("target/word10"));
//		String args = "-q target/word10/"
//				+ " -i scholarly.html"
//				+ " --context 35 50"
//				+ " --w.words wordFrequencies"
//				+ " --w.stopwords /org/xmlcml/ami2/plugins/word/stopwords.txt";
//		WordPlugin wordPlugin = new WordPlugin(args);
//		wordPlugin.runAndOutput();
//		Fixtures.compareExpectedAndResults(new File(Fixtures.TEST_AMI_DIR, "tutorial/plos10/e0115544"), 
//				new File("target/word10/e0115544"), "word/frequencies", Fixtures.RESULTS_XML);
//	}
//
//	@Test
//	// FIXME
//
//	public void testBagOfWordsNatureNano() throws Exception {
//		FileUtils.copyDirectory(new File("src/test/resources/org/xmlcml/ami2/nature/nnano"), new File("target/nature/nnano"));
//		String args = "-q target/nature/nnano/"
//				+ " -i scholarly.html"
//				+ " --context 35 50"
//				+ " --w.words wordFrequencies"
//				+ " --w.stopwords /org/xmlcml/ami2/plugins/word/stopwords.txt";
//		WordPlugin wordPlugin = new WordPlugin(args);
//		wordPlugin.runAndOutput();
//	}
//	
//
//	@Test
//	public void testGene() throws Exception {
//		FileUtils.copyDirectory(new File("src/test/resources/org/xmlcml/ami2/tutorial/plos10"), new File("target/gene10"));
//		String args = "-q target/gene10/ -i scholarly.html --context 35 50 --g.gene --g.type human mouse";
//		GenePlugin genePlugin = new GenePlugin(args);
//		genePlugin.runAndOutput();
//		Fixtures.compareExpectedAndResults(new File(Fixtures.TEST_AMI_DIR, "tutorial/plos10/e0115544"), 
//				new File("target/gene10/e0115544"), "gene/human", Fixtures.RESULTS_XML);
//		
//	}
//	
//	@Test
//	public void testNorma() throws IOException {
//			FileUtils.copyDirectory(new File("src/test/resources/org/xmlcml/ami2/tutorial/plos10"), new File("target/word10a"));
//			String args = "-q target/word10a/"
//					+ " -i fulltext.xml"
//					+ " --w.words wordFrequencies"
//					+ " -o scholarly.html";
//			AMIArgProcessor amiArgProcessor = new WordArgProcessor(args);
//			amiArgProcessor.runAndOutput();
//	}
}
