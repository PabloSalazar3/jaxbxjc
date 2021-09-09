package com.unosquare.trainihs.jaxb;

import com.bharatthippireddy.patient.Patient;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class JAXBDemo {
    public static void main(String[] args) {
        try {
            JAXBContext context = JAXBContext.newInstance(Patient.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
