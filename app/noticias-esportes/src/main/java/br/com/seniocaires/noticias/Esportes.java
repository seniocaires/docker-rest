package br.com.seniocaires.noticias;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/esportes")
@Produces({ MediaType.APPLICATION_JSON + ";charset=utf-8" })
public class Esportes {

  @GET
  @Path("/all")
  public String noticias() {
    try {
		return "{\"noticias\":[{\"titulo\":\"Sem ta�as, Atl�tico encerra ano com quase R$ 23 milh�es em premia��o\"},{\"titulo\": \"Daniel despista sobre futuro de Pratto e cita investimento alto \"},{\"titulo\": \"Gilvan se ausenta de evento da Ta�a Brasil de 1966\"}], \"server\": {\"nome\":\"" + InetAddress.getLocalHost().getHostName() + "\"}}";
	} catch (UnknownHostException e) {
		Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
		return "";
	}
  }
}
