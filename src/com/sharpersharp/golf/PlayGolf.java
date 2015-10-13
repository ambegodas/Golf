/**
 * @autor pathmasri
 * Oct 13, 2015 10:43:42 PM
 */
package com.sharpersharp.golf;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class PlayGolf {

	public static void main(String args[]) {

		File f = new File(
				"/home/pathmasri/workspace/Golf/src/com/sharpersharp/golf/input.txt");
		Scanner sc;
		try {

			sc = new Scanner(f);

			int numberOfEvents = sc.nextInt();

			for (int k = 0; k < numberOfEvents; k++) {

				ArrayList<Star> stars = new ArrayList<Star>();
				ArrayList<Donor> donors = new ArrayList<Donor>();

				int startCount = sc.nextInt();
				int donorCount = sc.nextInt();

				for (int i = 0; i < startCount; i++) {
					stars.add(new Star(sc.next(), 0));
				}

				sc.nextLine();

				for (int i = 0; i < donorCount; i++) {
					String s[] = sc.nextLine().split(" ");
					ArrayList<String> startNames = new ArrayList<String>();
					for (int j = 1; j < s.length; j++) {
						startNames.add(s[j]);
					}
					Donor d = new Donor(s[0], startNames);
					donors.add(d);
				}

				System.out.println(getLowerBound(stars, donors));

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static int getLowerBound(ArrayList<Star> stars,
			ArrayList<Donor> donors) {

		int lowerbond = 0;
		for (Star s : stars) {
			String star = s.getName();
			java.util.Iterator<Donor> it = donors.iterator();

			while (it.hasNext()) {
				Donor d = it.next();
				if (d.getStars().contains(star) || d.getStars().size() == 0) {
					it.remove();
				}
			}
			if (donors.size() == 0) {
				lowerbond++;
				return lowerbond;
			}
			lowerbond++;
		}
		return lowerbond;
	}

}
