package com.example.leetcodespringapi.service;

import com.example.leetcodespringapi.dto.request.Query;
import com.example.leetcodespringapi.dto.response.Data;
import com.example.leetcodespringapi.dto.response.Response;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

@Service
public class LeetcodeService {
    public Response sendRequest(String username) throws IOException {
        Query query = new Query();
        query.getVariables().setUsername(username);
        Gson gson = new Gson();
        String json = gson.toJson(query);
        URL url = new URL("https://leetcode.com/graphql");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("Accept", "application/json");
        connection.setDoOutput(true);
        try(OutputStream os = connection.getOutputStream();) {
            byte[] input = json.getBytes();
            os.write(input, 0, input.length);
        }
        StringBuilder sb = new StringBuilder();
        try(BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8)
        );) {
            String line = null;
            while((line = in.readLine()) != null) {
                sb.append(line.trim());
            }
        }
        return gson.fromJson(sb.toString(), Response.class);
    }
}
