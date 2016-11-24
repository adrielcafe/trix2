package trix2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by misael on 11/6/2016.
 */
public class Learn {
	public static void main(String args[] ) throws Exception {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		list1.add(5);
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(3);
		list1.add(3);
		list1.add(4);
		list1.add(5);

		list2.add(2);
		list2.add(3);

		find(list1, list2);
	}

	public static int find(ArrayList<Integer> list1, ArrayList<Integer> list2){
		for(int i = 0; i < list1.size(); i++){

			int j = i;
			int k = 0;

			while (list1.get(j).equals(list2.get(k))){
				Integer um = list1.get(j);
				Integer dois = list2.get(k);
				j++;k++;
				if(list2.size() == k){
					return i;
				}
			}
		}
		return  -1;
	}
}
