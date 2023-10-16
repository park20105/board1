package com.study.board.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // strategy를 GenerationType.IDENTITY로 해준다. (MySQL, MariaDB / SEQUENCE는 오라클 용 / AUTO는 자동지정)
    private Integer id;
    private String title;
    private String content;
    private String filename;
    private String filepath;
}
