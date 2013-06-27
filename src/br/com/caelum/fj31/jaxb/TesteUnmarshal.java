package br.com.caelum.fj31.jaxb;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


public class TesteUnmarshal {

	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		
		Produto produto = new Produto();
		produto.setNome("bola");
		produto.setPreco(20.34);
		produto.setDescricao("uma bola quadrada");
		
		JAXBContext context = JAXBContext.newInstance(Produto.class);
		Marshaller marsheller = context.createMarshaller();
		
		marsheller.marshal(produto, new FileOutputStream("bola.xml"));
		
	}

}
