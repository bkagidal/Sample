package com.lab.pc.tree;

public class NoOfUniqueBTS {

	public static int computeUniqueBSTS(int n, int[] solutions) {

		int result = 0;

		if (n < 0)
			return 0;
		else if (n == 1 || n == 0)
			return 1;

		for (int i = 0; i < n; i++) {

			if (solutions[i] == -1)
				solutions[i] = computeUniqueBSTS(i, solutions);

			if (solutions[n - 1 - i] == -1)
				solutions[n - 1 - i] = computeUniqueBSTS(n - 1 - i, solutions);

			result += solutions[i] * solutions[n - 1 - i];
		}

		return result;
	}

	public static void main(String[] args) {

		int n = 3;
		int[] solutions = new int[n];

		for (int i = 0; i < n; i++)
			solutions[i] = -1;

		System.out.println(computeUniqueBSTS(3, solutions));

	}

}
