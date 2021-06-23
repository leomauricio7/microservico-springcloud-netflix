package com.github.leomauricio.crud.exception;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class ExeceptionResponse implements Serializable {

    private static final long serialVersionUID = 5786970522747544021L;

    private Date timestamp;
    private String message;
    private String details;
}
