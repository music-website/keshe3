package com.jfrao.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter@Getter@ToString
public class WebInformation {

    private Integer id;
    private String title;
    private String date;
    private String type;
    private String context;
    private String source;

}
