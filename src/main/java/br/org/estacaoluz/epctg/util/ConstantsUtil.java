package br.org.estacaoluz.epctg.util;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ConstantsUtil {
	
	//Email Service
	public static final String SERVICE_MAIL_ADDRESS = "gleydsonsr@gmail.com";
	public static final String SERVICE_MAIL_PASSWORD = "kkevlyyvewbiknde";
	public static final String SERVICE_MAIL_NAME = "Gleydson Rodrigues";
	
	//SchoolYear
	public static final String SCHOOL_YEAR_STATUS_IN_PROGRESS = "inProgress";
	public static final String SCHOOL_YEAR_STATUS_COMPLETED = "completed";
	
	//Database
	public static final String DATABASE_HOST = "jdbc:mysql://localhost:3306/epctg?autoReconnect=true&useSSL=false";
	public static final String DATABASE_USERNAME = "root";
	public static final String DATABASE_PASSWORD = "root";
	
	//end-points
	public static final String API = "/api";
	public static final String ADDRESS = "/address";
	public static final String ADMINISTRATOR = "/administrator";
	public static final String ANNUAL_NOTES = "/annual-notes";
	public static final String CONTACT_INFORMATION = "/contact-information";
	public static final String DISCIPLINE = "/discipline";
	public static final String EMAIL = "/email";
	public static final String RELATIVE = "/relative";
	public static final String SCHOOL_CLASS = "/school-class";
	public static final String SCHOOL_YEAR = "/school-year";
	public static final String STUDENT = "/student";
	public static final String TEACHER = "/teacher";
	
	//Exceptions
	public static final String ADMINISTRATOR_NOT_FOUND_EXCEPTION = "Administrador não encontrado";
	
}
