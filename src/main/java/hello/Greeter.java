package hello;

public class Greeter {

	Counter lugeja = new Counter();

	public String ytleTere(String name) {
		int pikkus;


		try {
			pikkus = lugeja.CountLugeja(name);
		} catch (Exception x) {
			return "Oops";
		}

			if (0 == pikkus || pikkus <= 1 ) {
				return "Su nimes on midagi mäda";
			} else if (pikkus > 15) {
				return " Su nimi on liiga pikk, see ei ole võimalik";

			} else if (2 <= pikkus || pikkus <= 15) {
				return "Hello world!";

			} else {
				return "Ütlen Tere!";
			}
		}
	}

