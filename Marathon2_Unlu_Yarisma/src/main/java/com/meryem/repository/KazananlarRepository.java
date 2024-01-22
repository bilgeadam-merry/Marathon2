package com.meryem.repository;

import com.meryem.entity.Kazananlar;

public class KazananlarRepository extends RepositoryManager<Kazananlar,Long>{
    public KazananlarRepository() {
        super(new Kazananlar());
    }
}
