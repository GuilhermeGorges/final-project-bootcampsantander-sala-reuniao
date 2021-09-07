package com.guilherme.crud.salareuniao.salareuniao.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class ErrorDetails {

    private Date timeStamp;
    private String massege;
    private String details;

}
