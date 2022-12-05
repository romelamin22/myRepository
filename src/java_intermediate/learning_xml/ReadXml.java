package java_intermediate.learning_xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.print.Doc;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class ReadXml {

    public static void main(String[] args) {

        File xmlFile = new File("C:\\Users\\PNT\\IdeaProjects\\my_very_first_project\\src\\java_intermediate\\learning_xml\\xml_files\\data.xml");

        DocumentBuilderFactory dbF = DocumentBuilderFactory.newInstance();

        try {


            DocumentBuilder dB = dbF.newDocumentBuilder();

            Document doc = dB.parse(xmlFile);

            //System.out.println(doc.getDocumentElement().getNodeName());

            NodeList nl = doc.getElementsByTagName("idpass");

            for (int a = 0; a < nl.getLength(); a++){

                Node nN = nl.item(a);

                Element ele = (Element) nN;

                System.out.println(ele.getElementsByTagName("user").item(0).getTextContent());
                System.out.println(ele.getElementsByTagName("pass").item(0).getTextContent());
                System.out.println("--------");

            }


        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }

    }




}
