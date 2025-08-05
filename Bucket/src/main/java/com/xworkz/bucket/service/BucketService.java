package com.xworkz.bucket.service;

import com.xworkz.bucket.entity.BucketEntity;

public interface BucketService {

    void Save(BucketEntity bucketEntity);

    BucketEntity getBucketEntityById(int id);

    boolean uodateBucketEntityById(int id,String material);

    void deleteBucketEntityById(int id);

}
