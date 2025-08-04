package com.xworkz.bucket.repository;

import com.xworkz.bucket.entity.BucketEntity;
import com.xworkz.bucket.service.BucketServiceImpl;

public interface BucketRepo {

    void save(BucketEntity bucketEntity);
}
