package goit16java;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class OutputData {

    public String output() {
        User user = new User("Oleksandr", "Myronenko");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(user);
        return json;
    }
}
