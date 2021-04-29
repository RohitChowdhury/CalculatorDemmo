package com.deep.demo;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.WriteResult;

public class Mongo {

	public static void main(String[] args) throws UnknownHostException {
		/*
		 * Calculate calculate = new Calculate(); String operation = ""; double result =
		 * 0; String parameters = "";
		 * 
		 * CalculationPojo obj = calculate.setObject(operation, result, parameters);
		 * DBObject doc = createDBObject(obj);
		 * 
		 * MongoClient mongo = new MongoClient("localhost", 27017); DB db =
		 * mongo.getDB("calculator"); System.out.println(db); DBCollection col =
		 * db.getCollection("History"); System.out.println(col);
		 * 
		 * List<String> dbs = mongo.getDatabaseNames(); System.out.println(dbs);
		 * Set<String> collections = db.getCollectionNames();
		 * System.out.println(collections);
		 */
		// create user

	}

	public void method1(String operation, double result, String parameters) throws UnknownHostException {
		Calculate calculate = new Calculate();
		CalculationPojo obj = calculate.setObject(operation, result, parameters);
		DBObject doc = createDBObject(obj);
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("calculator");
		DBCollection col = db.getCollection("History");
		WriteResult result2 = col.insert(doc);
		System.out.println(result2.getUpsertedId());
		System.out.println(result2.getN());
		System.out.println(result2.isUpdateOfExisting());
		System.out.println(result2.getLastConcern());

	}

	public String history(String operation, double result, String parameters) throws UnknownHostException {
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("calculator");
		DBCollection collection = db.getCollection("History");
		
		DBObject findOne2 = collection.findOne();
		Object object = findOne2.get("operation");
		String str = object.toString();
		List<String> s=new ArrayList<>();
		s.add(str);
		System.out.println(str);
		
		
		/*Calculate calculate = new Calculate();
		CalculationPojo obj = calculate.setObject(operation, result, parameters);
		DBObject doc = createDBObject(obj);
		DBObject findOne = collection.findOne(doc);
		System.out.println(findOne);
		findOne.get(key)*/

		DBCursor selectCollection = collection.find();
		Iterator<DBObject> it = selectCollection.iterator();
		while (it.hasNext()) {
			
			System.out.println(it.next());
		}
		return str ;

	}

	private static DBObject createDBObject(CalculationPojo obj) {
		BasicDBObjectBuilder docBuilder = BasicDBObjectBuilder.start();
		docBuilder.append("operation", obj.getOperation());
		docBuilder.append("parameters", obj.getParameters());
		docBuilder.append("result", obj.getResult());
		return docBuilder.get();
	}

	public CalculationPojo setObject(String operation, double result, String parameters) {
		CalculationPojo cpojo = new CalculationPojo();
		cpojo.setOperation(operation);
		cpojo.setParameters(parameters);
		cpojo.setResult(result);
		return cpojo;
	}

}
