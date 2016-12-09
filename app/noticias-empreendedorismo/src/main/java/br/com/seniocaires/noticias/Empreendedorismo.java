package br.com.seniocaires.noticias;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/empreendedorismo")
@Produces({ MediaType.APPLICATION_JSON + ";charset=utf-8" })
public class Empreendedorismo {

  @GET
  @Path("/all")
  public String noticias() {
    try {
		return "{\"noticias\":[{\"titulo\":\"É a vez do e-commerce de pets; vendas crescem até 35% ao ano\"},{\"titulo\": \"Balada Empreendedora aproxima jovens empreendedores e investidores \"}], \"server\": {\"nome\":\"" + InetAddress.getLocalHost().getHostName() + "\"}}";
	} catch (UnknownHostException e) {
		Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
		return "";
	}
  }
}
