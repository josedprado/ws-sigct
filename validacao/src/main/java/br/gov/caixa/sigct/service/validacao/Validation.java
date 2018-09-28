package br.gov.caixa.sigct.service.validacao;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Calendar;

public class Validation {
	
	public static void main(String[] args) {
		
		System.out.println("26/09/2018 10:00 é uma data valida? " + isDateValid("26/09/2018 10:00"));
		System.out.println("30/02/2018 11:00 é uma data valida? " + isDateValid("30/02/2018 11:00"));
		System.out.println("31/09/2018 13:30 é uma data valida? " + isDateValid("31/09/2018 13:30"));
		System.out.println("22/10/2018 15:00 é uma data valida? " + isDateValid("22/10/2018 15:00"));	
		System.out.println("30/13/2018 17:59 é uma data valida? " + isDateValid("30/13/2018 17:59"));
		isValid("SP");
		isValid("SIABM");
		isValid("SP201803919");
		isValid("1");
		isValid("Manutenção Evolutiva*");
		isValid("Pacote de Trabalho*");
		isValid("");
		isValid("");
		isValid("Única*");
		isDateValid("10/08/2018  17:19:00");			
		
	}
	
	public static boolean isValid(String content) {
		
		if(content == null || content.trim().equals("")) {
			
			//System.out.println("Não é válida");
			return false;
			
		} else {
			
			//System.out.println("Válida");
			return true;
		}

    }
	
	public static boolean isDateValid(String strDate) {
		String dateFormat = "dd/MM/uuuu HH:mm";
			
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		java.util.Date hora = Calendar.getInstance().getTime(); 
		String dataFormatada = sdf.format(hora);
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter
			    .ofPattern(dateFormat)
			    .withResolverStyle(ResolverStyle.STRICT);
			    try {
			        LocalDate date = LocalDate.parse(strDate, dateTimeFormatter);
			        return true;
			    } catch (DateTimeParseException e) {

		return false;
			    }
		}

}