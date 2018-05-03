package org.hoteles.services;

import org.hoteles.dao.HotelDAO;
import org.hoteles.domain.Hotel;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/vinos")
public class HotelServicio {

	HotelDAO dao = new HotelDAO();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Hotel> findAll() {
		return dao.findAll();
	}

	@GET @Path("search/{query}")
	@Produces(MediaType.APPLICATION_JSON)
	public Hotel findByName(@PathParam("query") String query) {
		return dao.findByName(query).get(0);
	}

	@GET @Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Hotel findById(@PathParam("id") int id) {
		System.out.println("findById " + id);
		return dao.findById(id);
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Hotel create(Hotel vino) {
		System.out.println("creando vino");
		return dao.save(vino);
	}

	@PUT @Path("{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Hotel update(Hotel hotel, @PathParam("id") int id) {
		System.out.println("Actualizando vino: " + hotel.getNombre());
		hotel.setId(id);
		dao.save(hotel);
		return hotel;
	}
	
	@DELETE @Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void remove(@PathParam("id") int id) {
		dao.remove(id);
	}
}