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

    @Override
    public BucketEntity getBucketEntityById(int id) {
        BucketRepo bucketRepo = new BucketRepoImpl();
      BucketEntity bucketEntity =  bucketRepo.getBucketEntityById(id);
        return bucketEntity;
    }

    @Override
    public boolean uodateBucketEntityById(int id, String material) {
        BucketRepo bucketRepo = new BucketRepoImpl();
        bucketRepo.uodateBucketEntityById(id,material);
        return false;
    }

    @Override
    public void deleteBucketEntityById(int id) {
        BucketRepo bucketRepo = new BucketRepoImpl();
        bucketRepo.deleteBucketEntityById(id);

    }
}
