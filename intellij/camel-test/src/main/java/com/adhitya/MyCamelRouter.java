package com.adhitya;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.csv.CsvDataFormat;
import org.springframework.stereotype.Component;

@Component
public class MyCamelRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        routeTemplate("fileRouteTemplate")
                .templateParameter("fileName")
                .templateParameter("fileType")
                .from("file:input?fileName={{fileName}}&noop=true")
                    .routeId("{{fileName}}Route")
                    .log("File found: ${header.CamelFileName}")
                    .choice()
                        //.when(simple("${header.CamelFileNameOnly} ends with '{{fileType}}'"))
                        .when(simple(" ${header.fileType} == 'psv'"))
                            .unmarshal(new CsvDataFormat().setDelimiter('|').setSkipHeaderRecord(true))
                        .otherwise()
                            .unmarshal(new CsvDataFormat().setSkipHeaderRecord(true))
                    .end()
                    .log("Unmarshalled ${header.CamelFileName}: ${body}")
                    .to("log:bar");
    }
}