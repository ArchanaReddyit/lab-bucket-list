package Controller;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TouristPlace;
import service.SetOperations;

@WebServlet(urlPatterns= {"/set"})

public class SetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Set<TouristPlace> set =new HashSet<TouristPlace>();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String destination = request.getParameter("travel");
		String rank = request.getParameter("rank");
		String add = request.getParameter("add");
		
		String sortbydestination = request.getParameter("sortbydestination");
		String sortbyrank = request.getParameter("sortbyrank");
		String remove = request.getParameter("delete");
		String reset = request.getParameter("reset");
		SetOperations SO=new SetOperations();
		System.out.println("Entering into list");
		TouristPlace tp=new TouristPlace(name,destination,rank);
		
		if(add!=null) {
			// call the add method and store the return value in a set variable
			System.out.println("calling add equals method");
			set=SO.add(tp);
			request.setAttribute("bucketList", set /*pass the return value */);
			request.setAttribute("message", "user added successfully");
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/set.jsp");
			rd.forward(request, response);
		}

		if(remove!=null) {
			// call the remove method and store the return value in a set variable
			set=SO.remove(tp);
			request.setAttribute("bucketList", set /*pass the return value */);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/set.jsp");
			rd.forward(request, response);
		}

		
		if(sortbydestination!=null) {
			// call the sortByDestination method and store the return value in a set variable
			@SuppressWarnings("unchecked")
			Set<TouristPlace> set1=(Set<TouristPlace>)SO.sortbydestination(set);
			
			request.setAttribute("bucketList", set1/*pass the return value */);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/set.jsp");
			rd.forward(request, response);
		}

		if(sortbyrank!=null) {
			// call the sortByRank method and store the return value in a set variable
			@SuppressWarnings("unchecked")
			Set<TouristPlace> set1=(Set<TouristPlace>)SO.sortbyrank(set);
			request.setAttribute("bucketList", set1/*pass the return value */);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/set.jsp");
			rd.forward(request, response);
		}

		if(reset!=null) {
			// call the reset method and store the return value in a set variable
			@SuppressWarnings("unchecked")
			Set<TouristPlace> set1=(Set<TouristPlace>)SO.reset(set);
			request.setAttribute("bucketList", set1/*pass the return value */);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/set.jsp");
			rd.forward(request, response);
		}

		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}



}
