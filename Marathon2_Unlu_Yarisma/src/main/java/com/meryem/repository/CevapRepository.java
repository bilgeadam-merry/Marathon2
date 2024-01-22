package com.meryem.repository;

import com.meryem.entity.Cevap;

public class CevapRepository extends RepositoryManager<Cevap,Long>{
    public CevapRepository() {
        super(new Cevap());
    }
}
