package exercici3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Exercici3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> countryCapitalMap = new HashMap<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader("countries.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 2) {
                    String country = parts[0].trim();
                    String capital = parts[1].trim();
                    countryCapitalMap.put(country, capital);
                }
            }
        } catch (IOException e) {
            System.out.println("Error llegint countries.txt");
            e.printStackTrace();
            return;
        }
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Introdueix el teu nom: ");
        String username = scanner.nextLine();
        
        List<String> countries = new ArrayList<>(countryCapitalMap.keySet());
        Collections.shuffle(countries);
        int score = 0;
        int totalQuestions = Math.min(10, countries.size());
        
        for (int i = 0; i < totalQuestions; i++) {
            String country = countries.get(i);
            String correctCapital = countryCapitalMap.get(country);

            System.out.print("Quina és la capital de " + country + "? ");
            String userAnswer = scanner.nextLine().trim();

            if (userAnswer.equalsIgnoreCase(correctCapital)) {
                System.out.println("Correcte");
                score++;
            } else {
                System.out.println("Incorrecte. La resposta correcta és: " 
            + correctCapital);
            }
        }
        
        System.out.println("\n" + username + ", la teva puntuació és: " 
        + score + "/" + totalQuestions);
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("classificacio.txt", true))) {
            bw.write(username + ": " + score + "/" + totalQuestions);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error escrivint al fitxer classificacio.txt");
            e.printStackTrace();
        }

        scanner.close();
    

	}

}


