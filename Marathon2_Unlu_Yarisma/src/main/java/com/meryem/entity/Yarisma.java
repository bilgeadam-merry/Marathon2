package com.meryem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.temporal.Temporal;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_yarisma")
public class Yarisma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Integer sure;
    String kazanan;
    Integer max_puan;
    @ManyToOne
    List<Yarismaci> yarismacilar;
    @ManyToOne
    List<Soru> sorular;
    @ManyToOne
    List<Cevap> cevaplar;

}
