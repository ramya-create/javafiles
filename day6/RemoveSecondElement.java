package day6;

import java.util.ArrayList;

import java.util.List;

public class RemoveSecondElement {

	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		System.out.println(myList);

		removeEverySecondList(myList);

		System.out.println(myList);
	}

	private static void removeEverySecondList(List<Integer> list) {

		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {

			if (i % 2 == 0) {

				result.add(list.get(i));

			}

		}

		list.clear();

		list.addAll(result);

	}
}