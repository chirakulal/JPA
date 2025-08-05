package com.xworkz.bucket.runner;

import com.xworkz.bucket.entity.BucketEntity;
import com.xworkz.bucket.service.BucketService;
import com.xworkz.bucket.service.BucketServiceImpl;

public class Runner {

    public static void main(String[] args) {

        System.out.println("running............");
        BucketEntity bucket = new BucketEntity(0,500,"plastic","pavan");
        BucketEntity bucket1 = new BucketEntity(1,800,"plastic","cello");
        System.out.println(bucket);
        BucketService bucketService = new BucketServiceImpl();
//        bucketService.Save(bucket1);
//        bucketService.Save(bucket1);
   BucketEntity bucketEntity = bucketService.getBucketEntityById(1);
   System.out.println(bucketEntity);
//        bucketService.uodateBucketEntityById(1,"steel");
//        bucketService.deleteBucketEntityById(1);


    }

    }
