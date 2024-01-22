package com.meryem.repository;

import com.meryem.entity.Yarisma;

public class YarismaRepository extends RepositoryManager<Yarisma,Long>{
    public YarismaRepository() {
        super(new Yarisma());
    }
}
