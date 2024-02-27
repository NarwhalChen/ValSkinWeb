package com.example.valskin.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SkinResource")
public class SkinResource {

    @Id
    @Column(name = "skinResourceId")
    private Integer skinResourceId;

    @Column(name = "pictureUrl")
    private String pictureUrl;

    @Column(name = "videoUrl")
    private String videoUrl;

    // getters and setters
}
