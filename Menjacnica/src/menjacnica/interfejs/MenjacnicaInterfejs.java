package menjacnica.interfejs;

import java.util.GregorianCalendar;

import menjacnica.Kurs;

public interface MenjacnicaInterfejs {
	public void dodajKursValuteZaDan(Kurs novi, String nazivValute);
	public void obrisiKursValuteZaDan(GregorianCalendar datum, String nazivValute);
	public Kurs vratiKursValuteZaDan(GregorianCalendar datum, String nazivValute);
}
