package br.com.seniocaires.noticias;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/news")
@Produces({ MediaType.APPLICATION_JSON + ";charset=utf-8" })
public class Recentes {

  @GET
  @Path("/all")
  public String noticiasRecentes() {
    try {
		return "{\"noticias\":[{\"titulo\":\"Governo desiste de nomear deputado tucano  depois de pressão\"},{\"titulo\": \"Secretário do Audiovisual Alfredo Bertini pede demissão do MinC\"}], \"server\": {\"nome\":\"" + InetAddress.getLocalHost().getHostName() + "\"}}";
	} catch (UnknownHostException e) {
		Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
		return "";
	}
  }
}
