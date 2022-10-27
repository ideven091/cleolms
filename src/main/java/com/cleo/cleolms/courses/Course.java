package com.cleo.cleolms.courses;

import com.cleo.cleolms.common.AbstractEntity;
import com.cleo.cleolms.users.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Course extends AbstractEntity implements Serializable {

    @Id @GeneratedValue private Long id;

    @NotNull
    @Column(nullable = false, unique = true)
    private String title;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private User author;


    private String course_contents;

    private String highlights;

    private Date start_date;

    private Float price;

    private int reviews;

    private int rating;




}
