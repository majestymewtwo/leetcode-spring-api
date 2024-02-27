package com.example.leetcodespringapi.service;

import com.example.leetcodespringapi.dto.request.Query;
import com.example.leetcodespringapi.dto.response.Data;
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
    public Data sendRequest(String username) throws IOException {
        Query query = new Query();
        query.getVariables().setUsername(username);

        URL url = new URL("https://leetcode.com/graphql");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("Accept", "application/json");
        connection.setDoOutput(true);
        String body = query.toString();
        OutputStream os = connection.getOutputStream();
        byte[] input = body.getBytes();
        os.write(input, 0, input.length);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8)
        );
        StringBuilder sb = new StringBuilder();
        String line = null;
        while((line = in.readLine()) != null) {
            sb.append(line.trim());
        }
        Gson gson = new Gson();
        return gson.fromJson(sb.toString(), Data.class);
    }
}
