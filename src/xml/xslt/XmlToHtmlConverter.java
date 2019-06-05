package xml.xslt;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

public class XmlToHtmlConverter {

    public static void main(String args[]) {
        Source xml = new StreamSource(new File("Hello.xml"));
        Source xslt = new StreamSource("Hello.xsl");

        convertXMLToHTML(xml, xslt);

    }

    public static void convertXMLToHTML(Source xml, Source xslt) {
        StringWriter sw = new StringWriter();

        try {
            FileWriter fw = new FileWriter("Hello.html");
            TransformerFactory tFactory = TransformerFactory.newInstance();
            Transformer transformer = tFactory.newTransformer(xslt);
            transformer.transform(xml, new StreamResult(sw));
            fw.write(sw.toString());
            fw.close();

            System.out.println("Hello.html generated successfully");
        } catch (IOException | TransformerFactoryConfigurationError | TransformerException e) {
            e.printStackTrace();
        }
    }
}