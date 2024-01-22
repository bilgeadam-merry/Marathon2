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
@Table(name = "tbl_yarismaci")
public class Yarismaci {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String ad;
    String soyad;
    Integer yas;
    Cinsiyet cinsiyet;
    Integer toplamPuan;
    String telefon;
    String email;
    Integer kullanilanSure;
    @OneToMany
    Yarisma yarisma;
    @ManyToOne
    List<Tahmin> tahminler;
}
