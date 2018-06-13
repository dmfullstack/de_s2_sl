package com.stackroute.datamunger;

import java.util.Scanner;

import com.stackroute.datamunger.query.parser.QueryParser;


public class DataMunger {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String queryString;
		// read the query from the user
		System.out.println("Please enter your query:");
		System.out.println("");
		queryString = scanner.nextLine();
		QueryParser queryParser = new QueryParser();
		/*
		 * call parseQuery() method of the class by passing the query string which will
		 * return object of QueryParameter
		 */
		queryParser.parseQuery(queryString);
		

	}

}
