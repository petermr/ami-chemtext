package org.xmlcml.ami2.chemtext;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.xmlcml.ami2.chem.ChemistryBuilder;
import org.xmlcml.ami2.chem.MoleculeCreator;
import org.xmlcml.ami2.plugins.graphicschem.GraphChemArgProcessor;
import org.xmlcml.cmine.args.ArgIterator;
import org.xmlcml.cmine.args.ArgumentOption;
import org.xmlcml.cmine.files.CMDir;
import org.xmlcml.cmine.files.ResultElement;
import org.xmlcml.cmine.files.ResultsElement;
import org.xmlcml.cml.element.CMLMolecule;
import org.xmlcml.graphics.svg.SVGElement;
import org.xmlcml.graphics.svg.SVGUtil;

/** 
 * Processes commandline arguments.
 * 
 * @author pm286
 */
public class TextChemArgProcessor extends GraphChemArgProcessor {
	
	public static final Logger LOG = Logger.getLogger(TextChemArgProcessor.class);
	
	private List<String> params;
	private SVGElement inputSvg;
	private CMLMolecule molecule;
	static {
		LOG.setLevel(Level.DEBUG);
	}

	// shouldn't be required // fails to inherit on Jenkins
	private static String WHITESPACE = "\\s+";
	
	public TextChemArgProcessor() {
		super();
	}

	public TextChemArgProcessor(String[] args) {
		this();
		parseArgs(args);
	}

	public TextChemArgProcessor(String argString) {
		this(argString.split(WHITESPACE));
// dummy
	}

	// =============== METHODS ==============

	public void parseChem(ArgumentOption option, ArgIterator argIterator) {
		params = argIterator.createTokenListUpToNextNonDigitMinus(option);
		LOG.debug("parseChem args "+params);
	}
	
	public void runChem(ArgumentOption option) {
		File svgFile = currentCMDir.getExistingFileWithReservedParentDirectory(inputList.get(0));
		LOG.trace("SVG File: "+svgFile + "/"+ inputList.get(0));
		inputSvg = null;
		try {
			inputSvg = SVGUtil.parseToSVGElement(new FileInputStream(svgFile));
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Cannot read SVG file: "+svgFile, e);
		}
		ChemistryBuilder geometryBuilder = new ChemistryBuilder(inputSvg);
		MoleculeCreator moleculeCreator = new MoleculeCreator(geometryBuilder);
		molecule = moleculeCreator.createMolecule();
	}

	public void outputChem(ArgumentOption option) {
		LOG.debug("outputChem "+option);
		String outputFilename = getOutput();
		if (!CMDir.isReservedFilename(outputFilename)) {
//			throw new RuntimeException("Output is not a reserved file: "+outputFilename);
			LOG.error("Output is not checked as reserved file: "+outputFilename);
		}
		ResultsElement resultsElement = new ResultsElement();
		ResultElement resultElement = new ResultElement();
		// meaningless - replace by chemistry
		
		resultElement.appendChild(molecule);
		resultsElement.appendChild(resultElement);
		File outputFile = new File(currentCMDir.getDirectory(), outputFilename);
		outputFile.getParentFile().mkdirs();
		LOG.debug("mkdir: "+outputFile+"; "+outputFile.exists()+"; "+outputFilename);
		getOrCreateContentProcessor().writeResults(outputFile, resultsElement);
	}
	
	// =============================

	@Override
	/** parse args and resolve their dependencies.
	 * 
	 * (don't run any argument actions)
	 * 
	 */
	public void parseArgs(String[] args) {
		super.parseArgs(args);
	}

	
}
