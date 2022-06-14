package jana60.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Chiedere all0utente di inserire i valori di base e altezza

		Scanner scan = new Scanner(System.in);
		Rettangolo nuovoRettangolo = new Rettangolo();
		int altezzaUtenteRettangolo = 0;

		int baseUtenteRettangolo = 0;
		System.out.print("Inserisci la base del rettangolo: ");
		altezzaUtenteRettangolo = scan.nextInt();
		System.out.print("Inserisci l'altezza del rettangolo: ");
		baseUtenteRettangolo = scan.nextInt();
		nuovoRettangolo.altezza = altezzaUtenteRettangolo;
		nuovoRettangolo.base = baseUtenteRettangolo;
//Stampare a schermo area e perimetro del rettangolo
		System.out.println("L'area del rettangolo è: " + nuovoRettangolo.areaDelRettangolo());
		System.out.println("Il perimetro del rettangolo è: " + nuovoRettangolo.perimetroDelRettangolo());

		scan.close();
	}

}
