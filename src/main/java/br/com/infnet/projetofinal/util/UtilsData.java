package br.com.infnet.projetofinal.util;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class UtilsData {

    public static int retornarAnoAtual() {
        Calendar calendario = GregorianCalendar.getInstance();

        return calendario.get(Calendar.YEAR);
    }

}
