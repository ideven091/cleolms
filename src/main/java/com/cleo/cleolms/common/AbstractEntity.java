package com.cleo.cleolms.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(value = {  "createdDate",  "date_updated" }, allowGetters = true)

public abstract class AbstractEntity implements Serializable {

    public abstract Long getId();

    private Instant createdDate = Instant.now();

    private Date date_updated;

    @PreUpdate
    public void onUpdate(){
        this.date_updated = new Date();
    }
}
