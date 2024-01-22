package com.meryem.entity;

import com.meryem.entity.enumm.Cinsiyet;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_soru")
public class Soru {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Cinsiyet cinsiyet;
    Integer yas;
    String meslek;
    Integer boy;
    Integer kilo;
    String yasadigiYer;
    Integer puan;
    String ektraIpucu;
    @OneToMany
    Yarisma yarisma;
    @OneToOne
    Cevap cevap;
    @ManyToOne
    List<Tahmin> tahminler;

}
