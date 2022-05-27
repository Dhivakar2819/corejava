package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.miniproject.commonutil.ExceptionManager;
import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.AppointmentDao;
import com.chainsys.miniproject.pojo.Appointment;

/**
 * Servlet implementation class Appointments
 */
public class Appointments extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Appointments() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		List<Appointment> applist = AppointmentDao.getAllAppointment();
		Iterator<Appointment> appItr = applist.iterator();
		while (appItr.hasNext()) {
			Appointment app = appItr.next();
			out.println(app.getApp_id() + " " + app.getDoc_id());
			out.println("</p>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();	
		Appointment app = new Appointment();
		if (request.getParameter("click").equals("ADD_APP")) {
			String source="AddNewAppointment";
			String message="<h1>Error while "+source+"</h1>";
			String id = request.getParameter("id");
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException e) {
				message+="Message: "+e.getMessage();
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			int app_id = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(app_id);
			} catch (InvalidInputDataException e) {
				message+="Message: "+e.getMessage();
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			app.setApp_id(app_id);
			Calendar c1 = Calendar.getInstance();
			java.util.Date newDate = c1.getTime();
			app.setApp_date(newDate);

			String docid = request.getParameter("docid");
			try {
				Validator.checkStringForParseInt(docid);
			} catch (InvalidInputDataException e) {
				message+="Message: "+e.getMessage();
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			int doc_id = Integer.parseInt(docid);
			try {
				Validator.CheckNumberForGreaterThanZero(doc_id);
			} catch (InvalidInputDataException e) {
				message+="Message: "+e.getMessage();
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			app.setDoc_id(doc_id);

			String pat_name =request.getParameter("pat_name");
			try {
				Validator.checkStringOnly(pat_name);
			} catch (InvalidInputDataException e) {
				message+="Message: "+e.getMessage();
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			app.setPatient_name(pat_name);
			String Fee = request.getParameter("fee");
			try {
				Validator.checkStringForParseInt(Fee);
			} catch (InvalidInputDataException e) {
				message+="Message: "+e.getMessage();
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			float Fees = Float.parseFloat(Fee);
			try {
				Validator.CheckNumberForGreaterThanZero(Fees);
			} catch (InvalidInputDataException e) {
				message+="Message: "+e.getMessage();
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			app.setFees_collected(Fees);
			int result = AppointmentDao.insertAppointment(app);
			out.println(result + "row inserted");
		}
	else if (request.getParameter("click").equals("UPDATE_APP")) {
		doPut(request,response);
	}
	else if (request.getParameter("click").equals("DELETE_APP")) {
		doDelete(request,response);}
		}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();	
		Appointment app = new Appointment();
		String source="Update Appointment";
		String message="<h1>Error while "+source+"</h1>";
			String id = request.getParameter("id");
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();message+="Message: "+e.getMessage();
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			int app_id = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(app_id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();message+="Message: "+e.getMessage();
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			app.setApp_id(app_id);
			Calendar c1 = Calendar.getInstance();
			java.util.Date newDate = c1.getTime();
			app.setApp_date(newDate);

			String docid = request.getParameter("docid");
			try {
				Validator.checkStringForParseInt(docid);
			} catch (InvalidInputDataException e) {
				message+="Message: "+e.getMessage();
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			int doc_id = Integer.parseInt(docid);
			try {
				Validator.CheckNumberForGreaterThanZero(doc_id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();message+="Message: "+e.getMessage();
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			app.setDoc_id(doc_id);

			String pat_name =request.getParameter("pat_name");
			try {
				Validator.checkStringOnly(pat_name);
			} catch (InvalidInputDataException e) {
				message+="Message: "+e.getMessage();
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			app.setPatient_name(pat_name);
			String Fee = request.getParameter("fee");
			try {
				Validator.checkStringForParseInt(Fee);
			} catch (InvalidInputDataException e) {
				message+="Message: "+e.getMessage();
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			float Fees = Float.parseFloat(Fee);
			try {
				Validator.CheckNumberForGreaterThanZero(Fees);
			} catch (InvalidInputDataException e) {
				message+="Message: "+e.getMessage();
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			app.setFees_collected(Fees);
			int result = AppointmentDao.updateAppointment(app);
			out.println(result + "row inserted");
		}
		
		

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Appointment app = new Appointment();
		String source="Delete Appointment";
		String message="<h1>Error while "+source+"</h1>";
		String id = request.getParameter("id");
		try {
			Validator.checkStringForParseInt(id);
		} catch (InvalidInputDataException e) {
			message+="Message: "+e.getMessage();
			String errorPage=ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
		int app_id = Integer.parseInt(id);
		try {
			Validator.CheckNumberForGreaterThanZero(app_id);
		} catch (InvalidInputDataException e) {
			message+="Message: "+e.getMessage();
			String errorPage=ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
		app.setApp_id(app_id);
		int result = AppointmentDao.deleteAppointment(app_id);
		out.println(result + "row deleted");
	}	

}
