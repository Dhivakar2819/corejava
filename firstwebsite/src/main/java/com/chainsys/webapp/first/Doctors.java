package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.miniproject.commonutil.ExceptionManager;
import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.pojo.Doctor;

/**
 * Servlet implementation class Doctor
 */
public class Doctors extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Doctors() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		List<Doctor> allDoctor = DoctorDao.getAllDoctor();
		Iterator<Doctor> docIterator = allDoctor.iterator();
		while (docIterator.hasNext()) {
			Doctor doc = docIterator.next();
			out.println("</hr>");
			out.println(doc.getDoc_id() + " " + doc.getDoc_name() + " " + doc.getSpeciality() + " " + doc.getCity()
					+ " " + doc.getPhone_no() + " " + doc.getFees());
			out.println("</p>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Doctor newdoc = new Doctor();
		PrintWriter out = response.getWriter();
		if (request.getParameter("click").equals("ADD_DOC")) {
			String source="AddNewDoctor";
			String message="<h1>Error while "+source+"</h1>";
			try {
				String id = null;
				id = request.getParameter("id");
				try {
					Validator.checkStringForParseInt(id);
				} catch (InvalidInputDataException e) {
					message+="Message: "+e.getMessage();
					String errorPage=ExceptionManager.handleException(e, source, message);
					out.print(errorPage);
					return;
				}
				int doc_id = Integer.parseInt(id);
				try {
					Validator.CheckNumberForGreaterThanZero(doc_id);
				} catch (InvalidInputDataException e) {
					message+="Message: "+e.getMessage();
					String errorPage=ExceptionManager.handleException(e, source, message);
					out.print(errorPage);
					return;
				}
				newdoc.setDoc_id(doc_id);
				String Doc_name = null;
				Doc_name = request.getParameter("Doc_name");
				try {
					Validator.checkStringOnly(Doc_name);
				} catch (InvalidInputDataException e) {
					message+="Message: "+e.getMessage();
					String errorPage=ExceptionManager.handleException(e, source, message);
					out.print(errorPage);
					return;
				}
				newdoc.setDoc_name(Doc_name);
				SimpleDateFormat dateFormate = new SimpleDateFormat("dd/MM/yyyy");
				String DOB = request.getParameter("DOB");
				// Date hire_date=hire_dateFormate.parse(emp_HireDate);
				Date newDate = null;
				try {
					newDate = dateFormate.parse(DOB);
				} catch (ParseException e) {
					message+="Message: "+e.getMessage();
					String errorPage=ExceptionManager.handleException(e, source, message);
					out.print(errorPage);
					return;
				}

				newdoc.setDOB(newDate);
				String Speciality = null;
				Speciality = request.getParameter("Speciality");
				try {
					Validator.checkStringOnly(Speciality);
				} catch (InvalidInputDataException e) {
					message+="Message: "+e.getMessage();
					String errorPage=ExceptionManager.handleException(e, source, message);
					out.print(errorPage);
					return;
				}
				newdoc.setSpeciality(Speciality);
				String City = null;
				City = request.getParameter("City");
				try {
					Validator.checkStringOnly(City);
				} catch (InvalidInputDataException e) {
					message+="Message: "+e.getMessage();
					String errorPage=ExceptionManager.handleException(e, source, message);
					out.print(errorPage);
					return;
				}
				newdoc.setCity(City);
				String Phone_No = null;
				Phone_No = request.getParameter("Phone_No");
				try {
					Validator.checkStringForParseInt(Phone_No);
				} catch (InvalidInputDataException e) {
					message+="Message: "+e.getMessage();
					String errorPage=ExceptionManager.handleException(e, source, message);
					out.print(errorPage);
					return;
				}
				try {
					Validator.checkPhone(Phone_No);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();message+="Message: "+e.getMessage();
					String errorPage=ExceptionManager.handleException(e, source, message);
					out.print(errorPage);
					return;
				}
				Long Phone_no = Long.parseLong(Phone_No);
				try {
					Validator.CheckNumberForGreaterThanZero(Phone_no);
				} catch (InvalidInputDataException e) {
					message+="Message: "+e.getMessage();
					String errorPage=ExceptionManager.handleException(e, source, message);
					out.print(errorPage);
					return;
				}

				newdoc.setPhone_no(Phone_no);
				String Fee = null;
				Fee = request.getParameter("Fee");
				try {
					Validator.checkStringForParseInt(Fee);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();message+="Message: "+e.getMessage();
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
				newdoc.setFees(Fees);
				int result = DoctorDao.insertDoctor(newdoc);
				out.println("Record added : " + result);
			} catch (NumberFormatException e) {
				message+="Message: "+e.getMessage();
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
		} else if (request.getParameter("click").equals("UPDATE_DOC")) {
			doPut(request, response);
		}
		if (request.getParameter("click").equals("DELETE_DOC")) {
			doDelete(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Doctor newdoc = new Doctor();
		PrintWriter out = response.getWriter();
		String source="Update Doctor";
		String message="<h1>Error while "+source+"</h1>";
		try {
			String id = null;
			id = request.getParameter("id");
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException e) {
				message+="Message: "+e.getMessage();
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			int doc_id = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(doc_id);
			} catch (InvalidInputDataException e) {
				message+="Message: "+e.getMessage();
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			newdoc.setDoc_id(doc_id);
			String Doc_name = null;
			Doc_name = request.getParameter("Doc_name");
			try {
				Validator.checkStringOnly(Doc_name);
			} catch (InvalidInputDataException e) {
				message+="Message: "+e.getMessage();
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			newdoc.setDoc_name(Doc_name);
			SimpleDateFormat dateFormate = new SimpleDateFormat("dd/MM/yyyy");
			String DOB = request.getParameter("DOB");
			// Date hire_date=hire_dateFormate.parse(emp_HireDate);
			Date newDate = null;
			try {
				newDate = dateFormate.parse(DOB);
			} catch (ParseException e) {
				message+="Message: "+e.getMessage();
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}

			newdoc.setDOB(newDate);
			String Speciality = null;
			Speciality = request.getParameter("Speciality");
			try {
				Validator.checkStringOnly(Speciality);
			} catch (InvalidInputDataException e) {
				message+="Message: "+e.getMessage();
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			newdoc.setSpeciality(Speciality);
			String City = null;
			City = request.getParameter("City");
			try {
				Validator.checkStringOnly(City);
			} catch (InvalidInputDataException e) {
				message+="Message: "+e.getMessage();
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			newdoc.setCity(City);
			String Phone_No = null;
			Phone_No = request.getParameter("Phone_No");
			try {
				Validator.checkStringForParseInt(Phone_No);
			} catch (InvalidInputDataException e) {
				message+="Message: "+e.getMessage();
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			try {
				Validator.checkPhone(Phone_No);
			} catch (InvalidInputDataException e) {
				message+="Message: "+e.getMessage();
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			Long Phone_no = Long.parseLong(Phone_No);
			try {
				Validator.CheckNumberForGreaterThanZero(Phone_no);
			} catch (InvalidInputDataException e) {
				message+="Message: "+e.getMessage();
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}

			newdoc.setPhone_no(Phone_no);
			String Fee = null;
			Fee = request.getParameter("Fee");
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
			newdoc.setFees(Fees);
			int result = DoctorDao.updateDoctor(newdoc);
			out.println("Record added : " + result);
		} catch (NumberFormatException e) {
			message+="Message: "+e.getMessage();
			String errorPage=ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Doctor newdoc = new Doctor();
		PrintWriter out = response.getWriter();
		String source="Delete Doctor";
		String message="<h1>Error while "+source+"</h1>";
		String id = null;
		try {
			id = request.getParameter("id");
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException e) {
				message+="Message: "+e.getMessage();
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			int doc_id = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(doc_id);
			} catch (InvalidInputDataException e) {
				message+="Message: "+e.getMessage();
				String errorPage=ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			newdoc.setDoc_id(doc_id);
			int result = DoctorDao.deleteDoctor(doc_id);
			out.println("Records Deleted :" + result);

		} catch (Exception e) {
			message+="Message: "+e.getMessage();
			String errorPage=ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
	}

}
