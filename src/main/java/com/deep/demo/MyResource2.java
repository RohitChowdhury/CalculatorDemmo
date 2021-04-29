package com.deep.demo;

import java.net.UnknownHostException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import javax.ws.rs.PathParam;

@Path("myresource2")
public class MyResource2 {
	CalculationPojo cpojo = new CalculationPojo();
	Calculate calc = new Calculate();
	String operation;
	Mongo mongo = new Mongo();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("add/{parameters}")
	public CalculationPojo add(@PathParam("parameters") String parameters) throws UnknownHostException {
		operation = "Addition";
		double result = calc.addition(parameters);
		mongo.setObject(operation, result, parameters);
		mongo.method1(operation, result, parameters);
		return calc.setObject(operation, result, parameters);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("max/{parameters}")
	public CalculationPojo max(@PathParam("parameters") String parameters) throws UnknownHostException {
		operation = "Maximum Value";
		double result = calc.max(parameters);
		mongo.setObject(operation, result, parameters);
		mongo.method1(operation, result, parameters);
		return calc.setObject(operation, result, parameters);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("min/{parameters}")
	public CalculationPojo min(@PathParam("parameters") String parameters) throws UnknownHostException {
		operation = "Minimum Value";
		double result = calc.min(parameters);
		mongo.setObject(operation, result, parameters);
		mongo.method1(operation, result, parameters);
		return calc.setObject(operation, result, parameters);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("avg/{parameters}")
	public CalculationPojo avarage(@PathParam("parameters") String parameters) throws UnknownHostException {
		operation = "Avarage Value";
		double result = calc.avg(parameters);
		mongo.setObject(operation, result, parameters);
		mongo.method1(operation, result, parameters);
		return calc.setObject(operation, result, parameters);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("sqr/{parameters}")
	public CalculationPojo square(@PathParam("parameters") String parameters) throws UnknownHostException {
		operation = "Square Value";
		double result = calc.square(parameters);
		mongo.setObject(operation, result, parameters);
		mongo.method1(operation, result, parameters);
		return calc.setObject(operation, result, parameters);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("root/{parameters}")
	public CalculationPojo squareRoot(@PathParam("parameters") String parameters) throws UnknownHostException {
		operation = "SquareRoot Value";
		double result = calc.root(parameters);
		mongo.setObject(operation, result, parameters);
		mongo.method1(operation, result, parameters);
		return calc.setObject(operation, result, parameters);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("abs/{parameters}")
	public CalculationPojo absoluteValue(@PathParam("parameters") String parameters) throws UnknownHostException {
		operation = "Absolute Value";
		double result = calc.absoluteDifference(parameters);
		mongo.setObject(operation, result, parameters);
		mongo.method1(operation, result, parameters);
		return calc.setObject(operation, result, parameters);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("div/{parameters}")
	public CalculationPojo divide(@PathParam("parameters") String parameters) throws UnknownHostException {
		operation = "Divided Value";
		double result = calc.division(parameters);
		mongo.setObject(operation, result, parameters);
		mongo.method1(operation, result, parameters);
		return calc.setObject(operation, result, parameters);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("sub/{parameters}")
	public CalculationPojo substract(@PathParam("parameters") String parameters) throws UnknownHostException {
		operation = "Substracted Value";
		double result = calc.substraction(parameters);
		mongo.setObject(operation, result, parameters);
		mongo.method1(operation, result, parameters);
		return calc.setObject(operation, result, parameters);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("history")
	public String history(@PathParam("parameters") String parameters) throws UnknownHostException{
		double result=1;
		mongo.setObject(operation, result, parameters);
		return mongo.history(operation, result, parameters);
		}
}
