/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.GoogleAPIs;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author raghavi
 */
public class AddressConverter {

    /*
  * Geocode request URL. Here see we are passing "json" it means we will get
  * the output in JSON format. You can also pass "xml" instead of "json" for
  * XML output. For XML output URL will be
  * "http://maps.googleapis.com/maps/api/geocode/xml";
     */
    String lantLong = "";
    private static final String URL = "http://maps.googleapis.com/maps/api/geocode/json";

    /*
  * Here the fullAddress String is in format like
  * "address,city,state,zipcode". Here address means "street number + route"
  * .
     */
    public GoogleResponse convertToLatLong(String fullAddress) throws IOException {

        /*
   * Create an java.net.URL object by passing the request URL in
   * constructor. Here you can see I am converting the fullAddress String
   * in UTF-8 format. You will get Exception if you don't convert your
   * address in UTF-8 format. Perhaps google loves UTF-8 format. :) In
   * parameter we also need to pass "sensor" parameter. sensor (required
   * parameter) — Indicates whether or not the geocoding request comes
   * from a device with a location sensor. This value must be either true
   * or false.
         */
        URL url = new URL(URL + "?address="
                + URLEncoder.encode(fullAddress, "UTF-8") + "&sensor=false");
        // Open the Connection
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");

        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
        }
        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

        String output = "", full = "";
        while ((output = br.readLine()) != null) {
            // System.out.println(output);
            full += output;
        }
        GoogleResponse googleResponse = new Gson().fromJson(full, GoogleResponse.class);

        return googleResponse;

    }
    GoogleResponse res;
    GoogleResponse res1;

    public String getLocation(String location) {

        try {
            res = new AddressConverter().convertToLatLong(location);
        } catch (IOException ex) {
            Logger.getLogger(AddressConverter.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (res.getStatus().equals("OK")) {
            for (Result result : res.getResults()) {

                //System.out.println("Lattitude of address is :"  +result.getGeometry().getLocation().getLat());
                String latitude = result.getGeometry().getLocation().getLat();
                //System.out.println("Longitude of address is :" + result.getGeometry().getLocation().getLng());
                String longitude = result.getGeometry().getLocation().getLng();
                //System.out.println("Location is " + result.getGeometry().getLocation_type());
                lantLong = latitude + ',' + longitude;
            }
        } else {
            System.out.println(res.getStatus());
        }

        return lantLong;

    }
}
