package jana60.geometria;

public class Rettangolo {
// attributi
	int base;
	int altezza;

// metodo che calcola e restituisce l'area del rettangolo
	int areaDelRettangolo() {
		return base * altezza;

	}

// metodo che calcola e restituisce il perimetro del rettangolo
	int perimetroDelRettangolo() {
		return (base + altezza) * 2;
	}
}
