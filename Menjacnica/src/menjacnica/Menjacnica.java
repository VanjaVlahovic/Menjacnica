package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {
	private LinkedList<Kurs> kursevi = new LinkedList<Kurs>();
	@Override
	public void dodajKursValuteZaDan(Kurs novi, String nazivValute) {
		if (!kursevi.contains(novi))
			kursevi.add(novi);
		else
			throw new RuntimeException("Ovaj kurs vec postoji u listi kurseva");
	}

	@Override
	public void obrisiKursValuteZaDan(GregorianCalendar datum, String nazivValute) {
		// TODO Auto-generated method stub

	}

	@Override
	public Kurs vratiKursValuteZaDan(GregorianCalendar datum, String nazivValute) {
		// TODO Auto-generated method stub
		return null;
	}

}
