package com.jfrao.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@ToString
public class PageList {
    int currentPage;
    List<WebInformation> currentTitle = new ArrayList<>();
}
