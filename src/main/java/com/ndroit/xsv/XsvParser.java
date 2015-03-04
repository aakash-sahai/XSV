/**
 * 
 */
package com.ndroit.xsv;

import java.io.File;

import com.cedarsoftware.util.io.JsonWriter;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import com.ndroit.xsv.model.Drawing;

import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.ParsingException;
import nu.xom.ValidityException;

/**
 * @author Aakash Sahai
 *
 */
public class XsvParser {
	
	protected File file;
    private Builder builder;
    private Drawing drawing;
	
    protected XsvParser(File file) {
        super();
        this.file = file;
        this.builder = new Builder();
    }

    /**
     * Parses the File and initializes the object tree.
     *
     * @throws IOException
     * @throws ValidityException
     * @throws ParsingException
     */
    protected void parse() throws IOException, ValidityException, ParsingException, Exception {
    	Document doc = builder.build(this.file);
    	Element root = doc.getRootElement();
        if (root.getLocalName() != "drawing")
        	throw new Exception("The Root tag is now <drawing>");
        this.drawing = Drawing.parse(root);
    }


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String fname;
		Drawing drawing;
		
		if (args.length < 1) {
			fname = "sample.sch";
		} else {
			fname = args[1];
		}
		XsvParser parser = new XsvParser(new File(fname));
		try {
			parser.parse();
			Map map = new HashMap();
			map.put(JsonWriter.PRETTY_PRINT, true);
			String json = JsonWriter.objectToJson(parser.drawing, map);
			System.out.println(json);
		} catch(Exception ex) {
			System.out.println("Exception: " + ex.getMessage());
			ex.printStackTrace();
			System.exit(1);
		}
		System.exit(0);
	}

}
