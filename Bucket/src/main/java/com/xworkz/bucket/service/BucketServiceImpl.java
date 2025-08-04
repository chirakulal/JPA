package com.xworkz.bucket.service;

import com.xworkz.bucket.entity.BucketEntity;
import com.xworkz.bucket.repository.BucketRepo;
import com.xworkz.bucket.repository.BucketRepoImpl;

public class BucketServiceImpl implements BucketService{
    @Override
    public void Save(BucketEntity bucketEntity) {
        BucketRepo bucketRepo = new BucketRepoImpl();
        bucketRepo.save(bucketEntity);

    }
}
