package controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.forage.dao.IClientLocal;
import sn.forage.dao.IVillageLocal;
import sn.forage.entities.Client;
import sn.forage.entities.Village;

/**
 * Servlet implementation class ClientServlet
 */
@WebServlet("/Client")
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="SenForage_UP")
	private EntityManager em;
	
	@EJB
	private IClientLocal client_dao;
	@EJB
	private IVillageLocal village_dao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        request.setAttribute("listeVillage",village_dao.liste());
		
		request.setAttribute("clients",client_dao.liste());
		
request.getRequestDispatcher("/WEB-INF/client/addClient.jsp").forward(request, response);
		

	 }			
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		 String nom = request.getParameter("nom").toString();
		 String prenom = request.getParameter("prenom").toString();
		 int idvillage = Integer.parseInt(request.getParameter("village"));
		 String adresse = request.getParameter("adresse").toString();
		 String tel = request.getParameter("tel").toString();
		 
		 Client client = new Client();
		
		 client.setNom(nom);
		 client.setPrenom(prenom);
		 client.setAdresse(adresse);
		 client.setTel(tel);
		 client.setVillage((Village)em.createQuery("SELECT c FROM Village c where c.id=:id").setParameter("id", idvillage).getSingleResult());
		 
		 int ok = client_dao.add(client);

			
	

			

		request.setAttribute("clients", client_dao.liste());

		 doGet(request, response);
	}
	
}
