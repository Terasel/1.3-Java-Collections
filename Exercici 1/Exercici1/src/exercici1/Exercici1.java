package exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Month> months = new ArrayList<>();
		
		months.add(new Month("Gener"));
        months.add(new Month("Febrer"));
        months.add(new Month("Març"));
        months.add(new Month("Abril"));
        months.add(new Month("Maig"));
        months.add(new Month("Juny"));
        months.add(new Month("Juliol"));
        months.add(new Month("Setembre"));
        months.add(new Month("Octubre"));
        months.add(new Month("Novembre"));
        months.add(new Month("Desembre"));
        
        months.add(7, new Month("Agost"));
        
        System.out.println("Mesos per ordre:");
        for (Month mes : months) {
            System.out.println(mes.getName());
        }
        
        Set<Month> monthSet = new HashSet<>(months);
        
        monthSet.add(new Month("Agost"));
        
        System.out.println("\nHashSet:");
        for (Month m : monthSet) {
            System.out.println(m.getName());
        }
        
        System.out.println("\nRecorregut amb For:");
        for (Month m : months) {
            System.out.println(m.getName());
        }
        
        System.out.println("\nRecorregut amb Iterator:");
        Iterator<Month> it = months.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getName());
        }

	}

}
