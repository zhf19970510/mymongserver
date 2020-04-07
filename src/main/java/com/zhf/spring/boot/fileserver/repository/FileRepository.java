package com.zhf.spring.boot.fileserver.repository;

import com.zhf.spring.boot.fileserver.domain.File;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author ZengHongFa
 * @create 2020/3/2 0002 20:41
 */
public interface FileRepository extends MongoRepository<File,String> {
}
