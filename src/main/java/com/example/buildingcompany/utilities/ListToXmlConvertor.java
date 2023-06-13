package com.example.buildingcompany.utilities;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;

import java.io.IOException;
import java.util.List;

public class ListToXmlConvertor {
    public static <T> String convertJsonToXml(List<T> listOfObjects) {
        try {
            XmlMapper xmlMapper = new XmlMapper();
            xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);
            xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_1_1, true);
            xmlMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
            return xmlMapper.writeValueAsString(listOfObjects);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
