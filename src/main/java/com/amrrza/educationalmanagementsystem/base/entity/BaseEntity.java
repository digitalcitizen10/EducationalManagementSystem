package com.amrrza.educationalmanagementsystem.base.entity;

import javax.persistence.*;
import javax.persistence.GenerationType;
import java.io.Serializable;

@MappedSuperclass
public class BaseEntity<ID extends Serializable> implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private ID id;

//    @Column(name = IS_DELETED, columnDefinition = "TINYINT(1)")
//    private Boolean isDeleted;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

}


