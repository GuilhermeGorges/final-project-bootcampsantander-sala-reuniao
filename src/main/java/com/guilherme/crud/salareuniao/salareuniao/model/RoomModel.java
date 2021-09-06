package com.guilherme.crud.salareuniao.salareuniao.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="meetingroom")
public class RoomModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="date", nullable = false)
    private String date;

    @Column(name="startHour", nullable = false)
    private String startHour;

    @Column(name="endHour", nullable = false)
    private String endHour;

    @Override
    public String toString() {
        return "RoomModel[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", startHour='" + startHour + '\'' +
                ", endHour='" + endHour + '\'' +
                ']';
    }
}
