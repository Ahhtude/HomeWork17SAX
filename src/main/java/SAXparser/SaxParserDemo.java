package SAXparser;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SaxParserDemo extends DefaultHandler {
    private List<Worker> list =new ArrayList<Worker>();
    private Worker worker = new Worker();

    public List<Worker> getListFromParse() {
        return list;
    }

    String thisElement = "";
    static File fileForParse = new File( "/Users/sergey/IdeaProjects/HomeWork17SAX/src/main/resources/SAXparser/sax.xml");

    public static File getFileForParse() {
        return fileForParse;
    }

    public static void setFileForParse(File fileForParse) {
        SaxParserDemo.fileForParse = fileForParse;
    }

    @Override
    public void startDocument() throws SAXException {

    }

    @Override
    public void endDocument() throws SAXException {

    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("worker")){
            worker = new Worker();
        }
        thisElement = qName;

        if (qName.equals("additionalInfo")){
            worker.sinceYear = Integer.parseInt(attributes.getValue(0));
            worker.company = attributes.getValue(1);
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals("worker")){
            list.add(worker);
        }
        thisElement = "";

    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (thisElement.equals("login")) {
            worker.login = new String(ch, start, length);
        }
        if (thisElement.equals("position")) {
            worker.position = new String(ch, start, length);
        }
    }
}