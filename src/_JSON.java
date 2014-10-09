import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

public class _JSON {
	String _data;
	Gson _json = new Gson();
	JsonArray _array;

	public _JSON(String data) {
		// String uri = "([-+*/^()\\]\\[])";
		// _data = data.replaceAll(uri, "");
		_data = data;
	}

	public JsonArray _GetJsonData() {
		JsonParser parser = new JsonParser();
		_array = parser.parse(_data).getAsJsonArray();
//		_array.get(0).getAsJsonObject();
		return _array;
	}
}
