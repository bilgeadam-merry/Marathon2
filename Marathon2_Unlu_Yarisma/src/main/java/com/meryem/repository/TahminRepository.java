package com.meryem.repository;

import com.meryem.entity.Tahmin;

public class TahminRepository extends RepositoryManager<Tahmin,Long>{
    public TahminRepository() {
        super(new Tahmin());
    }
}
