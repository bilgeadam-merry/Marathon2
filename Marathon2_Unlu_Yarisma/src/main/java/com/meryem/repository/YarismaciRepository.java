package com.meryem.repository;

import com.meryem.entity.Yarismaci;

public class YarismaciRepository extends RepositoryManager<Yarismaci,Long> {
    public YarismaciRepository() {
        super(new Yarismaci());
    }
}
