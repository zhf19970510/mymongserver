package com.zhf.spring.boot.fileserver.service;
import com.zhf.spring.boot.fileserver.domain.File;

import java.util.List;
import java.util.Optional;
/**
 * File 服务接口.
 * @author ZengHongFa
 * @create 2020/3/2 0002 21:00
 */
public interface FileService {
    /**
     * 保存文件
     * @param file
     * @return
     */
    File saveFile(File file);

    /**
     * 删除文件
     * @param id
     * @return
     */
    void removeFile(String id);

    /**
     * 根据id获取文件
     * @param id
     * @return
     */
    Optional<File> getFileById(String id);

    /**
     * 分页查询，按上传时间降序
     * @param pageIndex
     * @param pageSize
     * @return
     */
    List<File> listFilesByPage(int pageIndex, int pageSize);
}
