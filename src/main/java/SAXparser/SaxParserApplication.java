package SAXparser;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class SaxParserApplication {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        SaxParserDemo demoParser = new SaxParserDemo();
        parser.parse(SaxParserDemo.getFileForParse(),demoParser);
        demoParser.getListFromParse().forEach(a->{
            System.out.println(a.login);
            System.out.println(a.position);
            System.out.println(a.company);
        });

    }
    }
