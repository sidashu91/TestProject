package infosys_Code;

import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class TestClass {
	public static void main(String[] args) {
		UnitOfMeasure unit = new UnitOfMeasure();

		String code = unit.getCode();
		String name = unit.getName();
		double price = unit.getPrice();
		double quantity = unit.getQuantity();

		JSONParser parser = new JSONParser();

		try {

			Object obj = parser
					.parse(new FileReader("D:\\Java\\Workspace\\JSON_RelatedProject\\src\\infosys_Code\\file.json"));
			JSONObject jsonObject = (JSONObject) obj;

			// A JSON array. JSONObject supports java.util.List interface.
			/* JSONArray itemList */ List<JSONArray> itemList = (JSONArray) jsonObject.get("items");

			// An iterator over a collection. Iterator takes the place of Enumeration in the
			// Java Collections Framework.
			// Iterators differ from enumerations in two ways:
			// 1. Iterators allow the caller to remove elements from the underlying
			// collection during the iteration with well-defined semantics.
			// 2. Method names have been improved.

			Iterator<JSONArray> iterator = itemList.iterator();
			while (iterator.hasNext()) {

				System.out.println(iterator.next());
				
			}

		} catch (

		Exception e) {
			// TODO: handle exception
		}

	}

}
