package sn.SenForage.controller;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.SenForage.dao.IUser;
import sn.SenForage.dao.IVillage;
import sn.SenForage.dao.UserImpl;
import sn.SenForage.dao.VillageImpl;
import sn.SenForage.entities.Client;
import sn.SenForage.entities.User;
import sn.SenForage.entities.Village;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(urlPatterns = "/Login", name = "loginservlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserServlet() {
		super();

	}

	private IUser userdao;

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("SenForagePU");
	EntityManager em = emf.createEntityManager();

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		userdao = new UserImpl();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/user/Login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*
		 * String email = request.getParameter("email ").toString(); String password =
		 * request.getParameter("password ").toString();
		 * 
		 * 
		 * User user = new User(); user.setNom(nom); user.setPrenom(prenom);
		 * user.setEmail(email); user.setPassword(password);
		 * 
		 * int ok = userdao.add(user);
		 * 
		 * User user = userdao.getUserByEmailAndPassword(email,password);
		 * 
		 * if ( user != null) {
		 * 
		 * request.getRequestDispatcher("index.jsp").forward(request, response);
		 * 
		 * doPost(request, response); }
		 */

	}

}
