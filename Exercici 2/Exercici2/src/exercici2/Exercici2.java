package exercici2;

import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class Exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> mainList = new ArrayList<>();
        mainList.add(12);
        mainList.add(22);
        mainList.add(35);
        mainList.add(47);
        mainList.add(54);
        mainList.add(66);
        mainList.add(70);
        
        List<Integer> reversedList = new ArrayList<>();
        
        ListIterator<Integer> iter = mainList.listIterator(mainList.size());
        
        while (iter.hasPrevious()) {
            Integer value = iter.previous();
            reversedList.add(value);
        }
        
        System.out.println("Llista principal:");
        for (Integer num : mainList) {
            System.out.print(num + " ");
        }
        
        System.out.println("\n\nLlista invertida:");
        for (Integer num : reversedList) {
            System.out.print(num + " ");
        }

	}

}
