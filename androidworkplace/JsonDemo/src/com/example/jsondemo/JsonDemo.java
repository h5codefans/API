package com.example.jsondemo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
 
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class JsonDemo extends Activity {
    /*
     * ����JSON�����ӣ�str�������JSON���룬�������������LogCat����� 
    */
     
    String TAG = "Json message";
     
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        detectJSON();
    }
     
    private void detectJSON() {
        String str = "{"+
         
          "\"����\" : \"2011-06-06\","+
 
          //Like �� JSONObject
          "\"Like\" : {"+
            "\"Name\" : \"������\","+
            "\"Height\" : \"2.11cm\","+ 
            "\"Age\" : 35"+
          "},"+
         
          //LikeList ����һ�� JSONObject
          "\"LikeList\":" +
              "{\"List\": " +
              "["+
                  //����Ҳ��JSONObject
                  "{"+
                    "\"Name\" : \"Rose\","+
                    "\"Height\" : \"190cm\","+ 
                    "\"Age\" : 23"+
                  "},"+
                  //����Ҳ��JSONObject
                  "{"+
                    "\"Name\" : \"�Ʊ�\","+
                    "\"Height\" : \"198cm\","+ 
                    "\"Age\" : 33"+
                  "}"+
              "]"+
              "}"+
          "}";
         
        try {
            JSONObject dataJson = new JSONObject(str);
            Log.d(TAG, dataJson.getString("����"));
             
            JSONObject nbaJson = dataJson.getJSONObject("Like");
         
            Log.d(TAG, nbaJson.getString("Name"));
            Log.d(TAG, nbaJson.getString("Height"));
            Log.d(TAG, nbaJson.get("Age").toString());
             
            JSONObject listJson = dataJson.getJSONObject("LikeList");
            JSONArray arrayJson = listJson.getJSONArray("List");
             
            for(int i=0;i<arrayJson.length();i++) {
                 
                JSONObject tempJson = arrayJson.optJSONObject(i);
                 
                Log.d(TAG, tempJson.getString("Name"));
                Log.d(TAG, tempJson.getString("Height"));
                Log.d(TAG, tempJson.getString("Age").toString());   
            }
             
             
        } catch (JSONException e) {
            System.out.println("Something wrong...");
            e.printStackTrace();
        }
    }
}
