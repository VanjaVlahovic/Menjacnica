package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {
	private LinkedList<Valuta> valute = new LinkedList<Valuta>();
	private LinkedList<Kurs> kursevi = new LinkedList<Kurs>(); 
	@Override
	public void dodajKursValuteZaDan(Kurs novi, String nazivValute) {
		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).getNaziv().equals(nazivValute))
				kursevi.add(novi);			
		}
	}

	@Override
	public void obrisiKursValuteZaDan(GregorianCalendar datum, String nazivValute) {
		for (int i = 0; i < valute.size(); i++) 
			if (valute.get(i).getNaziv().equals(nazivValute))
				for (int j = 0; j < kursevi.size(); j++) 
					if (kursevi.get(j).getDatum().equals(datum))
						kursevi.remove(j);

	}

	@Override
	public Kurs vratiKursValuteZaDan(GregorianCalendar datum, String nazivValute) {
		for (int i = 0; i < valute.size(); i++) 
			if (valute.get(i).getNaziv().equals(nazivValute))
				for (int j = 0; j < kursevi.size(); j++) 
					if (kursevi.get(j).getDatum().equals(datum))
						return kursevi.get(j);
		return null;
	}

}
