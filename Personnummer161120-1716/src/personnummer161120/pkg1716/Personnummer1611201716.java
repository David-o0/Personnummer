/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnummer161120.pkg1716;

import java.util.Scanner;

/**
 *
 * @author _o0
 */
public class Personnummer1611201716 {

    /**
     * @param args the command line arguments
     */
    	public static void main(String[] args) {

		while (true) {

			System.out.println("Mata in ditt personnummer 12 siffror 'ÅÅÅÅMMDD-xxxx' eller 'ÅÅÅÅMMDDxxxx");
			Scanner scan = new Scanner(System.in);
                        String personNummer = scan.nextLine();
			personNummer = personNummer.replaceAll("-", "").trim();

			if (KorrektPersonNummer.nummerValidering(personNummer)) {
				if (KorrektPersonNummer.datumValidering(personNummer)) {
					KorrektPersonNummer.checkNumber(personNummer);
					break;
				}

			}

		}

	}
}
