package com.mySquire.controllers;

import com.mySquire.services.DataSetUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.QueryParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@RestController
@RequestMapping("/squire/sparql-endpoint")
public class endpointController {
    @Autowired
    DataSetUrlService service;

    @GetMapping("/select/{query}")
    public String select(@PathVariable(value = "query") String query) throws UnsupportedEncodingException {
        return service.endpointDataUrlService(query);
    }


    @GetMapping("/ask/{query}")
    public String ask(@PathVariable(value = "query") String query) throws UnsupportedEncodingException {
        return service.endpointDataUrlService(query);
    }


}





//    private Client client = ClientBuilder.newClient();

//    public String getDatasetUrl() throws UnsupportedEncodingException {
//        //String params = URLEncoder.encode("SELECT DISTINCT ?s ?p ?o WHERE {?s ?p ?o.} LIMIT 1", "UTF-8");
//        String params = URLEncoder.encode("SELECT DISTINCT ?s ?p ?o WHERE {?s ?p ?o.} LIMIT 1", "UTF-8");
//        //System.out.println(params);
//        String REST_URI = "http://opendatacommunities.org/sparql.json?query="+ params;
//        return client
//                .target(REST_URI)
////                .path(String.valueOf(id))
//                .request(MediaType.APPLICATION_JSON)
//                .get(String.class);
//    }






//}

//    SELECT DISTINCT ?s ?p ?o WHERE {?s ?p ?o.}?



//    private Client client = ClientBuilder.newClient();
//
//    public String getDatasetUrl() throws UnsupportedEncodingException {
//        String params = URLEncoder.encode("SELECT DISTINCT ?s ?p ?o WHERE {?s ?p ?o.} LIMIT 1", "UTF-8");
//        String REST_URI = "http://opendatacommunities.org/sparql.json?query=" + params;
//        return client
//                .target(REST_URI)
////                .path(String.valueOf(id))
//                .request(MediaType.APPLICATION_JSON)
//                .get(String.class);
//    }

