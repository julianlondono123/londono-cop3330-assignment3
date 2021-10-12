package ex44;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Product_SearchTest {

    @Test
    void check_inventory() {
        Product_Search app = new Product_Search();
        JSONObject jo = new JSONObject();
        jo.put("name", "iphone");
        jo.put("price", 5);
        jo.put("quantity", 5);

        JSONArray ja = new JSONArray();
        ja.add(jo);

        assertEquals(Product_Search.check_inventory(ja, "iphone").contains("iphone"), true);

    }

}