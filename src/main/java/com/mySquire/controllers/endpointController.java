package com.mySquire.controllers;

import com.mySquire.services.DataSetUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@RestController
@RequestMapping("/squire")
public class endpointController {
    @Autowired
    DataSetUrlService service;

    @GetMapping("/sparql-endpoint")
    public String getDatasetUrl() throws UnsupportedEncodingException {

return service.getDatasetUrl();

}
}
