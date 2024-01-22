package com.meryem.repository;

import com.meryem.entity.Soru;

public class SoruRepository extends RepositoryManager<Soru,Long>{
    public SoruRepository(){
        super(new Soru());
    }
}
