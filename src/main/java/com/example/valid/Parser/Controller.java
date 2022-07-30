package com.example.valid.Parser;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.IOException;
import java.io.InputStream;

@RestController
@Slf4j
public class Controller {

    @GetMapping(value="/spacestation", produces={"application/json"})
    Root root() throws XMLStreamException, IOException {
        InputStream xmlRessource = Controller.class.getClassLoader().getResourceAsStream("ews-valid.xml");
        XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();
        XMLStreamReader xmlStreamReader = xmlInputFactory.createXMLStreamReader(xmlRessource);

        XmlMapper mapper = new XmlMapper();
        Root root = mapper.readValue(xmlStreamReader, Root.class);

//        for(SpaceShip spaceShip : spaceStation.getSpaceships()){
//            spaceShip.setName(spaceShip.getName() + "Now For Sale!!");
//            spaceShip.getPrice().setValueOfShip(20.0d);
//        }
//        Item spaceShip = Item.getSpaceships().get(3);
//        String xmlString =  mapper.writerWithDefaultPrettyPrinter().writeValueAsString(spaceShip);
//        log.info("Heres the xml: \n" + xmlString);


        return root;
    }
}


