import java.io.*;

import java.util.*;

public class EidolonCollection {
	private Eidolon[] eidolons;
	private int length;

	public EidolonCollection(String fileName) throws FileNotFoundException, IOException {
		// BufferedReader & a string to hold file contents

		String line;
		int currentMonster = 0;
		// Count so that we know how many Eidolons we have
		int lineCount = 0;

		// Meta Info
		String name;
		String type;
		String grade;
		int stars;
		int levels;

		// Eidolon Numerical stats
		int hp;
		int atk;
		int def;
		int crit;
		int eva;

		// ---------- Start reading the file here ---------- //
		File file = new File(fileName);
		Scanner fileScan = new Scanner(file);
		// fileScan.nextLine();
		// Fun fact: If a file is .csv, the scanner will automatically default
		// to using ","
		// as the delimiter! But we are using a .txt file, so we have to
		// manually
		// set it.
		fileScan.useDelimiter(",");

		// Loop until we have no more lines to read
		while (fileScan.hasNextLine()) {

			// Keeping track of the lines in our file... increment it!
			lineCount++;
			fileScan.nextLine();
		}
		fileScan.close();
		// We need to remake the scanner, because the first one is already at
		// the end of the file.
		// we can just re-use the old variable!
		fileScan = new Scanner(file);
		fileScan.useDelimiter(",");
		// We now know how many Eidolons we are looking at, so we can make the
		// empty collection.
		eidolons = new Eidolon[lineCount];

		// Loop until we have no more lines to read
		while (fileScan.hasNext()) {

			// We have to keep track of which monster we are on, so that we know
			// where to store it in our collection.
			currentMonster++;

			// Time for MENTAL JUGGLING WOOOOOOOOOO!!!
			// Remember, our delimiter is a ",". We can use this to our
			// advantage.
			// the .next() method returns everything until the next appearance
			// of our delimiter.
			// This means that we can step through the line, one Eidolon
			// property at a time.

			// Up to the first comma
			line = fileScan.next();
			name = line;

			// In between second and third comma
			line = fileScan.next();
			type = line;

			// In between third and fourth comma
			line = fileScan.next();
			grade = line;

			// Can you see how it's stepping through the line?
			//
			// Wait... our variable that we use for storing things is a String,
			// but
			// now we need an int! No problem, we can get around that. Read it
			// in as advantage
			// String, and parse it to an int.
			line = fileScan.next();
			stars = Integer.parseInt(line);

			line = fileScan.next();
			levels = Integer.parseInt(line);

			line = fileScan.next();
			hp = Integer.parseInt(line);

			line = fileScan.next();
			atk = Integer.parseInt(line);

			line = fileScan.next();
			def = Integer.parseInt(line);

			line = fileScan.next();
			crit = Integer.parseInt(line);

			line = fileScan.next();
			eva = Integer.parseInt(line);

			// Don't forget to put Eidolon into the collection!
			eidolons[currentMonster - 1] = new Eidolon(name, type, grade, stars, levels, hp, atk, def, crit, eva);

			// We have reached the end of one line. Time to move to the next
			// one.
			// fileScan.nextLine();
		}

		// Always close things!
		fileScan.close();
	}

	/**
	 * toString()
	 *
	 * @author Travis Guyer
	 */
	public int length() {
		int x = 0;
		x = eidolons.length;
		return x;
	}

	public void arrayByType() {
		String name;
		String type;
		String grade;
		int stars;
		int level;
		int hp;
		int atk;
		int def;
		int crit;
		int eva;
		String[] types = {"DMG", "CRIT", "HP", "EVA", "DEF"};
		int numberOfDmg = 0;
		int numberOfCrit = 0;
		int numberOfHp = 0;
		int numberOfEva = 0;
		int numberOfDef = 0;
		int countDmg = 0;
		int countCrit = 0;
		int countHp = 0;
		int countEva = 0;
		int countDef = 0;
		for (int i = 0; i < eidolons.length; i++) {

			if (eidolons[i].getType().equals("DMG")) {
				numberOfDmg++;
			} else if (eidolons[i].getType().equals("CRIT")) {
				numberOfCrit++;
			} else if (eidolons[i].getType().equals("HP")) {
				numberOfHp++;
			} else if (eidolons[i].getType().equals("EVA")) {
				numberOfEva++;
			} else {
				numberOfDef++;
			}
		}
		Eidolon[][] arrayByType = new Eidolon[5][];// itializes array of 5 rows
													// then sets each rows
													// length depending on type
		arrayByType[0] = new Eidolon[numberOfDmg];
		arrayByType[1] = new Eidolon[numberOfCrit];
		arrayByType[2] = new Eidolon[numberOfHp];
		arrayByType[3] = new Eidolon[numberOfEva];
		arrayByType[4] = new Eidolon[numberOfDef];

		for (int i = 0; i < eidolons.length; i++) {

			name = eidolons[i].getName();
			type = eidolons[i].getType();
			grade = eidolons[i].getGrade();
			stars = eidolons[i].getStars();
			level = eidolons[i].getLevel();
			hp = eidolons[i].getHp();
			atk = eidolons[i].getAtk();
			def = eidolons[i].getDef();
			crit = eidolons[i].getCrit();
			eva = eidolons[i].getEva();
			
			
			
			//System.out.println(eidolons[i].getType());
			if (eidolons[i].getType().equals("DMG")) {

				arrayByType[0][countDmg] = new Eidolon(name, type, grade, stars, level, hp, atk, def, crit, eva);
				countDmg++;
			} else if (eidolons[i].getType().equals("CRIT")) {

				arrayByType[1][countCrit] = new Eidolon(name, type, grade, stars, level, hp, atk, def, crit, eva);
				countCrit++;
			} else if (eidolons[i].getType().equals("HP")) {
				arrayByType[2][countHp] = new Eidolon(name, type, grade, stars, level, hp, atk, def, crit, eva);
				countHp++;
			} else if (eidolons[i].getType().equals("EVA")) {

				arrayByType[3][countEva] = new Eidolon(name, type, grade, stars, level, hp, atk, def, crit, eva);
				countEva++;
			} else {

				arrayByType[4][countDef] = new Eidolon(name, type, grade, stars, level, hp, atk, def, crit, eva);
				countDef++;
			}
			
		}
		for (int row = 0; row < 5; row++) {
			
			for (int col = 0; col < arrayByType[row].length; col++) {
				

				System.out.println("--------------------------" + types[row] + "------------------\n" + arrayByType[row][col]);
			}
			System.out.println();
		}

	}

	public String toString() {
		String str = "";
		for (int i = 0; i < eidolons.length; i++) {

			str += "\n" + eidolons[i];
		}
		return str;
	}
}
