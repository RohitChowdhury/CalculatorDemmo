package com.deep.demo;

import java.util.ArrayList;

import java.util.List;
import java.util.NoSuchElementException;

public class Calculate {
	// Calculate calculate = new Calculate();
	List<Integer> l1 = new ArrayList<>();

	public List<Integer> toIntegerList(String parameters) {
		String[] param = parameters.split(",");
		int size = param.length;
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(param[i]);
			l1.add(arr[i]);
		}
		return l1;
	}

	public int addition(String parameters) {

		toIntegerList(parameters);
		int result = l1.stream().mapToInt(Integer::intValue).sum();
		// int sum = primes.stream().mapToInt(a->a).sum();
		return result;
	}

	public double substraction(String parameters) {
		String[] param = parameters.split(",");
		int size = param.length;
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(param[i]);
		}
		int res=arr[0]-arr[1];
		Double res2=Double.valueOf(res);
		return res2;
	}

	public double max(String parameters) {
		toIntegerList(parameters);
		// double max = l1.stream().max(Comparator.comparing(i -> i));
		double max = l1.stream().mapToInt(a -> a).max().orElseThrow(NoSuchElementException::new);
		return max;
	}

	public double min(String parameters) {
		toIntegerList(parameters);
		// Optional<Integer> min = l1.stream().min(Comparator.comparing(i -> i));
		double min = l1.stream().mapToInt(a -> a).min().orElse(0);
		return min;
	}

	public double avg(String parameters) {
		toIntegerList(parameters);
		double average = l1.stream().mapToInt(a -> a).average().orElse(0);
		return average;
	}

	public double square(String parameters) {
		toIntegerList(parameters);
		double sqr2 = 0;
		// double sqr = l1.stream().mapToDouble(map(n->n*n));
		// double sqr2 = l1.stream().distinct().forEach(n->Math.pow(n, 2));
		for (Integer num : l1) {
			sqr2 = (num * num);
		}
		return sqr2;
	}

	public double root(String parameters) {
		toIntegerList(parameters);
		double sqrRoot = 0;
		// List<Double> sqrRoot = l1.stream().map(x ->
		// Math.sqrt(x)).collect(Collectors.toList());
		for (Integer num : l1) {
			sqrRoot = Math.sqrt(num);
		}
		return sqrRoot;
	}

	public double absoluteDifference(String parameters) {
		toIntegerList(parameters);
		double absDiff = 0;
		// List<Integer> absDiff = l1.stream().map(x ->
		// Math.abs(x)).collect(Collectors.toList());
		for (Integer num : l1) {
			absDiff = Math.abs(num);
		}
		return absDiff;

	}

	public double division(String parameters) {
		String[] param = parameters.split(",");
		int size = param.length;
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(param[i]);
		}
		int res=arr[0]/arr[1];
		Double res2=Double.valueOf(res);
		return res2;
	}

	public CalculationPojo setObject(String operation, double result, String parameters) {
		CalculationPojo cpojo = new CalculationPojo();
		cpojo.setOperation(operation);
		cpojo.setParameters(parameters);
		cpojo.setResult(result);
		return cpojo;
	}
}
